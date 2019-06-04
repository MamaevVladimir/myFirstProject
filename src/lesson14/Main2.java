package lesson14;

public class Main2 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.setValueAt(0, 0, 3);
        matrix.setValueAt(0, 1, 5);
        matrix.setValueAt(0, 2, 7);
        matrix.setValueAt(1, 0, 2);
        matrix.setValueAt(1, 1, -1);
        matrix.setValueAt(1, 2, 0);
        matrix.setValueAt(2, 0, 4);
        matrix.setValueAt(2, 1, 3);
        matrix.setValueAt(2, 2, 2);

        Matrix matrix1 = new Matrix(3, 3);
        matrix1.setValueAt(0, 0, 1);
        matrix1.setValueAt(0, 1, 2);
        matrix1.setValueAt(0, 2, 4);
        matrix1.setValueAt(1, 0, 2);
        matrix1.setValueAt(1, 1, 3);
        matrix1.setValueAt(1, 2, -2);
        matrix1.setValueAt(2, 0, -1);
        matrix1.setValueAt(2, 1, 0);
        matrix1.setValueAt(2, 2, 1);

        IMatrix result = matrix.add(matrix1);// метод add вызывается у любой из матриц.
        // Ожидаем IMatrix, т.е. то что прописано в интерфейсе
        result.printToConsole();

        IMatrix result1 = matrix.sub(matrix1);
        result1.printToConsole();

        IMatrix result2 = matrix.mul(matrix1);
        result2.printToConsole();

        //IMatrix result3 = matrix.mul();
        result2.printToConsole();
    }
}
