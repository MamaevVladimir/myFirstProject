package homework.Poyasneniya;

//  в двух текстовых строках вывести только те которые есть в обеих строках
public class Task5Part2Poyasneniya {
    public static void main(String[] args) {
        String text1 = "I am a student";
        String text2 = "I am a teacher";

        char[] charsFromText1 = text1.toCharArray();
        char[] charsFromText2 = text2.toCharArray();

        for (int i =0; i < charsFromText1.length; i++){
            for (int j = 0; j < charsFromText2.length; j++){
                if (charsFromText1[i] == charsFromText2[j] && charsFromText1[i] != ' '){
                    System.out.println(charsFromText1[i]);
                    break;
                }

            }
        }

    }
}
//  если надо убрать знаки препинания: указать их в условии if выше