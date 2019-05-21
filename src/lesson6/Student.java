package lesson6;

import java.util.Scanner;

public class Student {


    // формула создания метода
    // 1- модификатор доступа (public, private, protected, пустое место)
    // public - доступ по всему проекту
    // пустое место - доступ внутри текущей папки
    // protected - доступ только внутри текущего класса, и его наследники
    // private доступ только внутри текущего класса
    // 2- слово static есть, или его нет
    // 3 - возвращаемый тип (int, String, char[].....) или если нет возвращаемого типа - to void
    // 4 - название метода (придумываем в произвольной форме сами)
    // 5- входящие параметры в круглых скобках через запятую (тип и название переменной)
    // 6 -  в фигурных скобках тело метода. Т.е то что будет выполняться когда этот метод вызовут
    // 7 - return : возвращаемое значение, тоn же тип что и возвращаемый


    public static int summaTrexChisel(int a, int b, int c) {
        int summa = a + b + c;
        return summa;
    }

    public static int summaPerimetr(int d, int e) {
        int summa1 = 2 * (d + e);
        return summa1;
    }

    public static void printHello(int skolkoRazVivesti) {
        for (int i = 0; i < skolkoRazVivesti; i++) {
            System.out.println("Hello");

        }
    }

    public static void chetNechet(int number) {
        if (number % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}






