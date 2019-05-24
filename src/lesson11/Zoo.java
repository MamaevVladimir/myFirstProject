package lesson11;

public class Zoo {
    private int money;

    private ZooAnimal[] animals = new ZooAnimal[10];// массив типов данных заранее не известных

    public Zoo() {// генерирование пустого конструктора
    }

    public Zoo(int money) {// генерируем конструктор с тем параметром который удобен
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyAnimal(ZooAnimal animal) {// если static то нет привязки к конкретному Zoo если их несколько
        if (money < animal.getCost()) {
            System.out.println("Не хватает средств для покупки животного!");
            return;// чтобы метод не шёл дальше. Работает аналогично break. У этого return
            // задача не та же что у return который с int. Break останавливает цикл,
            //но не останавливает метод. Return останавливает метод
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {// null это первая свободная ячейка. Проверка есть ли свободная ячейка
                money = money - animal.getCost();
                animals[i] = animal;
                return;// чтобы в остальные свободные ячейки не заполнять то же самое животное
                // остановка цикла for
            }
        }
        System.out.println("Нет свободных клеток");// если нет свободных ячеек

    }

    public void printAnimal() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].printInfo();
            }
        }
    }

    public void voice() {// входящие параметры не нужны т.к. есть массив
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].voice();// ПОЛИМОРФИЗМ: свойство Java которое проявляется в момент
                // выполнения программы. Java "думает" что работает с одним (т.е. одинаковым)
                // типом данных, а на самом деле с разными.
                // Т.е. как с одним типом данных, а на самом деле реализация
                // программы как с разными типами данных. Программа распознаёт вид объекта
                // и для каждого отдельно выполняет voice. Распознавание и есть полиморфизм.
                // Работает будто с одним типом но на самом деле разные методы выполняются
            }
        }
    }

    public void mostExpensiveAnimal() {// животное с максимальной стоимостью
        ZooAnimal maxCostAnimal = animals[0];// в отношении переменной maxCostAnimal вызываем методы
        // которые есть в типах данных ZooAnimal. Взяли первую ячейку animals[0]
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {//проверка что ячейка не пустая
                if (maxCostAnimal.getCost() < animals[i].getCost()) {
                    maxCostAnimal = animals[i];
                }

            }
        }
        System.out.println("Самое дорогое животное: ");
        maxCostAnimal.printInfo();// программа заранее не знает реализация в каком классе сработает.
        // Т.е. не знает класс в котором самое дорогое животное

    }

    public void summaStoimostiAll() {
        int summa = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                summa = summa + animals[i].getCost();
            }


        }
        System.out.println("Сумма стоимости всех животных в зоопарке " + summa);
    }

    public void mostInexpensiveAnimal() {
        ZooAnimal minCostAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (minCostAnimal.getCost() > animals[i].getCost()) {
                    minCostAnimal = animals[i];
                }
            }
        }
        System.out.println("Самое дешёвое животное: ");
        minCostAnimal.printInfo();
    }

    public void financeOfZoo() {
        System.out.println("Финансы зоопарка: " + money);
    }

    public void mostHeavyWeightAnimal() {
        ZooAnimal maxWeightAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (maxWeightAnimal.getWeight() < animals[i].getWeight()) {
                    maxWeightAnimal = animals[i];
                }
            }
        }
        System.out.println("Самое тяжёлое животное: ");
        maxWeightAnimal.printWeight();
    }
}



