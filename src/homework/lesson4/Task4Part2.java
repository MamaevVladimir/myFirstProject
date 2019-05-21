package homework.lesson4;

public class Task4Part2 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";
        String result = text.replace('m', 'M');
        String result1 = result.replace('h', 'H');
        String result2 = result1.replace('p', 'P');
        String result3 = result2.replace('t', 'T');
        String result4 = result3.replace('l', 'L');
        String result5 = result4.replace('r', 'R');
        String result6 = result5.replace('n', 'N');
        String result7 = result6.replace('g', 'G');
        String result8 = result7.replace('j', 'J');
        String result9 = result8.replace('v', 'V');

        System.out.println(result9);

    }
}
