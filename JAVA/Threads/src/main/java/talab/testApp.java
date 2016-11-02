package talab;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static talab.App.factorial;

/**
 * Created by Vladyslav_Shkola on 10/7/2016.
 */
public class testApp {
    @Test
    public void testScanner(){
        Scanner scanner = mock(Scanner.class);
        when(scanner.nextInt()).thenReturn(1);

        Assert.assertEquals(1, scanner.nextInt());


    }
}
