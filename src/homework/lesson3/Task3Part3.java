package homework.lesson3;

import java.util.Scanner;

public class Task3Part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Площадь (нажмите 1) или периметр шестиугольной пирамиды (нажмите любую клавишу)? ");
        String action = scanner.next();

        if (action.equals("1")) {
            System.out.println("Введите длину апофемы:     ");
            int apofema = scanner.nextInt();
            System.out.println("Введите длину стороны основания:     ");
            int storona = scanner.nextInt();
            int ploschadOsnovaniya = (int) (3 * Math.sqrt(3) * storona * storona) / 2;
            int ploschadPiramidy = ploschadOsnovaniya + (storona * 6 * apofema / 2);
            System.out.println("Площадь шестиугольной пирамиды: " + ploschadPiramidy);
        } else {
            System.out.println("Введите длину стороны основания:     ");
            int dlina = scanner.nextInt();
            int perimetr = dlina * 6;
            System.out.println("Периметр основания шестиугольной пирамиды:      " + perimetr);
        }
    }


}

