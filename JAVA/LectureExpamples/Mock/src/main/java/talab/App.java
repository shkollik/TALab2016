package talab;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Hello world!
 *
 */
public class App 
{
    @Test
    public void testReturn() {
        Comparator comp = mock(Comparator.class);
        when(comp.compare(anyInt(), anyInt())).thenReturn(-100500);
        when(comp.compare(1, 2)).thenReturn(-1);
        when(comp.compare(0, 0)).thenReturn(0);
        assertEquals(-1, comp.compare(1,2));
        assertEquals(0, comp.compare(0,0));
        //assertEquals(-100500, comp.compare(0,0));
    }
}
