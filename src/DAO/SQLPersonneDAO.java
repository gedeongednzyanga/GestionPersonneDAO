
package DAO;

import View.Personne;
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
public class SQLPersonneDAO extends DAO<Personne> {

    @Override
    public int Nouveau() {
        int id = 0;
        String requete = "SELECT ISNULL((MAX(id)),0) as lastId FROM personne";
        try{
            PreparedStatement ps = this.connect.prepareStatement(requete);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                if (Integer.parseInt(rs.getString("lastId")) < 1)
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
    public Personne Enregistrer(Personne obj) {
        String requete = "exec sp_insert_personne ?,?,?,?,?";
        try{
            PreparedStatement ps =  this.connect.prepareStatement(requete);
            ps.setInt(1, obj.getId());
            ps.setString(2, obj.getNom());
            ps.setString(3, obj.getPostnom());
            ps.setString(4, obj.getPrenom());
            ps.setString(5, obj.getSexe());
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Personne enregistrée !!!");
        }catch(SQLException e){
           
        }
        return obj;
    }

    @Override
    public void Supprimer(Personne obj) { 
        try{
            String requete = "exec sp_delete_personne ?";
            PreparedStatement ps = this.connect.prepareStatement(requete);
            ps.setInt(1, obj.getId());
            ps.executeQuery();
            
        }catch(SQLException e){
            
        }
    }

    @Override
    public void Afficher(JTable table) {
        String requete = "exec sp_select_personnes";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
