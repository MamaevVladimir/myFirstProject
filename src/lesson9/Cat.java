package lesson9;

public class Cat {
    private String poroda;
    private int age;
    private double dlinaHvosta;

    public void setPoroda(String newPoroda) {
        poroda = newPoroda;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public int getAge(){
        return age;
    }

    public void setDlinaHvosta (double newDlinaHvosta){
        newDlinaHvosta = dlinaHvosta;
    }
    public double getDlinaHvosta(){
        return dlinaHvosta;
    }
}
