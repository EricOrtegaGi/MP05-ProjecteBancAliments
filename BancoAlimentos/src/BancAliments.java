import java.util.ArrayList;

public class BancAliments {

    private ArrayList<Aliment> aliments;

    public BancAliments(){
        this.aliments = new ArrayList<>();
    }

    public void agregarAliments(String nom){
        this.aliments.add(new Aliment(nom));
    }

    public void modificarAliments(String nom, String nomNou){

    }

    public void eliminarAliments(String nom){

    }

    @Override
    public String toString() {
        String resultat = "";
        for (int i = 0; i < this.aliments.size(); i++) {
            resultat += this.aliments.get(i) + "\n";
        }
        return resultat;
    }
}
