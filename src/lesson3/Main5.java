package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int a = 9;
        String text = "ghdkfhgghfd";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");

        String inputName = scanner.nextLine();
        System.out.println("Привет, " + inputName);

        System.out.println("Введите 1-ю сторону треугольника: ");
        int storonaA = scanner.nextInt();

        System.out.println("Введите 2-ю сторону треугольника: ");
        int storonaB = scanner.nextInt();

        System.out.println("Введите 3-ю сторону треугольника: ");
        int storonaC = scanner.nextInt();

        System.out.println("Площадь или периметр?");
        String action = scanner.next();

        if (action.equals("периметр")) {
            System.out.println("Периметр треугольника = " + (storonaA + storonaB + storonaC));

        }


    }

}
