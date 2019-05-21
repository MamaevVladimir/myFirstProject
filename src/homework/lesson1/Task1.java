package homework.lesson1;

public class Task1 {
    public static void main(String[] args) {

        int summa = 1000;
        int tsenaPizza = 230;
        int tsenaGum = 26;
        double tsenaCandies = 2.5;
        char sdacha = '2';

        int s = summa;
        int a = tsenaPizza;
        int b = tsenaGum;
        double c = tsenaCandies;

        System.out.println("На данную сумму можно купить:");


        int chisloPizza = s / a;
        System.out.println(chisloPizza + " " + "пиццы");

        int chisloGum = (s - 4 * a) / b;
        System.out.println(chisloGum + " " + "жвачки");

        int chisloCandies = (s - (4 * a + 3 * b)) < c ? 0 : 1;
        System.out.println(chisloCandies + " " + "конфет");

        System.out.println("Сдача с магазина:" + " " + sdacha + " " + "рубля");

    }

}


