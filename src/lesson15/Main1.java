package lesson15;

import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {

        LinkedList<String> texts = new LinkedList<>();
        texts.add("a");
        texts.add("s");
        texts.add("d");
        texts.add("f");
        texts.add("g");

        System.out.println(texts.size());

        for (String t : texts) {
            System.out.println(t);
        }
    }
}