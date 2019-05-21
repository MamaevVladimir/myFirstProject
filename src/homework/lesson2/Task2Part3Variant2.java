package homework.lesson2;

public class Task2Part3Variant2 {
    public static void main(String[] args) {

        int[] n = new int[]{1000};
        int max = Integer.MIN_VALUE, index = 0;

        for (int x = 50; x < n.length; x++) {
            if ((n[x] % 7 == 0) && (n[x] % 19 == 0) && (n[x] > max)) {

                n[x] = max;
                index = x;

                System.out.println(index);


            }            //Посмотрел примеры в Интернете, составил решение через массив
            // Вроде всё правильно прописано, но почему-то не работает
        }


    }
}



