package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

    public Connection con = null;

    public static Connection Conectar() {

        Connection cn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemacorn","root","joseernesto");
        } catch (Exception e) {
            System.out.println(String.valueOf(e));
        }
        return cn;
    }
}