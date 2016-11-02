package ua.talab;

/**
 * Created by Shkolik on 22.09.2016.
 */
public class View {

    public static final String SURNAME = "Your surname";
    public static final String FIRSTNAME = "Your name";
    public static final String DADDYNAME = "Your daddy name";
    public static final String NICKNAME = "Your nickName";
    public static final String COMMENTS = "Your comments";
    public static final String GROUP = "Your group (Home, Friends or Job)";
    public static final String HOMEPHONE = "Your home phone number '(code)number'";
    public static final String MOBILE = "Your mobile number '(code)**-**-***' OR *{10} OR +countryCode*{10}";
    public static final String SECONDMOBILE = "Your second mobile number";
    public static final String EMAIL = "Your email";
    public static final String SKYPE = "Your skype";
    public static final String ADDRESS = "Your address 'index city street houseNumber flatNumber'";
    public static final String FIRSTINPUTDATE = "Your first input dd:mm:yyyy";
    public static final String LASTCHANGESDATE = "Your last changes dd:mm:yyyy";



    public static final String ERROR = "Smth went wrong. Try again pls";


    public static void printMessage(String s){
        System.out.println(s);
    }
}
