package homework.lesson4;

public class Task4Part4Variant2 {
    public static void main(String[] args) {
        String text = "Are you ready to start studying of programming?";

        char[] massive = {'a', 'b', 'c', 'd'};
        char[] massive1 = {'q', 'w', 'e', 'r'};

        for (int i = 0; i <= massive.length - 1; i--) {
            if (i == 0 || i == 10 || i == 11 || i == 19 || i == 26) {
                String stroka1 = text.replace('a', 'q');
                String stroka2 = stroka1.replace('d', 'r');
                String stroka3 = stroka2.replace('A', 'q');
                System.out.println(stroka2);

                // ноль в цикле не читает поэтому 'A' сохраняется
            }
        }
    }
}
