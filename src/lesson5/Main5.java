package lesson5;

public class Main5 {
    public static void main(String[] args) {
        String text = "java is interesting";// текст словами наоборот (avaj si nitseretni)

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(new StringBuilder(words[i]).reverse().toString());
        }
    }
}
