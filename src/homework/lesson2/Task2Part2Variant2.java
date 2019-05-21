package homework.lesson2;

public class Task2Part2Variant2 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 504; i < 1000; i += 7) {
                    System.out.println("Числа кратные 7" + " " + i);
                }
            }
        };

        Thread threadTwo = new Thread() {
            public void run() {
                for (int c = 513; c < 1000; c += 19) {
                    System.out.println("Числа кратные 19" + " " + c);
                }
            }
        };

        thread.start();
        threadTwo.start();
    }

}



