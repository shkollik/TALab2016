package talab.dao.jdbc.mysql;

import talab.dao.BalanceDao;
import talab.entities.Balance;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class MySqlBalanceDao implements BalanceDao{
    public static final String SELECT_BY_AMOUNT = "SELECT * FROM balance WHERE current_balance >=?";
    public static final String SELECT_ALL = "SELECT * FROM balance";
    public static final String INSERT = "INSERT INTO balance VALUES (1, 1, 500, '2016-08-24 23:47:18')";
    public static final String UPDATE = "UPDATE balance SET current_balance = 700 where card_accounts_id = 5";
    public static final String DELETE = "DELETE from balance WHERE id =?";
    public static final String SELECT_BY_ID = "SELECT * from balance WHERE id =?";


    @Override
    public Balance find(int id) throws IOException, SQLException {
        Balance balance = null;
        Connection connection = MySqlJdbcDaoFactory.getConnection();

        try (PreparedStatement query = connection.prepareStatement(SELECT_BY_ID)){
            query.setInt(1, id);

            ResultSet rs = query.executeQuery();
            while(rs.next()){
                balance = getBalanceFromResultSet(rs);
            }

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
        return balance;
    }

    @Override
    public List<Balance> findAll() throws IOException, SQLException {
        List<Balance> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();

        try (Statement query = connection.createStatement()){

            ResultSet rs = query.executeQuery(SELECT_ALL);
            while (rs.next()){
                result.add(getBalanceFromResultSet(rs));
            }
           
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
        return result;
    }

    @Override
    public void update(Balance entity) throws IOException, SQLException {
        Connection connection = MySqlJdbcDaoFactory.getConnection();

        try (Statement query = connection.createStatement()){
            int rs = query.executeUpdate(UPDATE);

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }


    }

    @Override
    public void delete(int id) throws IOException, SQLException {
        Connection connection = MySqlJdbcDaoFactory.getConnection();

        try (PreparedStatement query = connection.prepareStatement(DELETE)){
            query.setInt(1, id);
            int rs = query.executeUpdate();

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }



    }

    @Override
    public void insert(Balance entity) throws IOException, SQLException {
        Connection connection = MySqlJdbcDaoFactory.getConnection();

        try (Statement query = connection.createStatement()){
            int rs = query.executeUpdate(INSERT);

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }


    }

    @Override
    public List<Balance> findByAmount(int minLimit) throws IOException, SQLException {
        List<Balance> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();

        try (PreparedStatement query = connection.prepareStatement(SELECT_BY_AMOUNT)){
            query.setInt(1, minLimit);

            ResultSet rs = query.executeQuery();
            while(rs.next()){
                result.add(getBalanceFromResultSet(rs));

            }
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
        return result;
    }

    private Balance getBalanceFromResultSet(ResultSet rs) throws SQLException {
        Balance balance = new Balance();
        balance.setId(rs.getInt("id"));
        balance.setCardAccounts(rs.getInt("card_accounts_id"));
        balance.setCurrentBalance(rs.getInt("current_balance"));
        balance.setCurrentDate(rs.getDate("current_date"));
        return balance;
    }
}
