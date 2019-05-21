package lesson10.praktika;

public class Pramougilnik extends Figura {
    private int a;
    private int b;

    public Pramougilnik() {
    }

    public Pramougilnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void printPloschad() {
        System.out.println("Площадь прямоугольника: " + (a*b));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр прямоугольника: " + (2*(a + b)));
    }
}
