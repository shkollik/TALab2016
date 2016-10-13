package talab.dao;

import talab.entities.Balance;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public interface BalanceDao extends GenericDao<Balance>{
    List<Balance> findByAmount(int minLimit) throws IOException, SQLException;

}
