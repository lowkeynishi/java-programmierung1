public class Aufgabe16 {
    public static void main(String[] args){

        int year = 364;

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Das Jahr " + year + " ist ein Schaltjahr.");
        }else {
            System.out.println("Das Jahr " + year + " ist kein Schaltjahr.");
        }
    }
}
