package lesson11;

public class Main {
    public static void main(String[] args) {

        //ZooAnimal animal = new ZooAnimal();// если класс указан как abstract,
        // то его объект создать нельзя (класс ZooAnimal абстрактный)

        Zoo zoo = new Zoo(100000);// можно было вызвать пустой конструктор либо
        // конструктор с входящим параметром

        //Zoo zoo1 = new Zoo(100000);
        //zoo1.buyAnimal();

        Tiger tiger = new Tiger(20000, 250);// одной строкой т.к. в Tiger есть конструктор
        //tiger.setCost(2000);

        Popugay popugay1 = new Popugay(40000, 8);
        Popugay popugay2 = new Popugay(10000, 4);
        Monkey monkey1 = new Monkey(20000, 80);
        Monkey monkey2 = new Monkey(12000, 150);

        zoo.buyAnimal(popugay1);
        zoo.buyAnimal(popugay2);
        zoo.buyAnimal(monkey2);
        zoo.buyAnimal(tiger);
        zoo.buyAnimal(monkey1);

        zoo.printAnimal();

        zoo.voice();

        zoo.mostExpensiveAnimal();

        zoo.summaStoimostiAll();

        zoo.mostInexpensiveAnimal();

        zoo.financeOfZoo();

        zoo.mostHeavyWeightAnimal();
    }
}

