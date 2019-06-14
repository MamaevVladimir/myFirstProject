package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : a) {
            result.add(number);
        }

        for (Integer number : b) {
            result.add(number);
        }

        return result;// поскольку нет слова static, надо создать объект. В Main4 создаём
        // CollectionUtils utils
        // Collection<Integer> это возвращаемый  тип, указываем его в Main4
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
      ArrayList<Integer> result1 = new ArrayList<>();
        for (Integer number : a) {
            for (Integer number1 : b) {
                for (int i = 0; i<result1.size();i++){
                    for (int j =0; j<result1.size(); j++){
                        if (result1.get(i) == result1.get(j)){
                            result1.add(number, number1);
                        }
                    }
                }

        }


        }

      /*   ArrayList<Integer> number = new ArrayList<>();

        for (int i = 0; i < number.size(); i++){

            for (int j = 0; j < number.size(); j++){
                if (number.get(i) == number.get(j)){
                    result1.add(number.get(i),number.get(j));
                }
            }
        }*/
        return result1;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return null;
    }
}
