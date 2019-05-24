package lesson12;

public class MeizuM5 implements Phone, Photoapparat {// implements т.е. следует шаблону
    // Наследование только одному классу, следование шаблонам их количеством не ограничено.
    // Также не ограничено количество классов, которые можно создать по данным шаблонам
    @Override
    public void call() {
        System.out.println("MeizuM5 осуществление звонка...");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("MeizuM5 отправляем смс..." + message);
    }

    @Override
    public void doPhoto() {
        System.out.println("MeizuM5 делаем фото...");
    }

    @Override
    public void doVideo() {
        System.out.println("MeizuM5 делаем видео...");
    }// implements то есть следует, количество шаблонов не ограничено
}
