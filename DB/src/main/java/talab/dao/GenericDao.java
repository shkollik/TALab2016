package talab.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public interface GenericDao<T> {
    T find(int id) throws IOException, SQLException;
    List<T> findAll() throws IOException, SQLException;
    void update(T entity) throws IOException, SQLException;
    void delete(int id) throws IOException, SQLException;
    void insert(T entity) throws IOException, SQLException;

}
