package lesson13;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.go();

        Man man = new Man();// слева вместо Man можно поставить Human. Либо Object.
        // При Object код ругается, поскольку отрубает метод нижестоящего класса.
        // Смысл замены на Object: если требуется объекты множества
        // типов данных поместить в один массив
        // "Другая" ссылка слева может быть толька та что по иерархии выше
        man.go();
    }
}
