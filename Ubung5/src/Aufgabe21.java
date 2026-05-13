import java.util.Scanner;

public class Aufgabe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zahl;

        System.out.print("Geben Sie ein Zahl ein: \n");
        zahl = sc.nextInt();

        boolean isPrim = isPrim(zahl);
        if (isPrim) {
            System.out.println(zahl + " ist eine Primzahl");
        }else {
            System.out.println(zahl + " ist keine Primzahl");
        }

        sc.close();
    }

    public static boolean isPrim(int zahl) {
        zahl = zahl + 1;
        int teiler = 2;
        boolean isPrimzahl = true;

        do {
            if (zahl % teiler == 0) {
                isPrimzahl = false;
            }
            teiler += 1;
        }while (isPrimzahl && teiler <= Math.sqrt(zahl));

        return isPrimzahl;
    }
}
