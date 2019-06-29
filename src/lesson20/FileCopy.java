package lesson20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("resources/Cat.jpg"));
            // внутри одного объекта создаётся ещё один
            // FileInputStream место откуда считываются байты, дальше в круглых скобках
            // путь к файлу. Если указать от самого корня (C:\Users\...) это абсолютный путь.
            // В данном случае указан относительный. Он относительно какой-то папки
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("resources/Cat-copy.jpg"));
            // BufferedInputStream красный цвет при вставке, нужны импорты. Чтобы убрать красный,
            // курсор на красное и Import Class и то же самое с FileInputStream
            // Блок try: смысл его в том что в этой части кода может быть какая-либо ошибка
            // Часть с BufferedInputStream является обёрткой для FileInputStream,
            // со второго (файла) считывается в первое (буфер) и буфер будет переводиться
            // Из FileInputStream (первая строка) вписывается в FileOutputStream (вторая строка).
            // Во второй строке всегда указывается название файла, который ещё не существует
            int c = 0;// отображает число, поскольку байт это число
            while (true) {// крутим бесконечный цикл
                c = bis.read();// один байт взяли с картинки и проверяем if
                if (c != -1)// схема с int по break отображает перевозку по одному байту с одного места на другое
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        } catch (java.io.IOException e) {// catch перехватывает проверяемое исключение IOException
            System.out.println(e.toString());
        }
    }

}
// Если в блоке try обнаружена ошибка, управление передаётся в catch и выполнится то что внутри блока catch
// Перехватывается catch та ошибка что указана в круглых скобках catch