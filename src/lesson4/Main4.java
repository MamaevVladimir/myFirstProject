package lesson4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String login = "qwerty";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String inputLogin = scanner.nextLine();

        System.out.println("Введите пароль: ");
        String inputPassword = scanner.nextLine();

        //if (login.equals(inputLogin) && password.equals(inputPassword)) {
          //  System.out.println("Вход выполнен ");
       // } else {
            //System.out.println("Неверно ");
        //}

        if (login.equalsIgnoreCase(inputLogin) && password.equalsIgnoreCase(inputPassword)) {
            System.out.println("Вход выполнен ");
        } else {
            System.out.println("Неверно ");
        }
    }
}
