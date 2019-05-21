package lesson11;

public abstract class ZooAnimal {// если у класса убрать abstract, в нём нельзя
    // создавать методы без тела. Отличие класса abstract от обычного:
    // всё то же самое, только может содержать ещё абстрактные методы
    private int cost;

    private int weight;

    public ZooAnimal() {
    }

    public ZooAnimal(int cost, int weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void voice();//если один метод abstract то и весь класс тоже abstract

    public abstract void jump();

    public abstract void printInfo();// зелёным слева показано реализация в каких классах у метода

    public abstract void printWeight();
}
