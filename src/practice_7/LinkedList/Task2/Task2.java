package practice_7.LinkedList.Task2;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    private Queue<String> queue = new LinkedList<>();

    public void addTaskToQueue(String task) {
        queue.add(task);
    }

    public void completeTasks() {
        while (!queue.isEmpty()) {
            String currentTask = queue.poll();
            System.out.println("Выполняется задача - " + currentTask);
        }
    }

    public void getQueue() {
        System.out.println(queue);
    }


}
