
public class Aliment {

    private String nom;
    private int stock;

    public Aliment(String nom){
        this.nom = nom;
        this.stock = 0;
    }

    @Override
    public String toString() {
        return nom;
    }
}
