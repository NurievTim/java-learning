package practice_7.HashMap.Task2;

import practice_7.HashMap.Task2.Task2;

public class Main {
    public static void main(String[] args) {
        Task2 hashMap = new Task2();
        hashMap.addElement("bob", 31);
        hashMap.addElement("rob", 21);
        hashMap.checkNameInMap("Willie");
        hashMap.checkNameInMap("rob");
    }
}
