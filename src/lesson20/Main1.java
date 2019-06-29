package lesson20;

import java.io.File;
import java.io.FileFilter;

public class Main1 {
    public static void main(String[] args) {// заход в src и печать папок содержащих lesson
// постановка курсора на src, дальше создаём File
        File src = new File("src");
        // среди методов listFiles выбираем тот который с фильтром (перегрузка метода)
        // FileFilter: интерфейс. При указании в круглых скобках его выводится с тремя точками,
        // подразумевает наличие тела внутреннего безымянного класса. Этот класс не будет
        // иметь имени, но тело относится к этому классу. Этот класс реализует интерфейс FileFilter,
        // внутри класса будет создан объект
        // Как бы создаём объект интерфейса FileFilter
        File[] allFiles = src.listFiles(new FileFilter() {// ожидаются файлы allFiles,
            // проходящие через данный фильтр
            @Override
            public boolean accept(File pathname) {// метод accept принимает File pathname
                // и показывает подходит или нет этот файл
                if (pathname.isFile()) {// ищем папки, потому фильтр на отсеивание файлов
                    return false;
                }
                if (pathname.getName().startsWith("lesson")) {
                    return true;
                }
                if (pathname.getName().indexOf("1") != -1) {
                    return true;
                }
                return false;
            }
        });// сократили код, не создавая отдельный файл, а создавая внутри другого файла

        for (File f : allFiles) {
            System.out.println(f.getName());
        }
    }
}
