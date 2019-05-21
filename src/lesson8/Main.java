package lesson8;

public class Main {
    public static void main(String[] args) {
        int[] massiv1 = {40, 78, 6, 55, 15, 34, 789, 856, 999, 345}; // сумма чисел в массиве кратных пяти
        int summaChiselBy5 = Methods.summaChiselBy5(massiv1);
        System.out.println(summaChiselBy5);

        int[] result = Methods.massiveWithNumber(massiv1,'5');// вернуть массив чисел в которых есть пять
        for (int i =0; i < result.length; i++){
            System.out.println(result[i]);
        }

       String word = Methods.getEqualChars("Main", "Methods");
        System.out.println(word);
    }
}
