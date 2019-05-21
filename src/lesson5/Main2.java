package lesson5;

public class Main2 {
    public static void main(String[] args) {
        String text = "I like to learning java"; //вывести количество каждой буквы алфавита в тексте
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int[] count = new int[alphabet.length];
        for (int i = 0; i < alphabet.length; i++) {
            int countCurrentChar = 0;
            for (int j = 0; j < text.length(); j++) {
                if (alphabet[i] == text.charAt(j)) {
                    countCurrentChar++;
                }
            }
            count[i] = countCurrentChar;
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + "-" + count[i]);
        }
    }
}
