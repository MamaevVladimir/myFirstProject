package lesson22;

public class Thread3 implements Runnable {

    @Override
    public void run() {
       while (true){
           for (int i = 1000000; i < 1000020; i++) {
               System.out.println(i);
               try {
                   Thread.currentThread().sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
    }
}
