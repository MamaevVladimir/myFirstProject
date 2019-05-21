package lesson7;

import java.util.Scanner;

public class Calculator {

    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        String inputAction = scanner.nextLine();
        if (inputAction.equals("-") || inputAction.equals("+") ||
                inputAction.equals("*") || inputAction.equals("/")) {
            return inputAction;
        } else {
            System.out.println("Неверное действие. Повторите ввод:");
            return Calculator.getOperation();
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        char[] charsFromInputNumber = inputNumber.toCharArray();
        for (int i = 0; i < charsFromInputNumber.length; i++) {
            if (charsFromInputNumber[i] != '0' && charsFromInputNumber[i] != '1' && charsFromInputNumber[i] != '2' &&
                    charsFromInputNumber[i] != '3' && charsFromInputNumber[i] != '4' && charsFromInputNumber[i] != '5' &&
                    charsFromInputNumber[i] != '6' && charsFromInputNumber[i] != '7' && charsFromInputNumber[i] != '8' &&
                    charsFromInputNumber[i] != '9') {
                return Calculator.getNumber();

            }
        }

        int num = Integer.parseInt(inputNumber);
        return num;
    }

    public static void printResult(String operation, int num1, int num2) {
        if (operation.equals("+")){
            System.out.println("Результат сложения =  " + (num1 + num2));
        }

        if (operation.equals("-")){
            System.out.println("Резкльтат вычитания =  " + (num1 - num2));
            }

        if (operation.equals("*")){
            System.out.println("Резкльтат умножения =  " + (num1 * num2));
        }

        if (operation.equals("/")){
            System.out.println("Резкльтат деления =  " + (num1 / num2));
        }

    }

}

