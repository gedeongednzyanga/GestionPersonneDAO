
package View;

/**
 *
 * @author GEDEON
 */
public class Personne {
    
    private int _id;
    private String _nom;
    private String _postnom;
    private String _prenom;
    private String _sexe;

    public Personne() {
    }

    public Personne(int _id, String _nom, String _postnom, String _prenom, String _sexe) {
        this._id = _id;
        this._nom = _nom;
        this._postnom = _postnom;
        this._prenom = _prenom;
        this._sexe = _sexe;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNom() {
        return _nom;
    }

    public void setNom(String _nom) {
        this._nom = _nom;
    }

    public String getPostnom() {
        return _postnom;
    }

    public void setPostnom(String _postnom) {
        this._postnom = _postnom;
    }

    public String getPrenom() {
        return _prenom;
    }

    public void setPrenom(String _prenom) {
        this._prenom = _prenom;
    }

    public String getSexe() {
        return _sexe;
    }

    public void setSexe(String _sexe) {
        this._sexe = _sexe;
    }
    
    @Override 
    public String toString(){
        String personne = "Personne : "+this._nom+" "+this._postnom+" "+this._prenom;
        return personne;
    }
}
