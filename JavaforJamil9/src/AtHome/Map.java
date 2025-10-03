package AtHome;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {


        // =========================
        // 🔹 1. Базовое (HashMap — студенты)
        // =========================
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Jafar", 20);
        students.put("Cemil", 22);
        students.put("Nicat", 19);
        students.put("Sehriyar", 23);
        students.put("Ugur", 21);

        // Вывести всех студентов
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Проверить Alice
        System.out.println("Есть ли Alice? " + students.containsKey("Alice"));

        // Удалить одного студента
        students.remove("Charlie");
        System.out.println("После удаления: " + students);




        // =========================
        // 🔹 2. Средний уровень (LinkedHashMap — города)
        // =========================
        LinkedHashMap<Integer, String> cities = new LinkedHashMap<>();
        cities.put(1, "Baku");
        cities.put(2, "Moscow");
        cities.put(3, "London");
        cities.put(4, "New York");
        cities.put(5, "Tokyo");

        System.out.println("Города в порядке добавления: " + cities);
        System.out.println("Ключи: " + cities.keySet());
        System.out.println("Значения: " + cities.values());


        // =========================
        // 🔹 3. TreeMap (телефонная книга)
        // =========================
        TreeMap<Integer, String> phones = new TreeMap<>();
        phones.put(555123, "Nijat");
        phones.put(555222, "Cemil");
        phones.put(555111, "Jafar");
        phones.put(555333, "Sehriyar");
        phones.put(555444, "Ugur");

        System.out.println("Все записи: " + phones);
        System.out.println("Первый: " + phones.firstEntry());
        System.out.println("Последний: " + phones.lastEntry());
        System.out.println("Выше 555222: " + phones.higherEntry(555222));
        System.out.println("Ниже 555222: " + phones.lowerEntry(555222));


        // =========================
        // 🔹 4. Map.Entry (оценки)
        // =========================
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Math", 4);
        grades.put("Physics", 5);
        grades.put("History", 3);
        grades.put("Biology", 5);

        System.out.println("Оценки > 4:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getValue() > 4) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        // повысить Math
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getKey().equals("Math")) {
                entry.setValue(entry.getValue() + 1);
            }
        }
        System.out.println("После повышения Math: " + grades);


        // =========================
        // 🔹 5. Творческое (словарь переводов)
        // =========================
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "яблоко");
        dictionary.put("book", "книга");
        dictionary.put("dog", "собака");
        dictionary.put("cat", "кот");
        dictionary.put("house", "дом");
        dictionary.put("sun", "солнце");
        dictionary.put("moon", "луна");
        dictionary.put("car", "машина");
        dictionary.put("tree", "дерево");
        dictionary.put("water", "вода");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите английское слово: ");
        String word = sc.nextLine();

        if (dictionary.containsKey(word)) {
            System.out.println("Перевод: " + dictionary.get(word));
        } else {
            System.out.println("Перевод не найден");
        }
    }
}