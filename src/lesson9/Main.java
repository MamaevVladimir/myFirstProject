package lesson9;

public class Main {
    public static void main(String[] args) {
        Phone meizu = new Phone();// создание объектов Phone (справа) с
        Phone saomi = new Phone();// двумя ссылками. Тип данных Phone (слева)

        meizu.setPrice(10000);// значение 10000 передаётся в метод
        saomi.setPrice(8000);
        meizu.setDiagonal(25);
        saomi.setDiagonal(26);

        System.out.println(meizu.getDiagonal());
    }
}
