package lesson15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Коллекция это массив, в котором динамически меняется длина,
        // то есть массив без размера, в нём столько элементов сколько нам нужно
        ArrayList<String> texts = new ArrayList<>(); // в углах указан дженерик, тип данных коллекции
        texts.add("a"); // метод add
        texts.add("s");
        texts.add("d");
        texts.add("f");
        texts.add("g");

        texts.add("aa");
        texts.add("ss");
        texts.add("dd");
        texts.add("ff");
        texts.add("gg");

        texts.add("aaa");

        texts.add(0, "!!!");

        texts.set(0, "???");

        texts.remove("gg");

        String firstElement = texts.get(0);
        System.out.println(firstElement);

        System.out.println("-------");

        System.out.println(texts.size()); // способ показать размер коллекции, возвращает int

        // Если хотим вывести на консоль каждый элемент. Можно циклом for
        // или циклом foreach

        for (String t : texts) {// тип данных, текущий элемент t, название коллекции
            System.out.println(t);

        }

    }
}
