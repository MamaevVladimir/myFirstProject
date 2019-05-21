package homework.lesson5;

public class Task5Part2 {
    public static void main(String[] args) {
        String text = "Java is often used in programming";
        char[] charsFromText = text.toCharArray();
        char[] pascal = "Pascal was developed early than Java".toCharArray();

        char[] count = new char[pascal.length];
        for (int i = 0; i < charsFromText.length; i++) {
            int countCurrentChar = 0;
            for (int j = 0; j < text.length(); j++) {
                if (pascal[i] == text.charAt(j)) {
                    count[i] = pascal[i];
                }
            }
        }
        for (int i = 0; i < text.length(); i++) {
            System.out.println(count[i]);
        }
    }
}