package lesson5;

public class Main7 {
    public static void main(String[] args) {// к каждой букве в строке вывести порядковый номер её в алфавите
        String text = "language java";
        char[] charsFromText = text.toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";// сделали строкой, а не массивом, т.к. надо применить метод.
        // у строки метод есть, у массива нет
        for (int i = 0; i < charsFromText.length; i++) {
            System.out.println(charsFromText[i] + "-" + alphabet.indexOf(charsFromText[i]));
        }
    }
}
