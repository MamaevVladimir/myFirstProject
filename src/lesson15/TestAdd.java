package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestAdd {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();// узнаём время для подсчёта выполнения
        for (int i = 0; i < 100000; i++) {
            arrayList.add("dfjf" + i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Время выполнения ArrayList: " + (endTime - startTime));

        LinkedList<String> linkedList = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();// узнаём время для подсчёта выполнения
        for (int i = 0; i < 100000; i++) {
            linkedList.add("dfjf" + i);
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println("Время выполнения LinkedList: " + (endTime1 - startTime1));


        long startTime2 = System.currentTimeMillis();// узнаём время для подсчёта выполнения
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println("Время выполнения ArrayList GET: " + (endTime2 - startTime2));


        long startTime3 = System.currentTimeMillis();// узнаём время для подсчёта выполнения
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long endTime3 = System.currentTimeMillis();

        System.out.println("Время выполнения LinkedList GET: " + (endTime3 - startTime3));
    }
}
