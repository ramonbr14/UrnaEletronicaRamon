package connection;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
    public static String DRIVE = "com.mysql.jdbc.Driver";
    public static String URL = "jdbc:mysql://localhost:3306/urnaeletronicadb";
    public static String USER = "root";
    public static String PASS = "root";
    
    
    public Connection getConnecton(){
    
        try {
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro da Conexão!", ex);
        }
    }
    
    public static void closeConnection(Connection com){
        if(com != null){
            try {
                com.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
    }
    
    public static void closeConnection(Connection com, PreparedStatement stmt){
        
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        closeConnection(com);
    }
    
    public static void closeConnection(Connection com, PreparedStatement stmt, ResultSet rs){
        
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        closeConnection(com, stmt);
    }
    
}
