package lesson11;

public class Tiger extends ZooAnimal {

    public Tiger() {
        super();// обращение к родительскому классу. Если после super точка, это вызов
        // метода из родительского класса. Если скобки, это вызов конструктора из родительского класса
        // Внутри каждого конструктора идёт вызов конструктора из родительского класса без параметров
        // автоматически, даже когда super не написано. Вызов конструктора идёт всегда первой строчкой
    }

    public Tiger(int cost, int weight) {
        super(cost, weight);// Поставить указатель на super и нажать F4: указание на родительский класс
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");

    }

    @Override
    public void printInfo() {
        System.out.println("Тигр со стоимостью = " + this.getCost());// this текущий
    }

    @Override
    public void printWeight() {
        System.out.println("Тигр с весом= " + this.getWeight());
    }
}
