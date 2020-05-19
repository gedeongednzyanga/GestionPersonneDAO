
package View;

/**
 *
 * @author GEDEON
 */
public class Telephone {
    
    private int _id;
    private int _idProprietaire;
    private String _initial;
    private String _numero; 

    public Telephone() {
    }

    public Telephone(int _id, int _idProprietaire, String _initial, String _numero) {
        this._id = _id;
        this._idProprietaire = _idProprietaire;
        this._initial = _initial;
        this._numero = _numero;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getIdProprietaire() {
        return _idProprietaire;
    }

    public void setIdProprietaire(int _idProprietaire) {
        this._idProprietaire = _idProprietaire;
    }

    public String getInitial() {
        return _initial;
    }

    public void setInitial(String _initial) {
        this._initial = _initial;
    }

    public String getNumero() {
        return _numero;
    }

    public void setNumero(String _numero) {
        this._numero = _numero;
    }
    
    @Override 
    public String toString(){
        String numeroComplet = "Numéro : "+this._initial+this._numero;
        return numeroComplet;
    }
}
