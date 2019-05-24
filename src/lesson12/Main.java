package lesson12;

public class Main {// структуры которые в Java: класс, абстрактный класс и интерфейс

    public static void main(String[] args) {
        FractionNumberImpl number1 = new FractionNumberImpl(1, 4);

        FractionNumberImpl number2 = new FractionNumberImpl();

        number2.setDividend(3);
        number2.setDivisor(5);

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        // создание объекта делать действия с дробями

        FractionNumber resultAdd = operation.add(number1, number2);

        FractionNumber resultSub = operation.sub(number1, number2);

        FractionNumber resultMul = operation.mul(number1, number2);

        FractionNumber resultDiv = operation.div(number1, number2);
        // для вывода результатов делаем метод printToConsole в интерфейсе FractionNumber

        resultAdd.printToConsole();

        resultSub.printToConsole();

        resultMul.printToConsole();

        resultDiv.printToConsole();
    }
}
