package lesson22;

public class Main {
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();// run никогда не запускать
        thread2.start();// создаёт отдельный поток и сам вызывает run

        Thread thread3 = new Thread(new Thread3());
        thread3.start();
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try {
               Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // текущий поток выполняющий данный кусок кода остановить на 500 мс
        }
    }
}
//в каждом потоке использовать sleep, yield или wait