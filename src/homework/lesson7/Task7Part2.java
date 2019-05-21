package homework.lesson7;

public class Task7Part2 {
    public static void main(String[] args) {
        int[][] massive = new int[5][5];

        for (int i = 0; i < massive.length; i++) {
            int n = 5;
            for (int j = 0; j < massive[i].length; j++) {
                if ((j == n - i - 1) || (i == j)) {
                    System.out.print(massive[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}

