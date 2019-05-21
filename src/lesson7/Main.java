package lesson7;

public class Main {
    public static void main(String[] args) {
//        int[][] massive = new int[3][4];

//        System.out.print(massive[0][0] + " "); // если надо печатать в одну строку "ln" убрать
//        System.out.print(massive[0][1] + " ");
//        System.out.print(massive[0][2] + " ");
//        System.out.print(massive[0][3] + " ");
//        System.out.println(); // для перехода на другую строку
//
//        System.out.print(massive[1][0] + " ");
//        System.out.print(massive[1][1] + " ");
//        System.out.print(massive[1][2] + " ");
//        System.out.print(massive[1][3] + " ");
//        System.out.println();
//
//        System.out.print(massive[2][0] + " "); // если надо печатать в одну строку "ln" убрать
//        System.out.print(massive[2][1] + " ");
//        System.out.print(massive[2][2] + " ");
//        System.out.print(massive[2][3] + " ");
//        System.out.println();

//        int[][] massive = new int[5][5];
//
//        for (int i = 0; i < massive.length; i++) {
//            for (int j = 0; j < massive[i].length; j++) {
//                if (i == j) {
//                    System.out.print(massive[i][j] + " ");
//                } else {
//                    System.out.print(" " + " ");
//                }
//            }
//            System.out.println();
//        }}}

//        int[][] massive = new int[4][4];
//
//        for (int i = 0; i < massive.length; i++) {
//            for (int j = 0; j < massive[i].length; j++) {
//                if (i <= j) {
//                    System.out.print(massive[i][j] + " ");
//                } else {
//                    System.out.print(" " + " ");
//                }
//            }
//            System.out.println();
//        }

//        int[][] massive = new int[4][4];
//
//        for (int i = 0; i < massive.length; i++) {
//            for (int j = 0; j < massive[i].length; j++) {
//                if (i >= j) {
//                    System.out.print(massive[i][j] + " ");
//                } else {
//                    System.out.print(" " + " ");
//                }
//            }
//            System.out.println();
//        }

//        int[][] massive = new int[4][4];
//
//        for (int i = 0; i < massive.length; i++) {
//            for (int j = 0; j < massive[i].length; j++) {
//                if (j == 0) {
//                    System.out.print(massive[i][j] + " ");
//                } else {
//                    System.out.print(" " + " ");
//                }
//            }
//            System.out.println();
//        }

//        int[][] massive = new int[4][4];
//
//        for (int i = 0; i < massive.length; i++) {
//            for (int j = 0; j < massive[i].length; j++) {
//                if (j == 0 || i == 3) {
//                    System.out.print(massive[i][j] + " ");
//                } else {
//                    System.out.print(" " + " ");
//                }
//            }
//            System.out.println();
//        }}}

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



