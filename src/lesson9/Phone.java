package lesson9;

public class Phone {
    private double diagonal;
    private String model;
    private int price;

    public void setPrice(int newPrice) {
        price = newPrice;

    }

    public int getPrice() {
        return price;
    }

    public void setDiagonal(double newDiagonal) {
        diagonal = newDiagonal;
    }

    public double getDiagonal(){
        return diagonal;
}
}