package lesson14;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);

        System.out.println(matrix.getRows());// обращение к матрице с вызовом метода getRows.
        // Внутри Println поскольку getRows возвращает интовое значение и сразу печатается на консоль
        System.out.println(matrix.getColumns());

        matrix.setValueAt(0, 1, 7.9);
        matrix.printToConsole();
        System.out.println(matrix.isIdentityMatrix());// внутри sout чтобы напечаталось true либо false

        Matrix matrix1 = new Matrix(3, 3);
        matrix1.setValueAt(0, 0, 1.0);
        matrix1.setValueAt(1, 1, 1.0);
        matrix1.setValueAt(2, 2, 1.0);

        System.out.println(matrix1.isIdentityMatrix());
        matrix1.printToConsole();


    }
}
