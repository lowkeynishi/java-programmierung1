import java.util.Scanner;

public class Aufgabe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Geben Sie einen Zahl ein: \n");
        a = sc.nextInt();
        System.out.print("Geben Sie einen Zahl ein: \n");
        b = sc.nextInt();
        if (a <= 0 || b <= 0){
            System.out.println("The numbers must be positive integers!");
        }else {
            while(b != 0){
                c = a % b;
                a = b;
                b = c;
            }
            System.out.printf("The greatest common divisor is %d\n", a);
        }


        sc.close();
    }
}
