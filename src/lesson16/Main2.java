package lesson16;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet <String> texts = new TreeSet<>();// TreeSet способ хранения бинарное дерево
        // У каждой головы два корня, каждый из корней также является головой для
        // двух других корней. Задействуется метод compareTo.
        // Минусовое значение корня: помещается слева, плюсовое: справа,
        // нулевое (значение корня равно значению головы): в структуру не помещается.
        // Нижележащий корень сравнивается с верхней головой, затем с непосредственной головой

        texts.add("qqqqqqq");
        texts.add("aaaaaaa");
        texts.add("rrrrrrr");
        texts.add("vvvvvvv");

        for(String s : texts){
            System.out.println(s);
        }
    }
}
