package lesson10.praktika;

public class Kvadrat extends Figura {
    private int a;

    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }


    @Override
    public void printPloschad() {
        System.out.println("Площадь квадрата: " + (a * a));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр квадрата: " + (4 * a));
    }
}
