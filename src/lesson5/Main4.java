package lesson5;

public class Main4 {
    public static void main(String[] args) {
        int[] massive = {54, 67, 5, 89, 3, 42, 56, 78, 89, 5, 11};//вывести числа, делятся только на 1 и сами на себя
        for (int i = 0; i < massive.length; i++) {
            for (int j = 2; j < massive.length - 1; j++) {// length-1 потому что число само на себя в задаче делить не требуется
                if (massive[i] % j == 0) {//остаток от деления не должен быть ноль
                    break;
                } else {
                    System.out.println(massive[i]);
                }
            }

        }
    }
}
