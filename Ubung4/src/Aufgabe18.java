import java.util.Scanner;

public class Aufgabe18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int JANUARY = 1;
        final int FEBRUARY = 2;
        final int MARCH = 3;
        final int APRIL = 4;
        final int MAY = 5;
        final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        final int SEPTEMBER = 9;
        final int OCTOBER = 10;
        final int NOVEMBER = 11;
        final int DECEMBER = 12;

        System.out.print("Enter number of a month: ");
        int option = scanner.nextInt();

        String season = switch (option) {
            case MARCH, APRIL, MAY -> "Spring";
            case JUNE, JULY, AUGUST -> "Summer";
            case SEPTEMBER, OCTOBER, NOVEMBER -> "Autumn";
            case DECEMBER, JANUARY, FEBRUARY -> "Winter";
            default -> "No Season";
        };

        if (season.equals("No Season")) {
            System.out.println("No Season!");
        } else {
            System.out.println("Month " + option + " is " + season + ".");
        }

        scanner.close();
    }
}
