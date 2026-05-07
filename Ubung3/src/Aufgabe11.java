import java.util.Scanner;

public class Aufgabe11 {
    public static void main(String[] args){

        // Vergleichsoperatoren
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int a = sc.nextInt();

        System.out.println("Enter second integer: ");
        int b = sc.nextInt();

        boolean equal = (a ==b);
        boolean greater = (a > b);
        boolean smaller = (a < b);

        System.out.println("a == b: " + equal);
        System.out.println("a > b: " + greater);
        System.out.println("a < b: " + smaller);

        sc.close();

    }
}
