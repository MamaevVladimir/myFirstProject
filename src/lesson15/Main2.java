package lesson15;

import java.util.Iterator;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        //long ---- Long; // классы обёртки для примитивных типов. Хранить примитивные типы
        // внутри коллекции нельзя. Поэтому вместо примитивных типов
        // в коллекции указыввают их обёртки
        // int ---- Integer;
        // char ---- Character;
        //byte ---- Byte
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);// 4 автоматически конвертируется в Integer
        numbers.add(34);
        numbers.add(225);
        numbers.add(412);

        // первый способ прохода по коллекции - for each

        for (Integer n : numbers) {
            System.out.println(n);
        }
        System.out.println("-------------");

        // второй способ с помощью обычного цикла for, который генерирует индексы
        for (int i = 0; i < numbers.size(); i++) {// numbers.size: длина коллекции
            System.out.println(numbers.get(i));// текущий элемент коллекции
        }
        System.out.println("-------------");

        // третий способ прохода c помощью итератора
        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext(); ) {// итератор. Например, напрямую из коллекции (мешок) брать нельзя,
            // можно с помощью щипцов (итератор). Итератор находится внутри коллекции,
            // достаём его в первом блоке в круглых скобках. Дальше крутим цикл пока есть
            // следующий элемент (метод hasNext). Третий блок пустой, поскольку пока итератор крутит цикл,
            // он автоматически отдаёт следующий элемент внутри тела цикла for. Преимущество итератора:
            // в некоторых коллекциях нет индексов и тогда обычный цикл for не работает
            System.out.println(iter.next());

        }

    }
}
