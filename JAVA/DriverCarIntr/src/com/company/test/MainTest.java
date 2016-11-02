package com.company.test;

import com.company.entities.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 9/26/2016.
 */
public class MainTest {

    List<DriverLicense.Category> categoriesList;
    static Human john;
    static Driver johnDriver;
    static GasolineCar car;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @BeforeClass
    public static void  InstancesBeforeTests(){
        List<DriverLicense.Category> categoriesList = new ArrayList<DriverLicense.Category>();
        categoriesList.add(DriverLicense.Category.A);

        john = new Human(null, new Date() , Human.Gender.MALE , Human.BloodGroup.FIRST);
        johnDriver = new Driver(john ,new DriverLicense(new Date(100,12,11),
                DriverLicense.Category.C , new Date(100,12,12)));
        car = new GasolineCar("ZAZ", "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
    }

    @Test
    public void TestExpireDateIsMoreThenIssueDate(){
        expectedException.expect(Exception.class);

        Date fromDate = new Date(100,12,11);
        Date expDate = new Date(100,12,12);
        DriverLicense driverLicense = new DriverLicense(expDate, categoriesList, fromDate);

        Assert.assertTrue(driverLicense.getExpires().after(driverLicense.getFromDate()));
    }

    @Test
    public void TestNull(){
        expectedException.expect(Exception.class);

        this.car = new GasolineCar(null, "AA5555AA", "100500" , DriverLicense.Category.C ,
                1499 , 80 , GasolineCar.Transmission.AUTOMATIC);
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
    }

    @Test
    public void TestCategoryDiffers(){
        expectedException.expect(Exception.class);

        this.johnDriver = new Driver(john ,new DriverLicense(new Date(100,12,11),
                DriverLicense.Category.A , new Date(100,12,12)));
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
    }


    @Test
    public void TesCategotyANotForTruck(){
        expectedException.expect(Exception.class);

        this.johnDriver = new Driver(john ,new DriverLicense(new Date(),
                DriverLicense.Category.A , new Date()));
        Route route = new Route(car , johnDriver , "Troeshina" , "Klovska");
    }












}