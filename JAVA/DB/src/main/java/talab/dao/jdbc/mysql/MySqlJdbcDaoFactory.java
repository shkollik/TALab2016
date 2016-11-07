package talab.dao.jdbc.mysql;

import talab.dao.*;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class MySqlJdbcDaoFactory extends DaoFactory{
    private static final String DB_CONFIG_FILE_NAME="/db.properties";
    private static final String DB_USER="db.user";
    private static final String DB_PASS="db.pass";
    private static final String DB_URL="db.url";

    private static Connection connection;
    static Connection  getConnection() throws SQLException, IOException {
        try{
            if(connection == null) {
                InputStream in = MySqlJdbcDaoFactory.class.getResourceAsStream(DB_CONFIG_FILE_NAME);
                Properties props = new Properties();
                props.load(in);

                connection = DriverManager.getConnection(props.getProperty(DB_URL),
                        props.getProperty(DB_USER),
                        props.getProperty(DB_PASS));


            }
            return connection;

        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }


    @Override
    public BalanceDao createBalanceDao() {
        return new MySqlBalanceDao();
    }

    @Override
    public CardAccountsDao createCardAccountsDao() {
        return null;
    }

    @Override
    public CardStatusDao createCardStatusDao() {
        return null;
    }

    @Override
    public ClientsDao createClientsDao() {
        return null;
    }

    @Override
    public PaymentSystemDao createPaymentSystemDao() {
        return null;
    }

    @Override
    public TransactionsDao createTransactionsDao() {
        return null;
    }
}
