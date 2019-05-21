package lesson4;

public class Main6 {
    public static void main(String[] args) {
//        String text = "I am learning Java";
//
//        String[] words =  text.split( " ");
//        for (String currentText : words) {
//            System.out.println(currentText);
//        }

        String text = "I am,  learning  java!233 dfe,     ";
        String text1 = text.replace(",", "");
        String words2 = text1.replace("  ", " ");
        System.out.println(words2);

    }

}

