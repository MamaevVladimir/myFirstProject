package homework.lesson6;

public class Metodi {

    public static int ploschadTreugolnika(int a, int b, int c) {
        int p = (a + b + c) / 2;
        int s = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static int[] chetChisla(int d, int e, int f, int g, int h) {
        int[] massive1 = {d, e, f, g, h};

        int j = 0;
        int charsFromText = massive1.length;

        int[] massive2 = new int[charsFromText];
        for (int i = 0; i < massive1.length; i++) {
            if (massive1[i] % 2 == 0) {
                massive2[j] = massive1[i];
                j++;
            }
        }
        return massive2;
    }

    public static double drobi(double chislitel1, double chislitel2, double znamenatel1, double znamenatel2) {
        double summadrobei = chislitel1 / znamenatel1 + chislitel2 / znamenatel2;
        return summadrobei;
    }
}

