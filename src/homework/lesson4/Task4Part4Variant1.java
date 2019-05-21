package homework.lesson4;

public class Task4Part4Variant1 {
    public static void main(String[] args) {

        String text = "Are you ready to start studying of programming?";

        String[] words = text.split("");

        for (String currentText : words) {
            String currentText1 = currentText.replace('a', 'q');
            String currentText2 = currentText1.replace('d', 'r');
            String currentText3 = currentText2.replace('A', 'q');
            System.out.println(currentText3);
        }
    }
}







