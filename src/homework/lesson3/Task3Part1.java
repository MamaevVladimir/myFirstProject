package homework.lesson3;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Task3Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Площадь (нажмите 1) или длина круга (нажмите любую клавишу)? ");
        String action = scanner.next();

        if (action.equals("1")) {
            System.out.println("Через радиус (нажмите 1) или диаметр (нажмите любую клавишу) определяем площадь круга? ");
            String action1 = scanner.next();

            if (action1.equals("1")) {
                System.out.println("Введите длину радиуса:     ");
                int radius = scanner.nextInt();
                int ploschad = (int) (PI * radius * radius);
                System.out.println("Площадь круга: " + ploschad);
            } else {
                System.out.println("Введите длину диаметра:     ");
                int diametr = scanner.nextInt();
                int ploschad = (int) (PI * diametr * diametr / 4);

                System.out.println("Площадь круга: " + ploschad);
            }
        } else {
            System.out.println("Через радиус (нажмите 1) или диаметр (нажмите любую клавишу) определяем длину круга? ");
            String action2 = scanner.next();

            if (action2.equals("1")) {
                System.out.println("Введите длину радиуса:     ");
                int radius = scanner.nextInt();
                int ploschad = (int) (2 * PI * radius * radius);
                System.out.println("Площадь круга: " + ploschad);
            } else {
                System.out.println("Введите длину диаметра:     ");
                int diametr = scanner.nextInt();
                int ploschad = (int) (PI * diametr * diametr);

                System.out.println("Площадь круга: " + ploschad);
            }
        }

    }
}








