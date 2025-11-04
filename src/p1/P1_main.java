package p1;

public class P1_main {
    public static void main(String[] args) {
        int wuerfel = 4;  // Beispielwert

        if (wuerfel == 1) {  // Bedingung 1
            System.out.println("Sie haben gewonnen! :)");
        } 
        else if (wuerfel == 4) { // Bedingung 2 (auch Gewinn)
            System.out.println("Sie haben gewonnen! :)");
        } 
        else if (wuerfel == 2) {  // Bedingung 3
            System.out.println("Sie haben verloren! :(");
        } 
        else if (wuerfel == 5) { // Bedingung 4
            System.out.println("Das Spiel endet unentschieden");
        } 
        else { // alle anderen Fälle
            System.out.println("Es konnte kein Ausgang festgestellt werden");
        }
    }
}// meta: P1 commit
