package mp05.applicaciobancaliments;

import java.util.Scanner;

public class menuAssociacions {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int agree = 0;
        boolean run = true;

        System.out.print(
                "Escolleix una opció:" +
                        "\n1 - Fer Ordre " +
                        "\n2 - Repartiment " +
                        "\n3 - Stock " +
                        "\n4 - Sortir \n");

        while (run){
            switch (ent.nextInt()){

                case 1: {
                    ferOrdre.main(args);
                }
                case 2:{
                    repartiment.main(args);
                }
                case 3:{
                    stock.main(args);
                }
                case 4:{
                    run = false;
                }
            }
        }
    }
}
