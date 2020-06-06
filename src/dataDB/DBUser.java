package dataDB;

import conexionDB.ConexionDB;
import entidades.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by cgallo on 06/06/20.
 */

public class DBUser {

    public static User getUser(String username, String password) {
        User user = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = ConexionDB.getInstancia().getConexion().prepareStatement(
                    "select id, username, first_name, last_name, email, password, is_staff, is_active, " +
                            "is_superuser, last_login, date_joined from user where username = ? and password = ?"
            );
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"),
                        rs.getString("first_name"), rs.getString("last_name"), rs.getString("email"),
                        rs.getBoolean("is_staff"), rs.getBoolean("is_active"), rs.getBoolean("is_superuser"),
                        rs.getDate("last_login"), rs.getDate("last_login"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.cancel();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ConexionDB.getInstancia().releaseConexion();
        }
        return user;
    }
}
