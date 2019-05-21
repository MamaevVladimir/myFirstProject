package lesson3;

public class Main3 {
    public static void main(String[] args) {

        int[] massive = {1, 2, 3, 4}; // вывод значений массива в обратном порядке
//        System.out.println(massive[3]);
//        System.out.println(massive[2]);
//        System.out.println(massive[1]);
//        System.out.println(massive[0]);
        for (int i = massive.length - 1
             ; i >= 0; i--) {
            System.out.println(massive[i]);
        }
    }
}
