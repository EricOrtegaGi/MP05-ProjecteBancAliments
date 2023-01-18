package mp05.applicaciobancaliments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class menuAssociacions {

        public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);
            int agree = 0;
            String Macarrons = "Macarrons";
            int cantitatMac = 0;
            String Spaghettis = "Spaghettis";
            int cantitatSpag = 300;
            String Atun = "Atun";
            int cantitatAtu = 0;
            String Galletes = "Galletes";
            int cantitatGall = 0;
            String Platans = "Platans";
            int cantitatPlat = 0;
            boolean run = true;

            System.out.print(
                    "Escolleix una opció:" +
                            "\n1 - Fer Ordre " +
                            "\n2 - Repartiment " +
                            "\n3 - Stock " +
                            "\n4 - Donar d'alta Associació" +
                            "\n5 - Sortir \n");

            while (run){

                switch (ent.nextInt()){

                    case 1: {
                        int cantitat;
                        System.out.print("" +
                                "Selecciona Un aliment \n1- " + Galletes + "\n2- " + Macarrons + "\n3- " + Spaghettis + "\n4- " + Atun + "\n5- " + Platans + "\n");
                        do {
                            int Seleccio = ent.nextInt();

                            if (Seleccio == 1) {
                                System.out.println("Has seleccionat " + Galletes + " Ara escolleix la cantitat:");
                                cantitat = ent.nextInt();
                                System.out.print("Has seleccionat " + cantitat + " Kilos " + Galletes + "\nEstas Segur?:" );
                                System.out.print("\n1- si \n2- no");
                                agree = ent.nextInt();
                                //s'ha de fer que la cantitat es reste al banc d'aliments
                                if (agree == 1) cantitatGall -= cantitat;
                                else break;


                            } else if (Seleccio == 2) {
                                System.out.println("Has seleccionat " + Macarrons + " Ara escolleix la cantitat:");
                                cantitat = ent.nextInt();
                                System.out.print("Has seleccionat " + cantitat + " Kilos " + Macarrons + "\nEstas Segur?:" );
                                System.out.print("\n1- si \n2- no");
                                agree = ent.nextInt();
                                if (agree == 1) cantitatMac -= cantitat;
                                else break;

                            } else if (Seleccio == 3) {
                                System.out.println("Has seleccionat " + Spaghettis + " Ara escolleix la cantitat:");
                                cantitat = ent.nextInt();
                                System.out.print("Has seleccionat " + cantitat + " Kilos " + Spaghettis + "\nEstas Segur?:" );
                                System.out.print("\n1- si \n2- no");
                                agree = ent.nextInt();
                                if (agree == 1) cantitatSpag -= cantitat;
                                else break;

                            } else if (Seleccio == 4) {
                                System.out.println("Has seleccionat " + Atun + " Ara escolleix la cantitat:");
                                cantitat = ent.nextInt();
                                System.out.print("Has seleccionat " + cantitat + " Kilos " + Atun + "\nEstas Segur?:" );
                                System.out.print("\n1- si \n2- no");
                                agree = ent.nextInt();
                                if (agree == 1) cantitatAtu -= cantitat;
                                else break;

                            } else if (Seleccio == 5) {
                                System.out.println("Has seleccionat " + Platans + " Ara escolleix la cantitat:");
                                cantitat = ent.nextInt();
                                System.out.print("Has seleccionat " + cantitat + " Kilos " + Platans + "\nEstas Segur?:" );
                                System.out.print("\n1- si \n2- no");
                                agree = ent.nextInt();
                                if (agree == 1) cantitatPlat -= cantitat;
                                else break;

                            }
                        } while (agree != 1);

                    }

                    case 2:{
                        do {

                        }while (true);

                    }
                    case 3:{
                        System.out.print("Galletes: "+ cantitatGall + "kg\n" + "Atun: "+cantitatAtu + "kg\n" + "Macarrons: "+cantitatMac + "kg\n" + "Platans: "+cantitatPlat + "kg\n" + "Spaghettis: "+cantitatSpag + "kg\n");
                    }
                    case 4:{

                        do {



                        }while (true);

                    }
                    case 5:{
                        run = false;
                    }
                }
            }
        }
    }

