package lesson11;

public class Popugay extends ZooAnimal {

    public Popugay() {
    }

    public Popugay(int cost, int weight) {
        super(cost, weight);
    }

    @Override
    public void voice() {
        System.out.println("IIaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Попугай прыгает");

    }

    @Override
    public void printInfo() {
        System.out.println("Попугай со стоимостью = " + this.getCost());
    }

    @Override
    public void printWeight() {
        System.out.println("Попугай с весом = " + this.getWeight());
    }
}
