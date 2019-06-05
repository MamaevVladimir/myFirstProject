package lesson16;

import java.util.Objects;

public class Coin implements Comparable <Coin>  {
    private int nominal;
    private double diametr;
    private int year;

    public Coin() {
    }

    public Coin(int nominal, double diametr, int year) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;
        Coin coin = (Coin) o;
        return getNominal() == coin.getNominal() &&
                Double.compare(coin.getDiametr(), getDiametr()) == 0 &&
                getYear() == coin.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNominal(), getDiametr(), getYear());
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", diametr=" + diametr +
                ", year=" + year +
                '}';
    }


    @Override
    public int compareTo(Coin o) {// первая монета доступна по ссылке this, вторая по ссылке o
        if(this.getYear() != o.getYear()){
            return (this.getYear() - o.getYear());
        }
        if(this.getNominal() != o.getNominal()){
            return (this.getNominal() - o.getNominal());
        }

        return (int)((this.getDiametr() - o.getDiametr())*100000);//диаметр double приводим в int
    }
}
