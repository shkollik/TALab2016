package talab;

import java.sql.*;

/**
 * Created by Vladyslav_Shkola on 9/30/2016.
 */
public class Main2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshopdb", "root", "root");
        try (PreparedStatement query = connection.prepareStatement("SELECT * FROM goods WHERE price >= ?")){
            query.setInt(1, 100);
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id") + rs.getString("name") + rs.getInt("price"));
            }
        }
    }
}
