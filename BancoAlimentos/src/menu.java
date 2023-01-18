import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Menú principal");
        System.out.println("1 - Donar alimnets");
        System.out.println("2 - Banc d'aliments");
        System.out.println("3 - Assosiacions");
        System.out.println("4 - Sortir");
        boolean menu = true;

        while (menu) {
            int entrada = (ent.nextInt());
            if (entrada <= 0 && entrada > 3) {
                System.out.println("Opció incorrecta, sel·lecciona una opció entre el 1-4");
            } else if (entrada == 1) {
                Aliment.main(args);
            } else if (entrada == 2) {
                BancAliments.main(args);
            } else if (entrada == 3) {
               menuAssociacions.main(args);
            } else if (entrada == 4) {
                System.exit(0);
            }

        }
    }
}