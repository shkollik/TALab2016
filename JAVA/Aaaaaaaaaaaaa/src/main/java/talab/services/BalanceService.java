package talab.services;

import talab.dao.BalanceDao;
import talab.dao.DaoFactory;
import talab.entities.Balance;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/11/2016.
 */
public class BalanceService {
    private static BalanceService instance;

    private BalanceDao dao = DaoFactory.getInstance().createBalanceDao();


    BalanceService() throws ClassNotFoundException {
        super();
    }

    void setDao(BalanceDao dao) {
        this.dao = dao;
    }

    public static BalanceService getInstance() throws ClassNotFoundException {
        if( instance == null ){
            instance = new BalanceService();
        }
        return instance;
    }

    public List<Balance> getBalanceWithBonus(int minAmount, int bonus) throws IOException, SQLException {
        List<Balance> list = dao.findByAmount(minAmount);
        for(Balance b : list ){
            b.setCurrentBalance(b.getCurrentBalance()*(100+bonus)/100);
        }
        return list;
    }
    
    public List<Balance> getBalanceByAmount(int minAmount) throws IOException, SQLException {
        List<Balance> list = dao.findByAmount(minAmount);
        for(Balance b : list ){
            b.setCurrentBalance(b.getCurrentBalance());
        }
        return list;
    }
    
    public List<Balance> getBalance() throws IOException, SQLException {
        List<Balance> list = dao.findAll();
        for(Balance b : list ){
            b.setCurrentBalance(b.getCurrentBalance());
        }
        return list;
    }
}
