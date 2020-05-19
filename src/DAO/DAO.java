
package DAO;
import SingleConnexion.ConnexionBD;
import java.sql.Connection;
import javax.swing.JTable;
/**
 *
 * @author GEDEON

 */
public abstract class DAO<T> {

    public Connection connect = ConnexionBD.getInstance();
   
    public abstract int Nouveau();
    public abstract T Enregistrer(T obj);
    public abstract void Supprimer(T obj);
    public abstract void Afficher(JTable table);
    public abstract void AfficherOne(int id, JTable table);
}
