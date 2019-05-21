package homework.lesson5;

import java.util.Scanner;

public class Task5Part1 {
    public static void main(String[] args) {
        String text = "Java is object-oriented, programming language, was developed by Sun Microsystems";
        char[] charsFromText = text.toCharArray();
        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] consonant = "bcdfghJjklMmnpqrSstvwxz".toCharArray();
        char[] simbols = ".,;:".toCharArray();

        //  в похожем задании на этой строке инициализировали массив.
        //  Но там он нужен для указания группы букв, помещаемых в System.out.println
        //  В данном случае нужна переменная, суммирующая количество гласных букв, отобразить её проблематично.
        for (int i = 0; i < vowel.length; i++) {
            int glasnie = 0;
            for (int j = 0; j < text.length(); j++) {
                if (vowel[i] == charsFromText[j]) {
                    glasnie++;
                }
            }
            System.out.println("Количество гласных:" + glasnie);
        }

        for (int i = 0; i < consonant.length; i++) {
            int soglasnie = 0;
            for (int j = 0; j < text.length(); j++) {
                if (consonant[i] == charsFromText[j]) {
                    soglasnie++;
                }
            }
            System.out.println("Количество согласных:" + soglasnie);
        }

        for (int i = 0; i < simbols.length; i++) {
            int simvoli = 0;
            for (int j = 0; j < text.length(); j++) {
                if (simbols[i] == charsFromText[j]) {
                    simvoli++;
                }
            }
            System.out.println("Количество символов:" + simvoli);
        }

    }
}


