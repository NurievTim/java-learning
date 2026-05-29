package practice_7.HashSet.Task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    private Set<Integer> hashSet;

    public Task1() {
        this.hashSet = new HashSet<>(List.of(1, 3, 4, 5, 6, 6));
    }

    public void getHashSet() {
        System.out.println(hashSet);
    }
}
