package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class Magazine {
    private HashSet<Tovar> tovars = new HashSet<>();

    public Magazine() {
    }// конструктор с параметром здесь не нужен, он будет максимально неудобен.
    // Нужен метод add, добавить товар в магазин

    public void addTovar(Tovar tovar) {// в круглых скобках будет приходить один товар,
        // который должны добавить в магазин
        // Что добавляется в фигурные скобки: tovar из круглых скобок в tovars хэшсета
        tovars.add(tovar);

    }

    public void printTovarByPriceHiToLow() {
        // товары надо прокопировать в TreeSet, т.к. он сортируемый,
        // а затем TreeSet дать способ сортировки
        TreeSet<Tovar> tovarsHiToLow = new TreeSet<>(new CompareHiToLow());

        // способ сортировки compareTo
        // не можем прописать внутри <Tovar>. Нужно создать отдельный класс и в нём метод compareTo,
        // но поскольку мы находимся не внутри класса Tovar, метод будет называться
        // не compareTo, а compare
        tovarsHiToLow.addAll(tovars);

        // с помощью цикла пройтись по списку товаров в TreeSet и напечатать каждый элемент
        for (Tovar tovar : tovarsHiToLow) {
            System.out.println(tovar);// дальше вызываем метод в Main3
        }
    }

    public void printTovarByPriceLowToHi() {
        TreeSet<Tovar> tovarsLowToHi = new TreeSet<>(new CompareLowToHi());
        tovarsLowToHi.addAll(tovars);

        for (Tovar tovar : tovarsLowToHi) {
            System.out.println(tovar);
        }
    }

    public void printTovarByName() {
        TreeSet<Tovar> tovarsByName = new TreeSet<>(new CompareByName());
        tovarsByName.addAll(tovars);
        for (Tovar tovar : tovarsByName) {
            System.out.println(tovar);
        }
    }

    public void printTovarByRate() {
        TreeSet<Tovar> tovarsByRate = new TreeSet<>(new CompareByRate());
        tovarsByRate.addAll(tovars);
        for (Tovar tovar : tovarsByRate) {
            System.out.println(tovar);
        }
    }
}
