package practice_7.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueTask {
    private PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public void addElement(Integer element) {
        priorityQueue.offer(element);
    }

    public void getQueueElement() {
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

    public void getPriorityQueue() {
        System.out.println(priorityQueue);
    }

}

