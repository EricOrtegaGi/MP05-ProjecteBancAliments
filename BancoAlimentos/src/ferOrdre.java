package mp05.applicaciobancaliments;
import java.util.Arrays;
import java.util.Scanner;

public class ferOrdre {

    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        Aliment[] vector = new Aliment[5];


        System.out.println("Selecciona un aliment y la cantitat no mes gran que 300kg");
        while (true) {

            for (int i = 0; i < vector.length; i++) {
                System.out.println(vector[i]);
            }

            String nom = ent.nextLine();
            int stock = ent.nextByte();
            if (stock > 300) {
                System.out.println("la cantitat no pot ser mes gran que 300kg");
            }else continue;
            new Aliment(nom, stock);

        }
    }
}
