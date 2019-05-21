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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table)) return false;
        Table table = (Table) o;
        return getHeight() == table.getHeight() &&
                getLength() == table.getLength() &&
                getWidth() == table.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getLength(), getWidth());
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
