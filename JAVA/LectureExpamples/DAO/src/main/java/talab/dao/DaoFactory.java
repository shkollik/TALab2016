package talab.dao;

import talab.dao.jdbc.mysql.MySqlJdbcDaoFactory;

import static java.lang.Class.forName;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public abstract class DaoFactory {
    public  abstract GoodsDao createGoodsDao();
    public abstract OrderDao createOrderDao();
    public abstract UserDao createUserDao();

    public static DaoFactory getInstance() throws ClassNotFoundException {
        String factoryName = "talab.dao.jdbc.mysql.MySqlJdbcDaoFactory";
        try{
            return (DaoFactory) Class.forName(factoryName).newInstance();
        }
        catch(Exception ex){
            throw new RuntimeException(ex);
        }
        //return new MySqlJdbcDaoFactory();
    }
}
