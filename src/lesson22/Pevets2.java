package lesson22;

public class Pevets2 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Monitors.MIKROFON_1) {
                try {
                    Monitors.MIKROFON_1.wait();// объект монитор, к нему возможно обратиться
                    // единовременно только одному потоку
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + "FA--------");
                try {
                    Thread.currentThread().sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MIKROFON_1) {
                Monitors.MIKROFON_1.notify();
            }
        }
    }
}
