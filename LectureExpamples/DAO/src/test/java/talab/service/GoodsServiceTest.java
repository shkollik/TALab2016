package talab.service;

import org.junit.Test;
import talab.dao.GoodsDao;
import talab.entities.Goods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class GoodsServiceTest {
    @Test
    public void testDiscount() throws ClassNotFoundException, IOException, SQLException {
        GoodsService service = new GoodsService();
        service.setDao(new GoodsDao() {
            @Override
            public List<Goods> findByPrice(int minLimit) throws IOException, SQLException {
                return null;
            }

            @Override
            public Goods find(int id) {
                return null;
            }

            @Override
            public List<Goods> findAll() throws IOException, SQLException {
                return Arrays.asList(new Goods(), new Goods());
            }

            @Override
            public void update(Goods entity) {

            }

            @Override
            public void delete(int id) {

            }

            @Override
            public void insert(Goods entity) {

            }
        });

        service.getGoodsWithDiscount(1, 1);



    }
}
