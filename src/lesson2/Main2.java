package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int money = 1003;
        int pizzaCoast = 230;
        int gumCoast = 26;
        double candyCoast = 2.5;

        int restAfterByPizza = money % pizzaCoast;
        System.out.println(restAfterByPizza);

        pizzaCoast++;
        ++pizzaCoast;

        System.out.println(pizzaCoast);
        System.out.println(++pizzaCoast); // при постфиксном инкременте выводит 232: сначала выводит на консоль без увеличения
        System.out.println(pizzaCoast);
        // обыкновенно инкремент и дикремент пишутся в коде отдельно без вставки в Sout (правила грамотного стиля)

        pizzaCoast += 5;
        System.out.println(pizzaCoast);


    }
}
