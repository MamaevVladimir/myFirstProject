package lesson14;

public class Matrix implements IMatrix {
    private double[][] numbers;// поскольку в 3 задании матрица * число. Поле класса двумерный массив.
    // В двумерном массиве указываем количество колонок и строк. Одно поле, это переменная
    // описывающая состояние объекта. Переменные колонок и строк содержатся в массиве,
    // отдельно создавать их не надо

    public Matrix(int row, int column) {// название конструктора обязательно совпадает
        // с названием класса. Нужен конструктор с количеством строк и колонок, пустой не нужен
        // Дальше создаём класс Main для тестирования
        numbers = new double[row][column];// на переменную numbers создаётся массив
        // с количеством строк row и колонок column
    }

    @Override
    public int getRows() {
        return numbers.length;
    } // узнать количество строк: обратиться
    // к двухмерному массиву numbers и метод length

    @Override
    public int getColumns() {
        return numbers[0].length;
    }// узнать количество колонок:
    // у numbers вытягиваем одну строку, получается одномерный массив. numbers[0]
    // это ссылка на первую строку. Её length это количество колонок


    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return numbers[rowIndex][colIndex];// возвращаем двухмерный массив
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        numbers[rowIndex][colIndex] = value;// указываем те значения, которые даны в круглых скобках
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // в метод сложения передаём только одну матрицу, вторая является this,
        // у неё вызывается метод add, третья та что является результатом сложения
        // и этот результат надо вернуть
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во строк не совпадает");
            return null;// для выхода из метода чтобы дальше код не срабатывал
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во колонок не совпадает");
            return null;
        }
// объект интерфейса IMatrix создать не можем, надо создать класс реализующий интерфейс, это класс Matrix
        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        // указывается количество строк и колонок ЛЮБОЙ ИЗ ТРЁХ МАТРИЦ
        // не обязательно создавать внутри psvm, можно и здесь
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                // дальше присваивание к result c помощью метода setValueAt
                // при открытии метода видим три параметра, два уже есть, надо добавить double value
                double value = this.getValueAt(i, j) + otherMatrix.getValueAt(i, j);
                // суммирование значений ячеек первой и второй матрицы
                result.setValueAt(i, j, value);
                // срабатывает если реализован метод getValueAt
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во строк не совпадает");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во колонок не совпадает");
            return null;
        }

        Matrix result1 = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double value = this.getValueAt(i, j) - otherMatrix.getValueAt(i, j);
                result1.setValueAt(i, j, value);
            }
        }
        return result1;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Кол-во колонок первой матрицы не совпадает с количеством строк второй");
            return null;
        }

        Matrix result2 = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < otherMatrix.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                double value = this.getValueAt(i, j) * otherMatrix.getValueAt(i, j);
                result2.setValueAt(i, j, value);
            }
        }
        return result2;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result3 = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                //value = this.getValueAt(i, j) * ;
                result3.setValueAt(i, j, value);
            }
        }

        return result3;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {// матрица с единицами по главной диагонали и нулями вне её
        if (this.getColumns() != this.getRows()) {// проверяем совпадают ли количества строк и колонок
            return false;
        }

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) { // диагональ там где i совпадает с j и должна быть единица
                    if (numbers[i][j] != 1) {// numbers[i][j] это текущая ячейка
                        return false;
                    }
                } else {
                    if (numbers[i][j] != 0) {// не диагональ
                        return false;
                    }

                }

            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {// количество строк у текущей this матрицы
            for (int j = 0; j < this.getRows(); j++) {
                System.out.print(numbers[i][j] + " "); // у Println убираем ln поскольку хотим
                // печатать в одну строку. Печатаем текущий элемент
            }
            System.out.println();// для перехода на новую строку по окончании цикла for
        }
    }
}
