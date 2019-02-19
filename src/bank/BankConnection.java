
package bank;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ak2049l
 */
public class BankConnection {
    Connection conn;
  
    
    public static Connection ConnectDb(){
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sampleDB","app","app");
            return conn;
            //stmt =conn.createStatement();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
                
    }
    
}
