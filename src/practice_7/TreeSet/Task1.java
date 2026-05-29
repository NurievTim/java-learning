package practice_7.TreeSet;

import java.util.TreeSet;

public class Task1 {
    private TreeSet<Integer> treeSet = new TreeSet<>();

    public void addElement(Integer element) {
        treeSet.add(element);
    }

    public void getTreeSet() {
        System.out.println(treeSet);
    }
}
