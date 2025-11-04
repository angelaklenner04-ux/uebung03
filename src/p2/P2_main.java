package p2;

public class P2_main {
	public static void main(String[] args) {

		int a = 50, b = 50, c = 100, d = 0; // Beispiel-Startwerte

		// Eigenschaft E1
		if (a == b) {
			d++;
		}

		// Eigenschaft E2: a stimmt mit b ODER c überein
		if (a == b || a == c) {
			d++;
		}

		// Eigenschaft E3
		if (a + b >= c) {
			d++;
		}

		// Eigenschaft E4
		if (a + b + c >= 100) {
			d++;
		}

		// Ausgaben
		System.out.println("Wert von a: " + a);
		System.out.println("Wert von b: " + b);
		System.out.println("Wert von c: " + c);
		System.out.println("Erfüllte Eigenschaften (d): " + d);
	}
}

// d++ zähle eins hoch (Anzahl erfüllter Eigenschaften// meta: P2 commit
