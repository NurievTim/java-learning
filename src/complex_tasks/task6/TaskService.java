package complex_tasks.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskService<T> {
    private final List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask(Task<T> task) {
        if (tasks.stream().anyMatch(t -> t.getId().equals(task.getId()))) {
            throw new IllegalArgumentException("Задача с таким id уже создана");
        }
        tasks.add(task);
    }

    public synchronized void deleteTaskById(T id) {
        tasks.removeIf(t -> t.getId().equals(id));
    }

    public List<Task<T>> filterByPriority(Task.Priority priority) {
        if (tasks.isEmpty()) {
            throw new IllegalArgumentException("Задач нет");
        }
        return tasks.stream().filter(t -> t.getPriority().equals(priority)).toList();
    }

    public List<Task<T>> filterByStatus(Task.Status status) {
        if (tasks.isEmpty()) {
            throw new IllegalArgumentException("Задач нет");
        }
        return tasks.stream().filter(t -> t.getStatus().equals(status)).toList();
    }

    public List<Task<T>> sortByDate() {
        return tasks.stream().sorted(Comparator.comparing(Task::getDate)).toList();
    }

    public List<Task<T>> getAll() {
        return List.copyOf(tasks);
    }
}

