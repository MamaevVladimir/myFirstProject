package lesson23;

import lesson20.FileCopyUtils1;

public class Main {
    public static void main(String[] args) {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA\\Занятие 3, 14-04-2019, курс Java - 4, EasyUM.mp4", "C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA-1\\Занятие 3, 14-04-2019, курс Java - 4, EasyUM COPY.mp4");
        CopyFileTaskImpl task2 = new CopyFileTaskImpl("C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA\\Занятие 5, 20-04-2019, Курс Java - 4, EasyUM.mp4", "C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA-1\\Занятие 5, 20-04-2019, Курс Java - 4, EasyUM COPY.mp4");
        CopyFileTaskImpl task3 = new CopyFileTaskImpl("C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA\\Занятие 6, 22-04-2019, Курс Java - 4, EasyUM.mp4", "C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA-1\\Занятие 6, 22-04-2019, Курс Java - 4, EasyUM COPY.mp4");
        CopyFileTaskImpl task4 = new CopyFileTaskImpl("C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA\\Занятие 7, 27-04-2019, курс Java -  4, EasyUM.mp4", "C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA-1\\Занятие 7, 27-04-2019, курс Java -  4, EasyUM COPY.mp4");
        CopyFileTaskImpl task5 = new CopyFileTaskImpl("C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA\\Занятие 8, 29-04-2019, курс Java - 4, EasyUM.mp4", "C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA-1\\Занятие 8, 29-04-2019, курс Java - 4, EasyUM COPY.mp4");
        CopyFileTaskImpl task6 = new CopyFileTaskImpl("C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA\\Занятие 9, 06-05-2019, курс Java-4, EasyUM.mp4", "C:\\Users\\1\\Favorites\\Downloads\\Видео курсов\\Видео JAVA-1\\Занятие 9, 06-05-2019, курс Java-4, EasyUM COPY.mp4");

        //task1.setFileCopyUtils((new FileCopyWithJava7());
        //task2.setFileCopyUtils(new FileCopyWithJava7());
        //task3.setFileCopyUtils(new FileCopyWithChannel());
        //task4.setFileCopyUtils((lesson20.FileCopyUtils) new FileCopyWithChannel());
        //task5.setFileCopyUtils((lesson20.FileCopyUtils) new FileCopyWithChannel());
        //task6.setFileCopyUtils((lesson20.FileCopyUtils) new FileCopyWithJava7());

        TasksStorageImpl storage = new TasksStorageImpl();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);
        storage.add(task4);
        storage.add(task5);
        storage.add(task6);

        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        TaskExecutorImpl executor3 = new TaskExecutorImpl();

        executor1.setStorage(storage);
        executor2.setStorage(storage);
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();

    }
}
