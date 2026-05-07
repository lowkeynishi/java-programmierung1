import java.util.Scanner;

public class Aufgabe15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long a;
        long b;
        long c;

        System.out.println("Enter your first number");
        a = sc.nextLong();

        System.out.println("Enter your second number");
        b = sc.nextLong();

        if (a < 0 || b < 0) { // || or
            System.out.println("Die Zahl ist negativ.");
        }else if (a > Long.MAX_VALUE - b) {
            System.out.println("Die Addition konnte nicht durchgeführt werden.");
        }else {
            c = a + b;
            System.out.println("Your result is " + c);
        }

        sc.close();
    }
}
