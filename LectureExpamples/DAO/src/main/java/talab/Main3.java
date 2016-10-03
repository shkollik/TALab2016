package talab;

import talab.dao.DaoFactory;
import talab.dao.GoodsDao;
import talab.service.GoodsService;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class Main3 {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
//        DaoFactory factory = DaoFactory.getInstance();
//        GoodsDao dao = factory.createGoodsDao();
//        System.out.println(dao.findByPrice(100));

        GoodsService service = GoodsService.getInstance();
        System.out.println(service.getGoodsWithDiscount(100, 10));


    }
}
