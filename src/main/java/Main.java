import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        AddTeam addTeam = new AddTeam();
//        addTeam.getChelsea().forEach(y-> System.out.println(y));
//       System.out.println(addTeam.getChelsea());


        char choice, ignore;

        for (; ; ) {
            do {
                System.out.println("Liga angielska, wybierz opcję: ");
                System.out.println(" 1. Drużyny ");
                System.out.println(" 2. Tabela ");
                System.out.println(" 3. Klasyfikacja strzelców ");
                System.out.println(" 4. Czyste konta ");
                System.out.println(" 5. Rekordy ");
                System.out.println(" 6. kolejna opcja ");
                System.out.println(" 7. kolejna opcja ");
                System.out.print("Wybierz numer lub 'q' aby zakończyć: ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

            System.out.println("\n");


            switch (choice) {
                case '1':
                    System.out.println("Drużny: \n");
                    System.out.println("a. West Ham UTD ");
                    System.out.println("b. Liverpool FC");
                    System.out.println("c. Man UTD");
                    System.out.println("d. Chelsea FC");
                    System.out.println("e. Fulham FC");

                    choice = (char) System.in.read();

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
            }
            while (choice < 'a' | choice > 'g' & choice != 'q') ;

            if (choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case 'a':
                    System.out.println("***WEST HAM UTD***");
                    System.out.println("1. Historia ");
                    System.out.println("2. Skład ");
                    choice = (char) System.in.read();

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
            }
            while (choice < '1' | choice > '7' & choice != 'q') ;




            switch (choice) {
                case '1':
                    System.out.println("Drużny: \n");
                    System.out.println("a. West Ham UTD ");
                    System.out.println("b. Liverpool FC");
                    System.out.println("c. Man UTD");
                    System.out.println("d. Chelsea FC");
                    System.out.println("e. Fulham FC");


                case 'b':
                    System.out.println("***LIVERPOOL FC***");
                    System.out.println("1. Historia ");
                    System.out.println("2. Skład ");
                    break;
                case 'c':
                    System.out.println("***MAN UTD***");
                    System.out.println("1. Historia ");
                    System.out.println("2. Skład ");
                    break;
                case 'd':
                    System.out.println("***CHELSEA FC***");
                    System.out.println("1. Historia ");
                    System.out.println("2. Skład ");
                    break;
                case 'e':
                    System.out.println("***Fulham FC***");
                    System.out.println("1. Historia ");
                    System.out.println("2. Skład ");
                    break;
// tu petla 3 cia ?


                case '2':
                    System.out.println("Pobiera aktualną tabele: \n");

                    break;
                case '3':
                    System.out.println("Pobiera klasyfikację króla strzelców: \n");
                    break;
                case '4':
                    System.out.println("Pobiera czyste konta: \n");
                    break;
                case '5':
                    System.out.println("Pobiera rekordy: \n");
                    break;
                case '6':
                    System.out.println("kolejna opcja: ");
                    break;
                case '7':
                    System.out.println("kolejna opcja: ");
                    break;


            }
        }
    }
}



