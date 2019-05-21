package lesson2;

public class Main1 {
    public static void main(String[] args) {

        byte a =12;
        int b = a;
        int c = b;
        System.out.println(c);


        byte a1 =12;
        int b1= a1;
        byte c1 = (byte) b1;
        System.out.println(c1);

        int a2 = 1224;
        int b2= a2;
        byte c2 = (byte) b2;
        System.out.println(c2); // выводит не max 127, а другое число: обрежет первый байт с нулями и единицами



    }
}
