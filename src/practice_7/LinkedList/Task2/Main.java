package practice_7.LinkedList.Task2;

import practice_7.LinkedList.Task2.Task2;

public class Main {
    public static void main(String[] args) {
        Task2 linkedListQueue = new Task2();
        linkedListQueue.addTaskToQueue("Task_1");
        linkedListQueue.addTaskToQueue("Task_2");
        linkedListQueue.addTaskToQueue("Task_3");
        linkedListQueue.getQueue();
        linkedListQueue.completeTasks();
        linkedListQueue.getQueue();
    }
}
