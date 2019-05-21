package homework.lesson4;

public class Task4Part3 {
    public static void main(String[] args) {
        String text = "abcd";

        char[] nov = text.toCharArray();
        for (int i = 3; i >= 0; i--) {
            if (nov[i] == 'a' || nov[i] == 'b' || nov[i] == 'c' || nov[i] == 'd') {
                char result = nov[i];
                System.out.println(result);

            }

        }
    }
}

