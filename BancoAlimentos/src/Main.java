import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcio;
        String nomAliment;
        BancAliments bancAliments = new BancAliments();
        Scanner ent = new Scanner(System.in);



        do {

            System.out.println("Hola venvinguts a la donacio d'alimemts OG. Siusplau, selecciona una de les opcions possibles del banc d'aliments\n" +
                        "1. Afegir aliments\n" +
                        "2. Modificar aliments\n" +
                        "3. Eliminar aliments\n" +
                        "4. Stock d'aliments\n" +
                        "5. Mostrar aliments\n"+
                        "6. Sortir\n" +
                        "Seleccione opció deseada: \n");

            opcio = ent.nextInt();
            ent.nextLine();
            if (opcio < 1 || opcio > 6) {
                System.out.println("Per favor, introdueix un numero del 1 al 6");
            }
            switch (opcio){
                case 1:
                        System.out.println("Nom del nou aliment: ");
                        nomAliment = ent.nextLine();
                        bancAliments.agregarAliments(nomAliment);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                        System.out.println(bancAliments);
                    break;
            }

        }
        while(opcio != 6);
    }
}
