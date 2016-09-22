package ua.epam.controller;

import ua.epam.View;
import ua.epam.model.Address;
import ua.epam.model.GeneralModel;
import java.util.Scanner;

/**
 * Created by Shkolik on 22.09.2016.
 */
public class Controller {
    GeneralModel model;
    View view;

    InputRegForm regForm;

    public void proccessUser() {
        Scanner sc = new Scanner(System.in);
        regForm = new InputRegForm();
        model = new GeneralModel();

        regForm.setSurname(checkRegex(sc, View.SURNAME, RegularExpressions.REGEX_NAME));
        regForm.setName(checkRegex(sc, View.FIRSTNAME, RegularExpressions.REGEX_NAME));
        regForm.setDaddyName(checkRegex(sc, View.DADDYNAME, RegularExpressions.REGEX_NAME));
        regForm.setNickName(checkRegex(sc, View.NICKNAME, RegularExpressions.REGEX_NICKNAME));
        regForm.setComments(checkRegex(sc, View.COMMENTS, RegularExpressions.REGEX_COMMENTS));
        regForm.setGroup(checkRegex(sc, View.GROUP, RegularExpressions.REGEX_GROUP));
        regForm.setPhoneNumberHome(checkRegex(sc, View.HOMEPHONE, RegularExpressions.REGEX_HOMEPHONE));
        regForm.setPhoneNumberMobile(checkRegex(sc, View.MOBILE, RegularExpressions.REGEX_MOBILEPHONE));
        regForm.setPhoneNumberSecondMobile(checkRegex(sc, view.SECONDMOBILE, RegularExpressions.REGEX_MOBILEPHONE));
        regForm.setEmail(checkRegex(sc, View.EMAIL, RegularExpressions.REGEX_EMAIL));
        regForm.setSkype(checkRegex(sc, View.SKYPE, RegularExpressions.REGEX_SKYPE));
        regForm.setAddress(new Address(checkRegex(sc, View.ADDRESS, RegularExpressions.REGEX_ADDRESS)));
        regForm.setFirstInsertDate(checkRegex(sc, View.FIRSTINPUTDATE, RegularExpressions.REGEX_DATE));
        regForm.setLastChangeDate(checkRegex(sc, View.LASTCHANGESDATE, RegularExpressions.REGEX_DATE));

        view.printMessage(model.createRecord(regForm).toString());


    }

    public String checkRegex(Scanner sc, String message, String regex) {
       String temp = inputValueWithScanner(sc, message);
        while (true) {
            if (temp.matches(regex)) {
                return temp;
            }
            else{
                view.printMessage(View.ERROR);
                temp = inputValueWithScanner(sc, message);
            }
        }

    }

    public String inputValueWithScanner(Scanner sc, String message) {
        view.printMessage(message);
        while (!sc.hasNextLine()) {
            view.printMessage(View.ERROR);
            sc.nextLine();
        }
        return sc.nextLine();
    }

}
