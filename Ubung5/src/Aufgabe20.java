import java.util.Scanner;

public class Aufgabe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a;
        int digit;
        int sum = 0;
        System.out.print("Geben Sie den Wert eingeben: \n");
        a = sc.nextLong();

        while(a > 0){
            digit = Math.toIntExact(a % 10);
            sum += digit;
            a /= 10;
        }
        System.out.println("The sum of digits is " + sum);

        sc.close();
    }
}
