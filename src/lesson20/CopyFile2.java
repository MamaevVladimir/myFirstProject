package lesson20;

import java.io.RandomAccessFile;

public class CopyFile2 {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("resources/rtest.dat", "rw");
// name это путь к файлу (изначально может не существовать), mode модель файла,
            // rw: read, write чтение и запись одновременно
            // Записать в файл 10 чисел и закрыть файл
            for (int i = 0; i < 10; i++)
                rf.writeDouble(i * 1.414);//метод write работает со всеми примитивными типами и также с Object
            rf.close();// закрыли файл
// Открыть файл, записать в него еще одно число и снова закрыть
            rf = new RandomAccessFile("resources/rtest.dat", "rw");
            rf.seek(5 * 8);// указание позиции
            rf.writeDouble(47.0001);
            rf.close();
// Открыть файл с возможностью только чтения "r"
            rf = new RandomAccessFile("resources/rtest.dat", "r");
// Прочитать 10 чисел и показать их на экране
            for (int i = 0; i < 10; i++)
                System.out.println("Value " + i + ": " + rf.readDouble());
            rf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
