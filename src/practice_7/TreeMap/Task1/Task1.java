package practice_7.TreeMap.Task1;


import java.util.TreeMap;

public class Task1 {
    private TreeMap<String, Integer> treeMap = new TreeMap<>();

    public void addElement(String name, Integer score) {
        treeMap.put(name, score);
    }

    public void getTreeMap() {
        System.out.println(treeMap);
    }
}
