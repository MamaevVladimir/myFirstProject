package lesson9;

public class Main1 {
    public static void main(String[] args) {
        Cat bengal = new Cat();// конструктор - особый метод, вызываемый после FileCopy
        // создающий новый объект, в который можно передать несколько параметров
        Cat toyger = new Cat();// в круглых скобках можно прописать данные (короткая запись конструктора

        // если меняется параметр в конструкторе, пишем toyger.setParametr и указываем новый параметр

        bengal.setAge(8);
        bengal.setPoroda("From India");
        bengal.setDlinaHvosta(25);
        toyger.setAge(9);
        toyger.setPoroda("American");
        toyger.setDlinaHvosta(30);

        System.out.println(bengal.getAge());
        System.out.println(bengal.getPoroda());
        System.out.println(bengal.getDlinaHvosta());
        System.out.println(toyger.getAge());
        System.out.println(toyger.getPoroda());
        System.out.println(toyger.getDlinaHvosta());


    }
}
