package talab;

import talab.dao.BalanceDao;
import talab.dao.DaoFactory;
import talab.entities.Balance;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class RunnerDao {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        DaoFactory factory = DaoFactory.getInstance();
        BalanceDao dao = factory.createBalanceDao();

        System.out.println(dao.findAll());
        System.out.println(dao.findByAmount(600));
        dao.delete(4);
        dao.insert(new Balance());

        dao.update(new Balance(), 2, 500);
        System.out.println(dao.find(2).toString());




    }
}
