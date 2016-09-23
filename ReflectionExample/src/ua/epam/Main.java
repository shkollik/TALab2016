package ua.epam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.ParseException;


public class Main {

    public static void main(String[] args) throws ParseException {

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

    }




}





