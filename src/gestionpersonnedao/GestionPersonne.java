
package gestionpersonnedao;

import java.io.File;

/**
 *
 * @author GEDEON
 */
public class GestionPersonne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        File dataBase = new File("c://cheminBd//dataBase.txt");
//        File user = new File("c://cheminBd//user.txt");
//        File password = new File("c://cheminBd//password.txt");
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GPersonne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         new GPersonne().show();

    }
    
}
