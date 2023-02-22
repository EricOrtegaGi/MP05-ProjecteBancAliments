import java.util.ArrayList;

public class BancAliments {
    private ArrayList<Aliment> aliments;

    public BancAliments() {
        aliments = new ArrayList<>();
    }

    public ArrayList<Aliment> getAliments() {
        return aliments;
    }

    /**
     *
     * @param nomAliment: Nom de l'aliment a cercar
     * @return índex de l'aliment trobat
     * -1 si no trobeu l'aliment amb el nom especificat
     */
    public int buscarAliment(String nomAliment){

        for (int i = 0; i < aliments.size(); i++) {
            if(aliments.get(i).getNom().equals(nomAliment)){
                return i;
            }
        }

        return -1;
    }

    public boolean agregarAliment(Aliment aliment){

        //verificar si l'aliment ja existeix
        if(buscarAliment(aliment.getNom()) != -1)
            return false;

        aliments.add(aliment);
        return true;
    }

    public boolean eliminarAliment(Aliment aliment
    ){
        int idx = buscarAliment(aliment.getNom());

        //verificar si aliment existeix
        if(idx == -1)
            return false;

        aliments.remove(idx);
        return true;
    }

    public boolean modificarAliment(String nomAnterior, String nomNou){
        int idx = buscarAliment(nomAnterior);

        //verificar si aliment existeix
        if(idx == -1)
            return false;

        aliments.get(idx).setNom(nomNou);
        return true;
    }

    public Aliment getAliment(int idx){

        if(idx < 0 || idx >= aliments.size())
            return null;

        return aliments.get(idx);
    }

    public int getQuantitatAliments(){ return aliments.size(); }

    public void mostrarAliments(){
        if(aliments.isEmpty()){
            System.out.println("No hi ha aliments al banc d'aliments!");
            return;
        }
        for (int i = 0; i < aliments.size(); i++) {
            System.out.println((i+1)+". "+ aliments.get(i));
        }
    }

    public boolean teAliments(){
        return !aliments.isEmpty();
    }
}
