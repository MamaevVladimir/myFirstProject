package lesson22;

public class Thread2 extends Thread{

    @Override
    public void run() {
        for(int i = 1000; i < 1020; i++){
            System.out.println(i);
            try {
                Thread.currentThread().sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
