package lesson20;

public class Main2 {
    public static void main(String[] args) {
        FileCopyUtils1 utils1 = new FileCopyUtils1();
        try {
            utils1.copyFile("resources/data.txt", "resources/data-1.txt");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
    }
}
