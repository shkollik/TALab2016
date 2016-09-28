import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Vladyslav_Shkola on 9/28/2016.
 */
@RunWith(Parameterized.class)
public class AddTest {
    @Parameterized.Parameters
    public static Collection<Object []> data(){
        return Arrays.asList(new Object[][] {{2,2,4}, {2,3,5}, {Integer.MIN_VALUE, Integer.MAX_VALUE, -1}});
    }

    @Parameterized.Parameter(value = 0)
    public int first;
    @Parameterized.Parameter(value = 1)
    public int second;
    @Parameterized.Parameter(value = 2)
    public int res;

    @Test
    public void testAdd(){
        int actual = first + second;
        Assert.assertEquals(res, actual);
    }

}
