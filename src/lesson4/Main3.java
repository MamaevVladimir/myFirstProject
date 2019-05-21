package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String text = "qwertyihh";
        char[] simbolsFromText = text.toCharArray();

        // for (int i = 0; i < simbolsFromText.length; i++) {
        //     char result = simbolsFromText[i];
        //     System.out.println(result);
        // }

        for (int i = 0; i < simbolsFromText.length; i++) {

            if (simbolsFromText[i] == 'e' ||  simbolsFromText[i] == 'y' || simbolsFromText[i] == 'i') {
                char result = simbolsFromText[i];
                System.out.println(result);

            }

        }
    }
}

