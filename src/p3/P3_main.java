package p3;

public class P3_main {

    public static void main(String[] args) {
        int i = -99;
        int k = -7;
        int j = 5;

        // Miniprogramm 1:
        // nutzt i
        if (i < 0) {
            i = -1 * i;
        }
        // i = Math.abs(i);
        // i = i < 0 ? -i : i;

        System.out.println("Betrag von i: " + i);

        // Miniprogramm 2:
        // nutzt k
        System.out.println("Quadrat von k: " + (k * k));

        // Miniprogramm 3:
        // nutzt j
        if (j % 2 == 0) {
            System.out.println("int j = " + j + " ist gerade!");
        } else {
            System.out.println("int j = " + j + " ist ungerade!");
        }
    }
}// meta: P3 commit
