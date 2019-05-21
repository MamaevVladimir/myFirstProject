package lesson10;

public class Animal {
    private int age;
    private String name;

    public Animal() {//это пустой конструктор
    }

    public Animal(int age, String name) {
        //если конструктор со входящими параметрами, указываем те же, что в полях выше
        this.age = age;//у этого объекта полю age присвоено то что дано в круглых скобках
        this.name = name;
    }

    public void setAge(int age) {// void потому что устанавливаем. В круглые скобки: приходит age
        //в private int age и в скобках одно и то же содержание. Что делать?
        // если написать age = age, равенство на поле не присвоит
        //для решения переходим в Main и вызываем animal.setAge()
        this.age = age; //полю age присваивается переменная из круглых скобок age

    }

    public int getAge() {//сгенерированы поля
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //фактически что делают: создают класс, направляют туда вручную поля, генерируют методы
    //get и set, генерируют конструкторы

    //наследование: если для другого класса подходят параметры данного класса, для
    //исключения дубляжа кода делают наследование

    public void printToConsol() {//сигнатура (шапка) метода
        System.out.println("Животное с возрастом  " + this.getAge());
    }
}
