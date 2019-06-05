package lesson16;

import java.util.Comparator;

public class CompareByRate implements Comparator<Tovar> {

    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getRate() != o2.getRate()) {
            return o1.getRate() - o2.getRate();
        }

        if (o1.getPrice() != o2.getPrice()) {
            return o1.getPrice() - o2.getPrice();
        }
        return o1.getName().compareTo(o2.getName());
    }
}
