package homework.lesson9;

public class Main {
    public static void main(String[] args) {
        Treugolnik ravnobedrennii = new Treugolnik();
        Kvadrat figura = new Kvadrat();
        Pryamougolnik figure = new Pryamougolnik();
        Krug figurae = new Krug();

        ravnobedrennii.setKolichestvoUglov(3);
        ravnobedrennii.setPloschad(2);
        ravnobedrennii.setStoroni("Три стороны");

        figura.setKolichestvoUglovKv(4);
        figura.setPloschadKv(2);
        figura.setStoroniKv("Четыре стороны");

        figure.setKolichestvoUglovPr(4);
        figure.setPloschadPr(4);
        figure.setStoroniPr("Четыре стороны");

        figurae.setKolichestvoUglovKr(0);
        figurae.setPloschadKr(3);
        figurae.setStoroniKr("Одна сторона");

        System.out.println(ravnobedrennii.getKolichestvoUglov());
        System.out.println(ravnobedrennii.getPloschad());
        System.out.println(ravnobedrennii.getStoroni());
        System.out.println(figura.getKolichestvoUglovKv());
        System.out.println(figura.getPloschadKv());
        System.out.println(figura.getStoroniKv());
        System.out.println(figure.getKolichestvoUglovPr());
        System.out.println(figure.getPloschadPr());
        System.out.println(figure.getStoroniPr());
        System.out.println(figurae.getKolichestvoUglovKr());
        System.out.println(figurae.getPloschadKr());
        System.out.println(figurae.getStoroniKr());

    }
}
