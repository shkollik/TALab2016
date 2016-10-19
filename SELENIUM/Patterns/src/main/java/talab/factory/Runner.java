package talab.factory;

/**
 * Created by Vladyslav_Shkola on 10/18/2016.
 */
public class Runner {
    private static String url = "http://github.com";

    public static void main(String[] args) {
        //WebDriverCreator creator = new FireFoxCreator();
        WebDriverCreator creator = new ChromeCreator();
        creator.factoryMethod().get(url);

    }



}
