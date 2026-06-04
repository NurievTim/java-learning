package practice_7.LinkedHashMap.Task1;

import java.util.LinkedHashMap;

public class Task1 {
    private LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

    public void addElement(String name, Integer age) {
        linkedHashMap.put(name, age);
    }

    public void getLinkedHashMap() {
        System.out.println(linkedHashMap);
    }
}
