package h3;

public class H3_main {
	public static void main(String[] args) {
		// 1 Variablen anlegen
		int max = 5; // maximale Anzahl an Fixplätzen
		int fix = 2; // aktuell vergebene Fixplätze
		int wartend = 12; // Personen auf der Warteliste
		boolean istVoll; // zeigt, ob alle Plätze vergeben sind

		// 2 Berechnen, wie viele Plätze noch frei sind
		int frei = max - fix;

		// 3 Wenn Plätze frei sind UND Wartende da sind
		if (frei > 0 && wartend > 0) {
			// Wenn mehr Wartende als freie Plätze da sind
			if (wartend > frei) {
				wartend = wartend - frei; // so viele kommen runter von der Liste
				fix = max; // alle Plätze sind jetzt belegt
			} else {
				fix = fix + wartend; // alle Wartenden bekommen einen Platz
				wartend = 0; // niemand wartet mehr
			}
		}

		// 4 Prüfen, ob alle Plätze voll sind
		if (fix == max) {
			istVoll = true;
		} else {
			istVoll = false;
		}

		// 5 Ausgabe
		System.out.println("Maximale Plätze: " + max);
		System.out.println("Fixplätze belegt: " + fix);
		System.out.println("Wartende Personen: " + wartend);
		System.out.println("Veranstaltung voll: " + istVoll);
	}
}