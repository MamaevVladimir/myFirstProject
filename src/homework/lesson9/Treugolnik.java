package homework.lesson9;

public class Treugolnik {
    private int kolichestvoUglov;
    private String storoni;
    private double ploschad;

    public void setKolichestvoUglov(int newKolichestvo) {
        kolichestvoUglov = newKolichestvo;
    }

    public void setStoroni(String newStoroni) {
        storoni = newStoroni;
    }

    public void setPloschad(double newPloschad) {
        ploschad = newPloschad;
    }

    public int getKolichestvoUglov() {
        return kolichestvoUglov;
    }

    public String getStoroni() {
        return storoni;
    }

    public double getPloschad() {
        return ploschad;
    }
}
