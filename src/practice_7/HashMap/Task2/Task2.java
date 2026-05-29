package practice_7.HashMap.Task2;

import java.util.HashMap;

public class Task2 {
    private HashMap<String, Integer> hashMap = new HashMap<>();

    public void addElement(String name, Integer age) {
        hashMap.put(name, age);
    }

    public void getHashMap() {
        System.out.println(hashMap);
    }

    public void checkNameInMap(String name) {
        if (hashMap.containsKey(name)) {
            System.out.println("Имя " + name + " есть в мапе");
        }
        else System.out.println("Имя " + name + " отсутствует в мапе");
    }
}
