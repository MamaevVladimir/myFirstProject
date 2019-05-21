package lesson13;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.go();

        Man man = new Man();// слева вместо Man можно поставить Human либо Object. Только то что по иерархии выше
        man.go();
    }
}
