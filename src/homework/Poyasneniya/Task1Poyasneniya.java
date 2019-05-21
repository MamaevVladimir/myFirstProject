package homework.Poyasneniya;

public class Task1Poyasneniya {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaCoast = 230;
        int gumCoast = 26;
        double candyCoast = 2.5;

        int canByPizza = money / pizzaCoast;
        int restAfterByPizza = money - (canByPizza * pizzaCoast);

        int canByGum = restAfterByPizza / gumCoast;
        int restAfterByGum = restAfterByPizza - (canByGum * gumCoast);

        int canByCandy = (int)(restAfterByGum / candyCoast);
        double rest = restAfterByGum - (canByCandy * candyCoast);

        System.out.println("Мы можем купить:");
        System.out.println(canByPizza + " - пицц");
        System.out.println(canByGum + " - жвачек");
        System.out.println(canByCandy + " - конфет");
        System.out.println(rest + " - сдача");

    }
}
