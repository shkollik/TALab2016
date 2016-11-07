package talab.dao;

import talab.entities.Goods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public interface GoodsDao extends GenericDao<Goods> {
    List<Goods> findByPrice(int minLimit) throws IOException, SQLException;
}

