package Test;

import com.sistema_contable.connections.ConnectionDB;
import java.sql.*;

public class TestDB {

    public static void main(String[] args) {
        try (Connection cn = ConnectionDB.conectar()) {
            if (cn != null) {
                String sql = "SELECT current_database(), current_user";
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    System.out.println("DataBase: " + rs.getString(1));
                    System.out.println("USER: " + rs.getString(2));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error:");
            System.out.println(e.getMessage());
        }
    }
    
}
