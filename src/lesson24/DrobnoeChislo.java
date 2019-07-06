package lesson24;

public class DrobnoeChislo {
    private int chislitel;
    private int znamenatel;

    public void setChislitel(int newChislitel) {
        this.chislitel = newChislitel;
    }

    public void setZnamenatel(int newZnamenatel) {
        this.znamenatel = newZnamenatel;
    }

    public int getChislitel() {
        return chislitel;
    }

    public int getZnamenatel() {
        return znamenatel;
    }

    public void printInfo() {
        System.out.printf("%d/%d", chislitel, znamenatel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DrobnoeChislo)) return false;

        DrobnoeChislo chislo = (DrobnoeChislo) o;

        if (getChislitel() != chislo.getChislitel()) return false;
        return getZnamenatel() == chislo.getZnamenatel();
    }

    @Override
    public int hashCode() {
        int result = getChislitel();
        result = 31 * result + getZnamenatel();
        return result;
    }

    @Override
    public String toString() {
        return "DrobnoeChislo{" +
                "chislitel=" + chislitel +
                ", znamenatel=" + znamenatel +
                '}';
    }
}
