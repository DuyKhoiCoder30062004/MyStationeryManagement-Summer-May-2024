/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; //jdbc:sqlserver://

/**
 *
 * @author HELLO
 */
public class DBconnection {
    
    //lỗi với các phiên bản JDBC trước đây, giờ phải đụng thêm
    // encrypt và trustServerCertificate 
    // microsoft làm hợp đồng, buộc phải tuân theo, cấm phá vỡ.
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:sqlserver://" + svName + ":" + port + ";databaseName=" + dbName + ";user=" + userID + ";password=" + password + ";encrypt=true;trustServerCertificate=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }

    private final String svName = "localhost";
    private final String port = "1433";
    private final String dbName = "Shiba";
    private final String userID = "shiba";
    private final String password = "bruh";
}

