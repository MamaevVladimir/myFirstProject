package homework.Poyasneniya;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

// найти в строке количество гласных, согласных и знаков препинания
public class Task5Part1Poyasneniya {
    public static void main(String[] args) {
        String text = "I am, a student!";

        char[] charsFromText = text.toCharArray();

        int countGlas = 0;
        int countSoglas = 0;
        int countSimvols = 0;
        for (int i = 0; i < charsFromText.length; i++) {
            char currentChar = charsFromText[i];
            if (currentChar == ' ') {
                continue;
            } else if (currentChar == 'a' || currentChar == 'o' || currentChar == 'i' ||
                    currentChar == 'e' || currentChar == 'u' || currentChar == 'y' ||
                    currentChar == 'A' || currentChar == 'O' || currentChar == 'I') {
                countGlas++;
            } else if (currentChar == '!' || currentChar == ',' || currentChar == '.' ||
                    currentChar == '?' || currentChar == ';' ||currentChar == ':' || currentChar == '-') {
                countSimvols++;
            } else {
                countSoglas++;
            }
        }
        System.out.println("Гласных в тексте:" + countGlas);
        System.out.println("Согласных в тексте:" + countSoglas);
        System.out.println("Символов в тексте:" + countSimvols);
    }
}
