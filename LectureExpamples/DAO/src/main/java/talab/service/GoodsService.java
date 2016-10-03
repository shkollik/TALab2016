package talab.service;

import talab.dao.DaoFactory;
import talab.dao.GoodsDao;
import talab.entities.Goods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class GoodsService {
    private static GoodsService instance;

    private GoodsDao dao = DaoFactory.getInstance().createGoodsDao();

    public void setDao(GoodsDao dao) {
        this.dao = dao;
    }

    public GoodsService() throws ClassNotFoundException {
    }



    public static GoodsService getInstance() throws ClassNotFoundException {
        if(instance == null){
            instance = new  GoodsService();
        }
        return instance;
    }

    public List<Goods> getGoodsWithDiscount(int minPrice, int discount) throws IOException, SQLException {
        List<Goods> list = dao.findByPrice(minPrice);
        for(Goods g : list){
            g.setPrice(g.getPrice() * (100-discount)/100);
        }
        return  list;
    }
}
