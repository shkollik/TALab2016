package talab.singleton.utils;

/**
 * Created by Vladyslav_Shkola on 10/19/2016.
 */
public class SetDriver {
    private static String driversFolder = "src/main/java/resources/drivers/";

    public static void setFireFoxDriver() throws Exception {
        setPath("gecko");
    }

    public static void setChromeDriver() throws Exception {
        setPath("chrome");

    }

    public static void setPath(String driver) throws Exception {
        String os = System.getProperty("os.name");
        StringBuffer binaryPath = new StringBuffer(driversFolder);
        if (os.toLowerCase().startsWith("win")) {
            binaryPath.append("windows/" + driver+"driver"+".exe");
        } else if (os.toLowerCase().startsWith("lin")) {
            binaryPath.append("linux/"+driver+"driver");
        } else if (os.toLowerCase().startsWith("mac")) {
            binaryPath.append("mac/"+driver+"driver");
        }
        else{
            System.out.println("smth went wrong");
            throw new Exception("This OS is not supported yet");
        }

        System.setProperty("webdriver."+driver+".driver", binaryPath.toString());

    }


}
