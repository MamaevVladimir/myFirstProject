package lesson24;

public class Calculator {


    public DrobnoeChislo summa(DrobnoeChislo chislo1,DrobnoeChislo chislo2){
        int commonZnam = chislo1.getZnamenatel() * chislo2.getZnamenatel();
        int resultChislitel = (chislo1.getChislitel() * chislo2.getZnamenatel())
                + (chislo2.getChislitel() * chislo1.getZnamenatel());

        DrobnoeChislo result = new DrobnoeChislo();
        result.setChislitel(resultChislitel);
        result.setZnamenatel(commonZnam);

        return result;
    }



}
