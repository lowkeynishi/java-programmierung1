import java.util.Scanner;

public class Main {

    public static int gl;

    public static void main(String[] args){
        int m =0;
        System.out.println("Meine Wert ist " + gl);

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie einen Wert ein:");
        m = sc.nextInt();
        System.out.println("Meine Wert ist " + m);
        sc.close();

    }
}