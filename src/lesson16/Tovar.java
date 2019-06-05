package lesson16;

import java.util.Objects;

public class Tovar {
    private int price;
    private String name;
    private int rate;

    public Tovar() {
    }

    public Tovar(int price, String name, int rate) {
        this.price = price;
        this.name = name;
        this.rate = rate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tovar)) return false;
        Tovar tovar = (Tovar) o;
        return getPrice() == tovar.getPrice() &&
                getRate() == tovar.getRate() &&
                Objects.equals(getName(), tovar.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getName(), getRate());
    }


}
