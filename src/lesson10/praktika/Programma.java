package lesson10.praktika;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Круг");

        Scanner scanner = new Scanner(System.in);// передача в конструктор объекта
        // вход в System  F4. In - ввод с клавиатуры, Out - вывод на экран
        String inputFigura = scanner.nextLine();// У объекта scanner считывается вся строка до Enter

        Figura figura = null; // поскольку ещё не знаем чему равняется
        if (inputFigura.equals("1")) {

            System.out.println("Введите сторону А:");
            String storonaA = scanner.nextLine();

            System.out.println("Введите сторону B:");
            String storonaB = scanner.nextLine();

            System.out.println("Введите сторону C:");
            String storonaC = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);
            int stC = Integer.parseInt(storonaC);

            figura = new Treugolnic(stA, stB, stC);// на переменную figura ложим треугольник с 3 сторонами

        }

        if (inputFigura.equals("2")) {

            System.out.println("Введите сторону прямоугольника А:");
            String storonaA = scanner.nextLine();

            System.out.println("Введите сторону прямоугольника B:");
            String storonaB = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);

            figura = new Pramougilnik(stA, stB);
        }

        if (inputFigura.equals("3")) {

            System.out.println("Введите сторону квадрата А:");
            String storonaA = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);

            figura = new Kvadrat(stA);
        }

        if (inputFigura.equals("4")) {
            System.out.println("Введите радиус круга А: ");
            String storonaA = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);

            figura = new Krug(stA);

        }
        // для последующих расчётов с первой или второй фигурой с целью избегать дубляжа кода
        // работать с треугольником и с прямоугольником как с одинаковой фигурой. Этого можно
        // добиться преобразованием обеих фигур к одному типу. То есть у них должен быть общий родитель.
        //  Figura


        System.out.println("Периметр или площадь?");

        String inputAction = scanner.nextLine();
        if (inputAction.equals("Периметр")) {
            figura.printPerimeter();
        } else {
            figura.printPloschad();

        } // данный куссок кода с System.out по if/else будет работать на любую фигуру

    }

}
