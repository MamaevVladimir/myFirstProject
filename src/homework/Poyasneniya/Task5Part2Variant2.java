package homework.Poyasneniya;

public class Task5Part2Variant2 {
    public static void main(String[] args) {
        String text1 = "I am a student";
        String text2 = "I am a teacher";

        for (int i =0; i < text1.length();i++){
            for (int j = 0; j < text2.length(); j++){
                if (text1.charAt(i) == text2.charAt(j) && text1.charAt(i) != ' '){
                    System.out.println(text1.charAt(i));
                    break;
                }
            }
        }
    }
}
