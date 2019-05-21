package lesson7;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Какую операцию необходимо сделать?");
        String operation = Calculator.getOperation();

        System.out.println("Введите первое число: ");
        int num1 = Calculator.getNumber();

        System.out.println("Введите второе число: ");
        int num2 = Calculator.getNumber();

        Calculator.printResult(operation, num1, num2);

    }
}
