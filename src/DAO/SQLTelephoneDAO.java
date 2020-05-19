
package DAO;

import View.Telephone;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author GEDEON
 */
public class SQLTelephoneDAO extends DAO<Telephone> {

    @Override
    public int Nouveau() {
        int id = 0;
        PreparedStatement ps;
        String requete = "SELECT MAX(id) as lastId FROM telephone";
        try{
            ps = this.connect.prepareStatement(requete);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                if (Integer.parseInt(rs.getString("lastId")) != 0 && Integer.parseInt(rs.getString("lastId"))< 0)
                    id = 1;
                else
                    id = Integer.parseInt(rs.getString("lastId")) + 1;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return id;
    }

    @Override
    public Telephone Enregistrer(Telephone obj) {
        String requete = "exec sp_insert_telephone ?,?,?,?";
        try{
            PreparedStatement ps =  this.connect.prepareStatement(requete);
            ps.setInt(1, obj.getId());
            ps.setInt(2, obj.getIdProprietaire());
            ps.setString(3, obj.getInitial());
            ps.setString(4, obj.getNumero());
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Téléphone enregistrée !!!");
        }catch(SQLException e){
            
        }
        return obj;
    }

    @Override
    public void Supprimer(Telephone obj) {
        String requete = "exec sp_delete_telephone ?";
        try{
            PreparedStatement ps = this.connect.prepareStatement(requete);
            ps.setInt(1, obj.getId());
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Téléphone supprimé !!!");
        }catch(SQLException e){
            
        }
    }

    @Override
    public void Afficher(JTable table) {
        String requete = "exec sp_select_telephoness";
        try{
            PreparedStatement ps = this.connect.prepareStatement(requete);
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erreur : " +e.getMessage());
        }
    }

    @Override
    public void AfficherOne(int id, JTable table) {
        String requete = "exec sp_select_telephones_personnee ?";
        try{
            PreparedStatement ps = this.connect.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erreur : " +e.getMessage());
        }
    } 
}
