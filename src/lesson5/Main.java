package lesson5;

public class Main {
    public static void main(String[] args) {//вывести массив в обратном порядке
        char[] massive = {'q', 'w', 'e', 'r', 't'};
        char[] massiveReverse = new char[massive.length];

//        massiveReverse[0] = massive[4];
//        massiveReverse[1] = massive[3];
//        massiveReverse[2] = massive[2];
//        massiveReverse[3] = massive[1];
//        massiveReverse[4] = massive[0];

        int j = massiveReverse.length - 1;
        for (int i = 0; i < massive.length; i++) {
            massiveReverse[i] = massive[j];
            j--;
        }

        for (int i = 0; i < massiveReverse.length; i++) {
            System.out.println(massiveReverse[i]);
        }
    }
}
