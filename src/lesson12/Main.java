package lesson12;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl number1 = new FractionNumberImpl(1, 4);

        FractionNumberImpl number2 = new FractionNumberImpl();
        number2.setDividend(3);
        number2.setDivisor(5);

        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();

        FractionNumber resultAdd = operation.add(number1, number2);

        FractionNumber resultSub = operation.sub(number1, number2);

        FractionNumber resultMul = operation.mul(number1, number2);

        resultAdd.printToConsole();

        resultSub.printToConsole();

        resultMul.printToConsole();

    }
}
