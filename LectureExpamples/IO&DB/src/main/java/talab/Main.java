package talab;

import java.io.*;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class Main {
    public static final String TEXT_FILE_NAME = "d:/file.txt";
    public static final String BINARY_FILE_NAME = "d:/file_bin.txt";
    public static void main(String[] args) {
        Entity instance = new Entity("hello", "world", 100);

        try(Writer out = new BufferedWriter(new FileWriter(TEXT_FILE_NAME))){
            out.write(instance.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectOutputStream ous = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(BINARY_FILE_NAME)))) {
            ous.writeObject(instance);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } ;

        instance = null;

        try(ObjectInputStream ous = new ObjectInputStream(new BufferedInputStream(new FileInputStream(BINARY_FILE_NAME)))) {
            instance = (Entity) ous.readObject();
            System.out.println(instance);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        };

    }

}
