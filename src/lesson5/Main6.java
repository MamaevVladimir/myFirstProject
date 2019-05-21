package lesson5;

public class Main6 {
    public static void main(String[] args) {// слова в обратном порядке
        String text = "orange mango apple";
        String[] words = text.split(" ");
        String[] wordReverse = new String [words.length];

//        wordReverse[0] = words[2];
//        wordReverse[1] = words[1];
//        wordReverse[2] = words[0];

        for (int i = 0, j = words.length - 1; i < words.length;  i++, j--){wordReverse[i] = words[j];
            System.out.println(wordReverse[i]);
        }
    }
}
