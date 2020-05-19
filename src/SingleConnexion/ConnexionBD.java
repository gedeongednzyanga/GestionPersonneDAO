
package SingleConnexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author GEDEON
 */
public class ConnexionBD {
    
    private static String _url = "jdbc:sqlserver://;databaseName=gestion_personne";
    private static String _user ="sa";
    private static String _password ="christ";
    private static Connection _conn =null;
    
    public static Connection getInstance(){
        if(_conn == null)
            try{
                _conn = DriverManager.getConnection(getUrl(), getUser(), getPassword());
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Erreur : "+ e.getMessage());
            }
        return _conn;
    }

    public static String getUrl() {
        return _url;
    }

    public static void setUrl(String aUrl) {
        _url = aUrl;
    }

    public static String getUser() {
        return _user;
    }

    public static void setUser(String aUser) {
        _user = aUser;
    }

    public static String getPassword() {
        return _password;
    }

    public static void setPassword(String aPassword) {
        _password = aPassword;
    }
}
