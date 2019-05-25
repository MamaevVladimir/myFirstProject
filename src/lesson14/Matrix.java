package lesson14;

public class Matrix implements IMatrix {
    private double[][] numbers;// поскольку в 3 задании матрица * число

    public Matrix(int row, int column) {
        numbers = new double[row][column];
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()){
            System.out.println("Кол-во строк не совпадает");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()){
            System.out.println("Кол-во колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for(int i =0; i < otherMatrix.getRows(); i++){
            for (int j = 0; j < otherMatrix.getColumns(); j++){
                double value = this.getValueAt(i,j) + otherMatrix.getValueAt(i,j);
                result.setValueAt(i,j, value);
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
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
    public boolean isIdentityMatrix() {
        if (this.getColumns() != this.getRows()){
            return  false;
        }

        for(int i = 0; i < this.getRows(); i++){
            for(int j =0; j < this.getColumns(); j++){
                if (i == j){
                    if (numbers[i][j] != 1){
                        return false;
                    }
                }else{
                    if (numbers[i][j] != 0){
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
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getRows(); j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
