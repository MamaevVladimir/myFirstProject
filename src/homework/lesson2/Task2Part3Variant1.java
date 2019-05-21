package homework.lesson2;

public class Task2Part3Variant1 {
    public static void main(String[] args) {

        int sum = 0;
        for (int x = 50; x < 1000; x++) {
            if ((x % 7 == 0) && (x % 19 == 0)) {
                sum += x;
                switch (sum) {
                    case 3724:
                        System.out.println(sum);

                }
            }
        }
    }
}

