package homework.lesson6;

public class Resheniya {
    public static void main(String[] args) {
        int ploschadTreugolnika = Metodi.ploschadTreugolnika(7, 8, 9);
        System.out.println(ploschadTreugolnika);

        int[] chetChisla = Metodi.chetChisla(56, 35, 76, 44, 23);
        for (int i = 0; i < chetChisla.length; i++) {
            System.out.println(chetChisla[i]); // показывает чётные числа, но вместе с ними выводит нули
        }

        double summadrobei = Metodi.drobi(3, 4, 4, 5);
        System.out.println(summadrobei);
    }
}
