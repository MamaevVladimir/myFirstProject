package lesson16;

public class Main3 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar(120, "Мышка", 5);
        Tovar tovar2 = new Tovar(990, "Клавиатура", 4);
        Tovar tovar3 = new Tovar(45000, "Ноутбук", 5);
        Tovar tovar4 = new Tovar(15000, "Монитор", 4);
        Tovar tovar5 = new Tovar(9000, "Телефон", 3);

        Magazine magazine = new Magazine();
        magazine.addTovar(tovar1);// сюда добавляются вышеперечисленные товары
        magazine.addTovar(tovar2);
        magazine.addTovar(tovar3);
        magazine.addTovar(tovar4);
        magazine.addTovar(tovar5);

        magazine.printTovarByPriceHiToLow();
        System.out.println("__________________");
        magazine.printTovarByPriceLowToHi();
        System.out.println("__________________");
        magazine.printTovarByName();
        System.out.println("__________________");
        magazine.printTovarByRate();
    }
}
