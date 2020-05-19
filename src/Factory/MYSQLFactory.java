
package Factory;

import DAO.DAO;
import View.Personne;
import View.Telephone;

/**
 *
 * @author GEDEON
 */
public class MYSQLFactory extends AbstractDAOFactory {

    @Override
    public DAO<Personne> getPersonneDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DAO<Telephone> getTelephoneDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
