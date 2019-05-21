package lesson10;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //фактически при вызове любого метода есть явные параметры, это то что ложится в метод
        //есть также неявные, это тот объект что ложится, то есть animal также есть доступ в setAge()
        //у второго animal из левой части равенства вызывается setAge()
        animal.setAge(12);//12 это явный параметр в setAge, а animal неявный. Чтобы "достучаться"
        //до animal, переходим в класс Animal и указываем this

        Dog dog = new Dog();
        dog.setAge(13);//в этом классе не было метода setAge(), но мы его вызвали
        // за счёт наследования от родительского класса Animal
        // extends переводится "является", поэтому наследование не всегда возможно
        // даже если все признаки совпадают, во избежание говнокода. Пример со стулом и лошадью

        Cat cat = new Cat();
        cat.setAge(2);
        // в дополнение к избеганию дубляжа наследование позволяет положить разнородные
        // классы в один массив

        Animal[] animals = new Animal[2];
        animals[0] = cat;
        animals[1] = dog;

        for (int i = 0; i < 2; i++) {// animals[i]. не видит метода printToConsol потому что
            // массив типа данных Animal а не Dog или Cat. Вариант решения: прописать
            // в данном классе тот же метод
            animals[i].printToConsol();// метод в Animal не сработал т.к. там написано
            // "Животное с возрастом".
            // Если сигнатура у родительского и дочернего методов одинаковая,
            // то происходит переопределение метода

            // Переопределение метода - это когда в дочернем классе мы объявляем метод,
            // ровно с такой же сигнатурой, как метод в родительском классе,
            // но при этом изменяем тело метода, то есть изменяем логику метода.
            // То есть сначала проверяется наличие данного класса в дочернем классе,
            // а если его там нет, тогда в родительском классе
        }
    }
}
