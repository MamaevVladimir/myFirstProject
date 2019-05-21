package lesson10.praktika;

public class Krug extends Figura {
    private int a;

    public Krug() {
    }

    public Krug(int a) {
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
        System.out.println("Площадь круга: " + (3.14 * a * a));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Длина круга: " + (2 * 3.14 * a));
    }
}
