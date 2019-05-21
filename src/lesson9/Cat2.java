package lesson9;

public class Cat2 {
    private String poroda;
    private int age;
    private double dlinaHvosta;

    public Cat2() {

    }

    public Cat2(int newAge, String por, double dh) {//удобен если параметры заранее не известны
        age = newAge;
        poroda = por;
    dlinaHvosta = dh;
    }

}
