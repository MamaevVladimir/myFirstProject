package lesson9;

public class Main {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        Phone saomi = new Phone();

        meizu.setPrice(10000);
        saomi.setPrice(8000);
        meizu.setDiagonal(25);
        saomi.setDiagonal(26);

        System.out.println(meizu.getDiagonal());
    }
}
