package lesson22;

public class Pevets1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;

        while (!needStop) {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + "-----------LA");
                try {
                    Thread.currentThread().sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MIKROFON_1) {
                Monitors.MIKROFON_1.notify();
            }

            synchronized (Monitors.MIKROFON_1) {
                try {
                    Monitors.MIKROFON_1.wait();// объект монитор, к нему возможно обратиться
                    // единовременно только одному потоку
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            count++;
            if(count > 3){
                needStop = true;
            }
        }
    }
}
