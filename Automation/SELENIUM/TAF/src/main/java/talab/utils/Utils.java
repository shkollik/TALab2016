package talab.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * Created by Shkolik on 06.11.2016.
 */
public class Utils {
    public static String getRandomName(int n){
        return "repo" + RandomStringUtils.randomAlphanumeric(n);
    }
}
