package homework.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String oborotStroka = StringUtils.reverse("Java is often used in programming");
        System.out.println(oborotStroka);

        int summaGlass = StringUtils.countGlass("Apple was founded in 1976");
        System.out.println("Гласных в тексте: " + summaGlass);

        int summaSoglas = StringUtils.countSoglasnie("Mathematical knowledge is in demand in programming");
        System.out.println("Согласных в тексте: " + summaSoglas);
    }
}
