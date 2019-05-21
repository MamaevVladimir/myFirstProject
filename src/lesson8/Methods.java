package lesson8;

public class Methods {

    public static int summaChiselBy5(int[] massive) { // сумма чисел в массиве кратных пяти
        int summaChiselBy5 = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 5 == 0) {
                summaChiselBy5 += massive[i];
            }
        }
        return summaChiselBy5;
    }

    public static int[] massiveWithNumber(int[] massive, char chislo) { // вернуть массив чисел в которых есть пять
        int countChisla = 0;
        for (int i = 0; i < massive.length; i++) {
            char[] chars = ("" + massive[i]).toCharArray(); // преобразование текущего числа int в char
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == chislo) {
                    countChisla++;
                    break;
                }
            }

        } // по завершении for станет известно, массив с каким количеством ячеек будет нужно создать в сл.абзаце.
          // Количество чисел с числом пять заранее не известно, потому считали сколько будет длина массива

        int[] result = new int[countChisla]; // объявляется массив конкретной длины
        int index = 0; // генерируются индексы результата
        for (int i = 0; i < massive.length; i++) {
            char[] chars = ("" + massive[i]).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == chislo) { // подходит ли конкретное число
                    result[index] = chars[j]; // если да, число помещается в ячейку
                    index++;
                    break; // для остановки внутреннего for. Чтобы по цифрам где пятёрок больше одной не проходить повторно
                }

            }
        }
        return result;
    }

    public static String getEqualChars(String text1, String text2) {
        String result = "";
        char[] charsFromText1 = text1.toCharArray();
        char[] charsFromText2 = text2.toCharArray();

        for (int i = 0; i < charsFromText1.length; i++) {
            for (int j = 0; j < charsFromText2.length; j++) {
                if (charsFromText1[i] == charsFromText2[j]) {
                    result += charsFromText1[i];
                    break; // чтобы выводил совпадающую букву только из одного текста
                }
            }
        }
        return result;
    }

}