package lesson5;

public class Main1 {
    public static void main(String[] args) {// замена букв в строке буквами из массива
        char[] qwer = {'q', 'w', 'e', 'r',};
        char[] abcd = {'a', 'b', 'c', 'd'};

        char[] qwerBig = {'Q', 'W', 'E', 'R',};
        char[] abcdBig = {'A', 'B', 'C', 'D'};

        String text = "I am happy to learning java";
        char[] textMassive = text.toCharArray(); // длина текста и массива  в данном случае одинаковая

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < qwer.length; j++) {
                if (textMassive[i] == qwer[j]) {
                    textMassive[i] = abcd[j];
                }
            }
        }

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < qwerBig.length; j++) {
                if (textMassive[i] == qwerBig[j]) {
                    textMassive[i] = abcdBig[j];
                }

            }

        }
        System.out.println(textMassive);
    }
}
