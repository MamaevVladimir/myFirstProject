package lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tournir {
    private HashMap<String, Integer> table = new HashMap<>();

    public void addCommand(String nameCommand, int ball) {
        if (table.containsKey(nameCommand)) {// содержится ли такой ключ
            int currentBall = table.get(nameCommand);// если содержится
            table.put(nameCommand, (ball + currentBall));
        } else {
            table.put(nameCommand, ball);// если не содержится то добавляем по ключу nameCommand значение ball

        }
    }

    public void printToConsoleRate() {
        for (Map.Entry<String, Integer> team : table.entrySet()) {
            System.out.print(team.getKey() + "--");
            System.out.println(team.getValue() + "--");
        }
    }

    public void printCommandVictory() {
        int victoryBall = 0;
        String victoryCommand = null;
        for (String key : table.keySet()) {
            if (victoryBall < table.get(key)) {
                victoryBall = table.get(key);
                victoryCommand = key;
            }
        }
        System.out.println("Победитель турнира - " + victoryCommand + "--" + victoryBall);
    }

    public void minusBal(String name, int bal) {
        if (table.containsKey(name)) {
            int currentBall = table.get(name);
            if (currentBall > bal) {
                table.put(name, currentBall - bal);

            } else {
                table.put(name, 0);

            }
        } else {
            System.out.println("Данной команды нет в рейтинге");

        }
    }

    public void sredniyBall() {
        int summaZnachenii = 0;
        for (String key : table.keySet()) {
            summaZnachenii += table.get(key);
        }
        double sredneeZnachenie = (double) summaZnachenii / table.size();
        System.out.println("Средний рейтинг команд " + sredneeZnachenie);
    }

    public void sortRating() {
        ValueComparator bvc = new ValueComparator(table);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
        System.out.println("Неотсортированный рейтинг команд: " + table);
        sorted_map.putAll(table);
        System.out.println("Отсортированный рейтинг команд: " + sorted_map);
    }
}

