
package Factory;

import DAO.DAO;
import DAO.SQLPersonneDAO;
import DAO.SQLTelephoneDAO;
import View.Personne;
import View.Telephone;

/**
 *
 * @author GEDEON
 */
public class SQLFactory extends AbstractDAOFactory {
    
    @Override
    public DAO<Personne> getPersonneDAO() {
        return new SQLPersonneDAO();
    }

    @Override
    public DAO<Telephone> getTelephoneDAO() {
       return new SQLTelephoneDAO();
    }

   
}
