package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = new int[6];// при таком указании известно число ячеек но заполнен нулями
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;
        numbers[5] = 12;


        int chetnoeChislo = 2;
        for (int i = 0; i < 6; i++) {
            numbers[i] = chetnoeChislo;
            chetnoeChislo = chetnoeChislo + 2;
            // System.out.println(chetnoeChislo);
        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }


    }
}

