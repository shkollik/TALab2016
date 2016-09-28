import org.junit.Assert;
import org.junit.Test;
import ua.epam.OrderedPair;

/**
 * Created by Vladyslav_Shkola on 9/27/2016.
 */
public class OrderPairTest {
    //first less then second
    @Test
    public void testOrdered(){
        Integer first = 3;
        Integer second = 4;
        OrderedPair<Integer> pair = new OrderedPair<>(first, second);
        Assert.assertSame("first element failed:", first, pair.getFirst());
        Assert.assertSame("second element failed: ", second, pair.getSecond());

    }

    @Test
    public void testNotOrdered(){
        Integer first = 4;
        Integer second = 3;
        OrderedPair<Integer> pair = new OrderedPair<>(first, second);
        Assert.assertSame("first element failed:", second, pair.getFirst());
        Assert.assertSame("second element failed: ", first, pair.getSecond());

    }

    @Test
    public void testSetFirst(){
        OrderedPair<String> pair = new OrderedPair<>();
        String first = "aab";
        pair.setFirst(first);
        Assert.assertSame("first element failed: ", first, pair.getFirst());
        String second = "aaa";
        pair.setSecond(second);
        Assert.assertSame("first element failed:", second, pair.getFirst());
        Assert.assertSame("second element failed: ", first, pair.getSecond());
    }


    @Test
    public void testSetFirstNull(){
        OrderedPair<String> pair = new OrderedPair<>();
        pair.setFirst(null);
    }

    @Test
    public void testSet(){
        String first = "aab";
        String second = "aaa";
        OrderedPair<String> pair = new OrderedPair<>(first, second);
        pair.set(null, second);
        Assert.assertSame("setting null failed", null, pair.getFirst());
    }


}
