package talab.dao;

import talab.dao.jdbc.mysql.MySqlJdbcDaoFactory;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public abstract class DaoFactory {
    public abstract BalanceDao createBalanceDao();
    public abstract CardAccountsDao createCardAccountsDao();
    public abstract CardStatusDao createCardStatusDao();
    public abstract ClientsDao createClientsDao();
    public abstract PaymentSystemDao createPaymentSystemDao();
    public abstract TransactionsDao createTransactionsDao();

    public static DaoFactory getInstance() throws ClassNotFoundException {
        String factoryClassName = "talab.dao.jdbc.mysql.MySqlJdbcDaoFactory";
        try{
            return (DaoFactory) Class.forName(factoryClassName).newInstance();
        }
        catch(Exception ex){
            throw new RuntimeException(ex);
        }
        //return new MySqlJdbcDaoFactory();
    }


}
