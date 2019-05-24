package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Table table1 = new Table(12, 4, 67);
        Table table3 = table1;
        Table table2 = new Table(12, 4, 67);

        //boolean resultEquals = table1.equals(table2); пишет false хотя характеристики одинаковые.
        // Для работы метода equals метод надо переопределить внутри класс Table.
        // Данный метод определён в классе Object потому с типами данных
        // по иерархии ниже изначально не работает

        boolean resultEquals = table1.equals(table2);

        System.out.println(resultEquals);
        System.out.println(table1.equals(table3));
        System.out.println(table1.toString()); //toString указывать необязательно,
        // метод вызывается по умолчанию внутри Sout
    }
}
