package lesson16;

import java.util.Comparator;

public class CompareHiToLow implements Comparator<Tovar> {

    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getPrice() != o2.getPrice()) {
            return o2.getPrice() - o1.getPrice();
        }// почему не делаем таким образом как во втором if c compareTo.
        // Здесь int возвращает, а не Integer

        // если цены совпали, сравниваем по названию
        if (!o1.getName().equals(o2.getName())) {// если наименования не совпадают
        return o2.getName().compareTo(o1.getName());
        }
        return o2.getRate() - o1.getRate();// если if не сработали
    }
}
// чтобы передать данный способ сортировки в TreeSet. В public class Magazine,
// в TreeSet<Tovar> tovarsHiToLow = new TreeSet<>(СЮДА КЛАДЁМ ОБЪЕКТ КЛАССА CompareHiToLow)