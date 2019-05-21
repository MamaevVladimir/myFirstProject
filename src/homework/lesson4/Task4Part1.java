package homework.lesson4;

public class Task4Part1 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";  //была идея менее "топорного" решения:
        // перевести каждое слово в предложении из String в int, создать массив и применить цикл for.
        // Или создать массив char и перевести в массив int. Но это оказалось сложным и неясным


        int start1 = 0;
        int end1 = 2;
        char[] a = new char[end1 - start1];
        text.getChars(start1, end1, a, 0);

        int start2 = 2;
        int end2 = 4;
        char[] b = new char[end2 - start2];
        text.getChars(start2, end2, b, 0);

        int start3 = 5;
        int end3 = 10;
        char[] c = new char[end3 - start3];
        text.getChars(start3, end3, c, 0);

        int start4 = 11;
        int end4 = 13;
        char[] d = new char[end4 - start4];
        text.getChars(start4, end4, d, 0);

        int start5 = 14;
        int end5 = 22;
        char[] e = new char[end5 - start5];
        text.getChars(start5, end5, e, 0);

        int start6 = 23;
        int end6 = 27;
        char[] f = new char[end6 - start6];
        text.getChars(start6, end6, f, 0);

        System.out.println(f);
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}