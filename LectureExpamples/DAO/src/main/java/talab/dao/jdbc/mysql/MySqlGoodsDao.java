package talab.dao.jdbc.mysql;

import talab.dao.GoodsDao;
import talab.entities.Goods;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class MySqlGoodsDao implements GoodsDao{
    public static final String SELECT_GOODS_BY_PRICE = "SELECT * FROM goods WHERE price >?";
    public static final String SELECT_ALL = "SELECT * FROM goods >?";
    @Override
    public Goods find(int id) {
        return null;
    }

    @Override
    public List<Goods> findAll() throws IOException, SQLException {
        List<Goods> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();

        try (Statement query = connection.createStatement()){

            ResultSet rs = query.executeQuery(SELECT_ALL);
            while(rs.next()){
                result.add(getGoodsFromResultSet(rs));

            }
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
        return result;
    }

    private Goods getGoodsFromResultSet(ResultSet rs) throws SQLException {
        Goods goods = new Goods();
        goods.setId(rs.getInt("id"));
        goods.setName(rs.getString("card_accounts_id"));
        goods.setDescription(rs.getString("description"));
        goods.setPrice(rs.getInt("price"));
        goods.setManufactureId(rs.getInt("manufactureId"));
        return goods;
    }

    @Override
    public void update(Goods entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void insert(Goods entity) {

    }

    @Override
    public List<Goods> findByPrice(int minLimit) throws IOException, SQLException {
        List<Goods> result = new ArrayList<>();
        Connection connection = MySqlJdbcDaoFactory.getConnection();

        try (PreparedStatement query = connection.prepareStatement(SELECT_GOODS_BY_PRICE)){
            query.setInt(1, minLimit);
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                Goods goods = getGoodsFromResultSet(rs);
                result.add(goods);

            }
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
        return result;
    }
}
