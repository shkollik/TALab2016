package ua.epam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Created by Vladyslav_Shkola on 9/23/2016.
 */
public class MethodsForReflection {
    public void showConsructors(Constructor [] constructors){
        System.out.println("Constructors and their parametres:");
        for (Constructor constructor : constructors) {
            System.out.println("Constructor : " + constructor);
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print("parametres of constructor: " + paramType.getName() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void showClassModifier(int modifier) {
        if (Modifier.isPublic(modifier)) {
            System.out.println("Modifier of class is " + "public");
        }
        if (Modifier.isAbstract(modifier)) {
            System.out.println("Modifier of class is " + "abstract");
        }
        if (Modifier.isFinal(modifier)) {
            System.out.println("Modifier of class is " + "final");
        }
    }

}
