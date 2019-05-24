package lesson9;

public class Phone {
    private double diagonal;// поля это переменные внутри класса,
    // и только те, которые описывают состояние объекта
    private String model;
    private int price;

    public void setPrice(int newPrice) {// модификатор доступа это слово (4 варианта) которое
        // определяет область видимости класса, переменной внутри класса, метода
        // внутри класса или конструктора. Private: доступ только внутри класса.
        // Обращение к конкретному объекту: Static не пишем
        price = newPrice;

    }

    public int getPrice() {// возвращаемое значение "достать Price"
        return price;
    }

    public void setDiagonal(double newDiagonal) {
        diagonal = newDiagonal;// присвоение на diagonal того что передают в круглых скобках
    }// если установка
    // это всегда void

    public double getDiagonal( ){// ничего не передаём в метод в круглые скобки поскольку итак запрос
        return diagonal;
}
// get, set обычно устанавливаются на все поля класса (в данном случае 3 get, 3 set)
}