import java.util.Scanner;

public class Aufgabe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int originalA;
        int digit;
        int sum = 0;
        System.out.print("Geben Sie den Wert eingeben: \n");
        a = sc.nextInt();

        if (a < 0) {
            System.out.println("Eingabefehler: Bitte eine natürliche Zahl eingeben.");
            return;
        }else {
            originalA = a;

            while(a > 0){
                digit = a % 10;
                sum += digit;
                a /= 10;
            }
            System.out.println("The sum of digits is " + sum);
        }


        sc.close();
    }
}
