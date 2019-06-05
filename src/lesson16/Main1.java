package lesson16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 2, 1900);
        Coin coin2 = new Coin(5, 2, 1900);
        Coin coin3 = new Coin(1, 5, 1800);
        Coin coin4 = new Coin(2, 2, 1950);
        Coin coin5 = new Coin(10, 2, 1900);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin coin : coins) {
            System.out.println(coin);// добавились также две одинаковые монеты, хотя Set не допускает дубликатов
            // Потому что срабатывает метод equals, а он изначально неверный, т.е. его надо переопределять.
            // Т.е. если хотим класть в коллекцию разный тип данных, надо переопределять
            // метод equals и hashCode. После переопределения этих методов дубляж
            // в выдаваемых результатах убрался. Если нужно чтобы объекты
            // были в том же порядке что их добавляют, то используют LinkedHashSet вместо HashSet
        }

        // Если хотим хранить объекты внутри TreeSet,
        // у данного класса должен быть метод compareTo

    }
}
