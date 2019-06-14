package lesson17;

import java.util.ArrayList;
import java.util.TreeSet;

public class Tovar {
    private String mainName;
    private String artikul;
    private ArrayList<Foto> fotos = new ArrayList<>();// создание места куда добавляем фотографии
    private ArrayList<DopUsluga> dopuslugas = new ArrayList<>();
    private int ostatokNaSklade;
    private int priceFull;
    private int priceSale = -1;// если -1 значит не отображать
    private String pathToImage;
    private String opisanie;
    private ArrayList<Otziv> otzivs = new ArrayList<>();// помещаем в метод "Отзывы"

    public String getMainName() {// getter и setter на коллекции ArrayList не делаем
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String getArtikul() {
        return artikul;
    }

    public void setArtikul(String artikul) {
        this.artikul = artikul;
    }

    public int getOstatokNaSklade() {
        return ostatokNaSklade;
    }

    public void setOstatokNaSklade(int ostatokNaSklade) {
        this.ostatokNaSklade = ostatokNaSklade;
    }

    public int getPriceFull() {
        return priceFull;
    }

    public void setPriceFull(int priceFull) {
        this.priceFull = priceFull;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public void addOtziv(Otziv otziv) {
        otzivs.add(otziv);// в Main к товару закрепляем этот отзыв
    }

    public void addHarakteristika(Harakteristika harakteristika) {
        // harakteristiks.add (harakteristika);
    }

    public void addFoto(Foto foto) {
        fotos.add(foto);
    }

    public void printMiddleRate() {
        int summaRate = 0;
        for (int i = 0; i < otzivs.size(); i++) {
            summaRate = summaRate + otzivs.get(i).getReiting();// у каждого отзыва достаём рейтинг и складываем
        }

        double srednyRate = (double) summaRate / otzivs.size();
        System.out.println("Средний рейтинг товара: " + srednyRate);
    }

    public void printOtziviByRate() {
        TreeSet<Otziv> sortByOtzivs = new TreeSet<>(new SortByRatingComporator());
        sortByOtzivs.addAll(otzivs);// otzivs коллекция неотсортированных отзывов,
        // sortByOtzivs коллекция отсортированнных отзывов
        for(Otziv o : sortByOtzivs){
            System.out.println(o);
        }

    }
}
