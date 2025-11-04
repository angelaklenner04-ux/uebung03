package h1;

public class H1_main {
    public static void main(String[] args) {

        // 1 Variablen
        double guthaben = -100;
        double monEingang = 200;
        int rating = -2;
        boolean warnhinweis;
        boolean negativ;

        // 2 Prüfen, ob Konto im Minus ist
        if (guthaben < 0) {
            negativ = true;
        } else {
            negativ = false;
        }

        // 3 Rating berechnen
        if (guthaben > 0) {
            rating = rating + 3;
        } else if (guthaben == 0) {
            rating = rating + 2;
        } else { // guthaben < 0
            if (monEingang >= Math.abs(guthaben)) {
                rating = rating + 1;
            } else {
                rating = rating - 1;
            }
        }

        // 4 Warnhinweis setzen
        if (guthaben < 0 && monEingang < Math.abs(guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

        // 5️⃣ Ausgabe
        System.out.println("Guthaben: " + guthaben);
        System.out.println("Monatlicher Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Negativ: " + negativ);
        System.out.println("Warnhinweis: " + warnhinweis);
    }
}// meta: H1 commit
