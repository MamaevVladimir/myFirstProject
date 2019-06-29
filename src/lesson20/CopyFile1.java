package lesson20;

import java.io.*;// * означает импорт всех файлов из данной библиотеки

public class CopyFile1 {
    public static void main(String[] args) {
        try {
            // Создаем буферизованный  символьный входной поток
            // Входной это место откуда считываем, символьный значит используем Reader,
            // буферизованный значит считываем не сами по себе байты, а через буфер
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            // В данном случае считывание с клавиатуры через буфер
            // Используем класс PrintWriter для вывода
            PrintWriter out = new PrintWriter(new FileWriter("resources/data.txt"));// сюда вписываем
            // Записываем строки, пока не введем строку "stop"
            while (true) {
                String s = in.readLine();// с клавиатуры методом readline считываем введённую строку
                if (s.equals("stop"))// если с клавиатуры ввели stop цикл останавливается
                    break;
                out.println(s);// если не stop, строка вводится в объект out
            }
            out.close();
        } catch (IOException ex) {// catch никогда не должен быть пустым
            ex.printStackTrace();
            // Обработать исключение
        }
    }
}
// data.txt автоматически создаётся в resources
// при запуске программа ожидает ввода в панель. Ввод до тех пор пока не вписали stop
// при вводе stop программа завершает работу

// RandomAccessFiles одновременно и Reader, и Writer. Может одновременно записывать и считывать