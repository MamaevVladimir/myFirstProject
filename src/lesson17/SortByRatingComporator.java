package lesson17;

import java.util.Comparator;

public class SortByRatingComporator implements Comparator<Otziv> {

    @Override
    public int compare(Otziv o1, Otziv o2) {
if(o1.getReiting() != o2.getReiting()){
    return o1.getReiting() - o2.getReiting();
}
    return o1.getOtziv().compareTo(o2.getOtziv());
    }
}
