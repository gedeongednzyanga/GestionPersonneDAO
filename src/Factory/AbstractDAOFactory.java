
package Factory;

import DAO.DAO;


/**
 *
 * @author GEDEON
 */
public abstract class AbstractDAOFactory {
    
    public abstract DAO getPersonneDAO();
    public abstract DAO getTelephoneDAO();

    public static AbstractDAOFactory getFactoryType(FactoryType type){
        if(type.equals(FactoryType.SQLFactory) ){
            return new SQLFactory();
        }
        if(type.equals(FactoryType.MSQLFactory) ){
            return new MYSQLFactory();
        }
        return null;
    }
}
