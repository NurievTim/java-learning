package practice_7.HashMap.Task1;

import java.util.HashMap;

public class Task1 {
    private HashMap<String, Integer> hashMap = new HashMap<>();

    public void addElement(String name, Integer age) {
        hashMap.put(name, age);
    }

    public void getHashMap() {
        System.out.println(hashMap);
    }
}

