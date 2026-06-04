package practice_7.LinkedHashSet.Task1;

import java.util.LinkedHashSet;

public class Task1 {
    private LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    public void addElement(String element) {
        linkedHashSet.add(element);
    }

    public void getLinkedHashSet() {
        System.out.println(linkedHashSet);
    }
}
