package lesson18;

public class Main1 {
    public static void main(String[] args) {
        Tournir tournir = new Tournir();
        tournir.addCommand("Динамо", 12);
        tournir.addCommand("Шахтёр", 3);
        tournir.addCommand("Мадрид", 15);
        tournir.addCommand("Ливерпуль", 17);
        tournir.addCommand("Манчестер", 5);
        tournir.addCommand("Шахтёр", 4);

        tournir.printToConsoleRate();
        tournir.printCommandVictory();

        tournir.minusBal("Шахтёр", 3);
        tournir.printToConsoleRate();

        tournir.sredniyBall();

        tournir.sortRating();
    }
}
