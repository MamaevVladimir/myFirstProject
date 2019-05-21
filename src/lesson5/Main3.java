package lesson5;

public class Main3 {
    public static void main(String[] args) {// вывести наибольшее и также второе по величине число
        int[] massive = {1, 23, 88, 77, 25};

        int biggest = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > biggest) {
                biggest = massive[i];
            }
        }
        System.out.println(biggest);

        int big = 0;
        for (int j = 0; j < massive.length; j++) {
            if (massive[j] > big && massive[j] < biggest) {
                big = massive[j];
            }
        }
        System.out.println(big);

    }
}
