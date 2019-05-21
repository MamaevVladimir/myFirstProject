package lesson4;

public class Main7 {
    public static void main(String[] args) {
        String text = "I am learning Java";
        String text1= text.replace  ("I", "?");
        String text2 = text1.replace("i", "?");
        String text3 = text2.replace("a", "?");
        String text4 = text3.replace("e", "?");

        System.out.println(text4);
            }
}
