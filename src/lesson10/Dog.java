package lesson10;

public class Dog extends Animal {
    public void printToConsol(){
        System.out.println("Собака с возрастом  " + this.getAge());// this тот объект у которого
        // будет вызван вывод на консоль, неявный параметр

    }
}
