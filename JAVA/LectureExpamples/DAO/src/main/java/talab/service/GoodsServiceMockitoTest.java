package talab.service;
import org.junit.Assert;
import org.junit.Test;
import talab.dao.GoodsDao;
import talab.entities.Goods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by Vladyslav_Shkola on 10/7/2016.
 */
public class GoodsServiceMockitoTest {
    @Test
    public void testGoodsListWithDiscount() throws ClassNotFoundException, IOException, SQLException {
        GoodsService service = new GoodsService();
        GoodsDao dao = mock(GoodsDao.class);
        service.setDao(dao);

        when(dao.findByPrice(100)).thenReturn(Arrays.asList(
                new Goods(1, "a", "a", 100, 1), new Goods(1, "a", "a", 200, 2)));

        List<Goods> actual = service.getGoodsWithDiscount(100, 10);
        Assert.assertEquals(Arrays.asList(
                new Goods(1, "a", "a", 90, 1), new Goods(1, "a", "a", 180, 2)), actual);
    }
}
