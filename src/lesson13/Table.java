package lesson13;

import java.util.Objects;

public class Table {
    private int height;
    private int length;
    private int width;

    public Table() {
    }

    public Table(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {// генерация equals и hashcode.
        // При выборе переменных те же переменные предпочтительно в hashcode
        if (this == o)// this: table1, тот объект, у которого вызван метод; o: table2
            // == в ссылочных типах проверяется, хранятся ли два
            // объекта в одной области памяти на компьютере, один ли адрес в ячейке памяти
            return true;// Вместо тела
        if (!(o instanceof Table)) return false;// instanceof проверяет каким типом данных является o
        Table table = (Table) o;// преобразование o в тип данных Table
        // для доступности методов Table
        return getHeight() == table.getHeight() &&
                getLength() == table.getLength() &&
                getWidth() == table.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getLength(), getWidth());
    }
    // hashcode: уникальное число, может повторяться если два объекта equal true,
    // их hashcode равны, но не обязательно

    // методы: жирным шрифтом те которые в нашем классе, обычным те которые в Object

    @Override
    public String toString() {// String возвращаемый тип, toString метод
        return "Table{ " + " height= " + height + ", length= " + length + ", width= " + width + '}';
    }
}
