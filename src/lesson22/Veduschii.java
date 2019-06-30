package lesson22;

public class Veduschii {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "---Начали концерт---");

        Pevets1 pevets1 = new Pevets1();
        pevets1.start();

        Pevets2 pevets2 = new Pevets2();
        pevets2.setDaemon(true);
        pevets2.start();

        while(pevets1.isAlive()){

        }

        System.out.println(Thread.currentThread().getName() + "---Закончили концерт---");
    }
}
