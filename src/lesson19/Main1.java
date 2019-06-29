package lesson19;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        try{
            person.setAge(1200);// если не указать Exception, проработает try и sout. Сравни указать 12 или 1200
            System.out.println("!!!!!!!");
        }catch(UncurrentAgeException e){// catch это перехват Exception
            System.out.println(e.getMessage());
            System.out.println("&&&&&&&&&");
        }

        System.out.println(person);

    }
}
