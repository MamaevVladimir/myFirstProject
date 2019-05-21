package homework.lesson6;

import java.util.StringJoiner;

public class StringUtils {
    public static String reverse(String text) {
        String text1 = "Java is often used in programming";
        String[] stroka = text1.split(" ");
        String[] reverseStroka = new String[stroka.length];
        String s = "";
        for (int i = 0, j = stroka.length - 1; i < stroka.length; i++, j--) {
            reverseStroka[i] = stroka[j];
        }
        for (String k : reverseStroka) {
            s += k;
        }

        StringBuffer q = new StringBuffer(s);
        q.insert(11, " ");
        q.insert(14, " ");
        q.insert(19, " ");
        q.insert(25, " ");
        q.insert(28," ");
        String oborotStroka = q.toString();
        return oborotStroka;
    }

    public static int countGlass(String text) {
        String text2 = "Apple was founded in 1976";
        char[] charsFromText1 = text2.toCharArray();
        int summaGlass = 0;
        for (int i = 0; i < charsFromText1.length; i++) {
            char currentChar = charsFromText1[i];
            if (currentChar == ' ') {
                continue;
            } else if (currentChar == 'A' || currentChar == 'a' || currentChar == 'e' ||
                    currentChar == 'o' || currentChar == 'u' || currentChar == 'i') {
                summaGlass++;
            }
        }
        return summaGlass;
    }

    public static int countSoglasnie(String text) {
        String text3 = "Mathematical knowledge is in demand in programming";
        char[] charsFromText2 = text3.toCharArray();
        int summaSoglas = 0;
        for (int i = 0; i < charsFromText2.length; i++) {
            int currentChar = charsFromText2[i];
            if (currentChar == ' ') {
                continue;
            } else if (currentChar == 'M' || currentChar == 'm' || currentChar == 't' || currentChar == 'h' ||
                    currentChar == 'c' || currentChar == 'l' || currentChar == 'k'
                    || currentChar == 'n' || currentChar == 'w' || currentChar == 'd' ||
                    currentChar == 'g' || currentChar == 's' || currentChar == 'r' || currentChar == 'p') {
                summaSoglas++;
            }
        }
        return summaSoglas;
    }
}



