package lesson17;

import java.util.Date;

public class Otziv {
    private int reiting;
    private String nameAutor;
    private boolean trueRazmer;
    private boolean trueOpisanie;
    private boolean trueFoto;
    private String tema;
    private String otziv;
    private Date datePublikasii;// Date from util. Описание даты

    public int getReiting() {
        return reiting;
    }

    public void setReiting(int reiting) {
        this.reiting = reiting;
    }

    public String getNameAutor() {
        return nameAutor;
    }

    public void setNameAutor(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    public boolean isTrueRazmer() {
        return trueRazmer;
    }

    public void setTrueRazmer(boolean trueRazmer) {
        this.trueRazmer = trueRazmer;
    }

    public boolean isTrueOpisanie() {
        return trueOpisanie;
    }

    public void setTrueOpisanie(boolean trueOpisanie) {
        this.trueOpisanie = trueOpisanie;
    }

    public boolean isTrueFoto() {
        return trueFoto;
    }

    public void setTrueFoto(boolean trueFoto) {
        this.trueFoto = trueFoto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getOtziv() {
        return otziv;
    }

    public void setOtziv(String otziv) {
        this.otziv = otziv;
    }

    public Date getDatePublikasii() {
        return datePublikasii;
    }

    public void setDatePublikasii(Date datePublikasii) {
        this.datePublikasii = datePublikasii;
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "reiting=" + reiting +
                ", nameAutor='" + nameAutor + '\'' +
                ", trueRazmer=" + trueRazmer +
                ", trueOpisanie=" + trueOpisanie +
                ", trueFoto=" + trueFoto +
                ", tema='" + tema + '\'' +
                ", otziv='" + otziv + '\'' +
                ", datePublikasii=" + datePublikasii +
                '}';
    }
}
