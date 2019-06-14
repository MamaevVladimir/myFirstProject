package lesson18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> spisok = new HashMap<>();
        spisok.put("Яблоко", 3);// при повторении ключей первые данные сотрутся вторыми
        spisok.put("Груша", 2);// Задача HashMap иметь все ключи, но не хранить.
        spisok.put("Слива", 6);// Потому вывод по ключам в алфавитном порядке.
        spisok.put("Киви", 1);// Вывод в порядке ввода: через LinkedHashMap

        System.out.println(spisok);// по умолчанию вызовется метод String, он реализован в HashMap

        System.out.println(spisok.get("Киви"));// вытаскивание по ключу
        // если ключ не совпадает вернёт null
        // Внутри интерфейса HashMap есть ещё один (Entry), он описывает пару ключ-значение как один объект

        // Первый способ прохода
        for (Map.Entry<String, Integer> para : spisok.entrySet()) {// вводим Entry, затем импорт Map,
            // значение текущая пара
            System.out.println(para.getKey());
            System.out.println(para.getValue());

            // Второй способ: по ключу достать значение
            for(String key : spisok.keySet()){// key текущий ключ
                System.out.println(key);
                System.out.println(spisok.get(key));// по ключу get


            }

        }

    }
}
