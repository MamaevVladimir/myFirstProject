package homework.lesson3;

import java.util.Scanner;

public class Task3Part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Площадь конуса (нажмите 1) или длина основания конуса (нажмите любую клавишу)? ");
        String action = scanner.next();

        if (action.equals("1")) {
            System.out.println("Введите длину радиуса основания конуса:     ");
            int radius = scanner.nextInt();

            System.out.println("Введите длину образующей конуса:     ");
            int obrazuyuschaya = scanner.nextInt();

            int ploschad = (int) (Math.PI * radius * (obrazuyuschaya + radius));
            System.out.println("Площадь конуса: " + ploschad);
        } else {
            System.out.println("Введите радиус основания конуса:     ");
            int radius = scanner.nextInt();
            int dlina = (int) (2 * Math.PI * radius);
            System.out.println("Длина основания конуса:      " + dlina);
        }
    }
}

