package h2;

public class H2_main {
    public static void main(String[] args) {
    	
        int jahr = 2024;        // Beispieljahr
        boolean schalt;         // true = Schaltjahr, false = kein Schaltjahr

        // Prüfen, ob Schaltjahr
        if (jahr % 400 == 0) {          //(..) Bedingungen
            schalt = true;
        } else if (jahr % 100 == 0) {
            schalt = false;
        } else if (jahr % 4 == 0) {
            schalt = true;
        } else {
            schalt = false;
        }

        // Ausgabe
        System.out.println("Jahr: " + jahr);
        System.out.println("Schaltjahr: " + schalt);
    }
