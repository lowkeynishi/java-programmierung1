import java.util.Scanner;

public class Aufgabe17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // use final so its always constant, cant be change.
        final String MENU_QUARK = "Kräuterquark mit Lausitzer Leinöl, Salzkartoffeln und mariniertem Blattsalat.";
        final String MENU_KOHL = "Spitzkohl-Kartoffel-Linsenpfanne mit frischer Petersilie, dazu pikante Kokossauce.";
        final String MENU_SNACK = "Kumpir-Backkartoffel mit verschiedenen Toppings.";
        final String MENU_DESSERT = "Veganer Milchreis mit roter Grütze.";
        int option;

        System.out.println("Please choose an option of menu(1-4):");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Essensangebot-Nr " + option + " ist " +  MENU_QUARK);
                break;
            case 2:
                System.out.println("Essensangebot-Nr " + option + " ist " +  MENU_KOHL);
                break;
            case 3:
                System.out.println("Essensangebot-Nr " + option + " ist " +  MENU_SNACK);
                break;
            case 4:
                System.out.println("Essensangebot-Nr " + option + " ist " +  MENU_DESSERT);
                break;
            default:
                System.out.println("Essensangebot-Nr " + option + " gibt es leider in der mensa nicht.");
        }

        scanner.close();
    }
}
