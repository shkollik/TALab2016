package ua.epam;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.ParseException;


public class Main {

    public static void main(String[] args) throws ParseException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        // Create instance and call method before reflection
        NoteBook noteBook = new NoteBook();
        System.out.println(noteBook.calculteNumberOfDaysTillBirthDay("12.02.2016", "15.02.2016", "dd.mm.yyyy"));

        //reflection
        Class parentClass = Date.class;
        Class childClass = NoteBook.class;
        MethodsForReflection methods = new MethodsForReflection();

        // Task 1 Get Constructors With Parameters
        Constructor[] parentConstructors = parentClass.getConstructors();
        Constructor[] childConstructors = childClass.getConstructors();

        methods.showConsructors(parentConstructors);
        methods.showConsructors(childConstructors);

        //Task 2 Get Class Modifiers
        int parentClassModifier = parentClass.getModifiers();
        int childModifier = childClass.getModifiers();

        methods.showClassModifier(parentClassModifier);
        methods.showClassModifier(childModifier);

        //Task 3 Annotation and method invoke

        // Get info about methods(names, return type, arguments) to pick one for invoke
        Method[] methodz = childClass.getDeclaredMethods();
        for (Method method : methodz) {
            System.out.println("Name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            System.out.print("ParamTypes: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

        //Invoke method that was marked by annotation
        Class[] paramTypes = new Class[] { String.class, String.class, String.class };
        Method method = childClass.getMethod("calculteNumberOfDaysTillBirthDay", paramTypes);
        Object obj = childClass.newInstance();
        Object[] arguments = new Object[] { new String("12.04.2015"), new String("20.04.2015"), new String("dd.mm.yyyy") };
        int res = (int) method.invoke(obj, arguments);
        System.out.println(res);




    }




}





