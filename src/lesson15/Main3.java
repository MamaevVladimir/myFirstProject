package lesson15;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        HashSet<String> texts = new HashSet<>();
        texts.add("qwwwa"); // при запуске дубликат не сохраняется, меняется порядок вхождения
        // элементов и нет индекса. Если хотим сохранить порядок вхождения,
        // вместо HashSet используем LinkedHashSet
        texts.add("s");
        texts.add("d");
        texts.add("a");
        texts.add("qwwwa");

        System.out.println("-------");

        for (String t : texts) {
            System.out.println(t);
        }
    }
}