package homework.lesson3;

import java.util.Scanner;

public class Task3Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Площадь (нажмите 1) или периметр (нажмите любую клавишу) параллелограмма?   ");
        String action = scanner.next();

        if (action.equals("1")) {
            System.out.println("Через основание и высоту определяем площадь (нажмите 1) или через две стороны и угол между ними (нажмите любую клавишу) ? ");
            String action1 = scanner.next();

            if (action1.equals("1")) {
                System.out.println("Введите длину основания:     ");
                int osnovanie = scanner.nextInt();
                System.out.println("Введите длину высоты:     ");
                int vysota = scanner.nextInt();
                int ploschad = (int) (osnovanie * vysota);
                System.out.println("Площадь параллелограмма: " + ploschad);
            } else {
                System.out.println("Введите длину первой стороны:     ");
                int dlina1 = scanner.nextInt();

                System.out.println("Введите длину второй стороны:     ");
                int dlina2 = scanner.nextInt();

                System.out.println("Введите число от 1 до 89 градусов угла между сторонами ");
                double degrees = scanner.nextInt();
                double radians = Math.toRadians(degrees);

                int ploschad = (int) (dlina1 * dlina2 * Math.sin(radians));
                System.out.println("Площадь параллелограмма: " + ploschad);
            }
        } else {
            System.out.println("Введите длину первой стороны:     ");
            int dlina1 = scanner.nextInt();

            System.out.println("Введите длину второй стороны:     ");
            int dlina2 = scanner.nextInt();

            int perimetr = 2 * (dlina1 + dlina2);
            System.out.println("Периметр параллелограмма: " + perimetr);
        }
    }

}

