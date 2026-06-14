package complex_tasks;

import complex_tasks.task6.Task;
import complex_tasks.task6.TaskService;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    @Test
    public void testAddTask() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task = new Task<>(1, Task.Status.NEW, Task.Priority.MEDIUM, LocalDateTime.now());
        service.addTask(task);

        assertEquals(List.of(task), service.getAll());
    }

    @Test
    public void testAddExistingTask() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, Task.Status.NEW, Task.Priority.MEDIUM, LocalDateTime.now());
        Task<Integer> task2 = new Task<>(1, Task.Status.NEW, Task.Priority.MEDIUM, LocalDateTime.now());
        service.addTask(task1);

        assertThrows(IllegalArgumentException.class, () -> service.addTask(task2));
    }

    @Test
    public void testAddTaskStringId() {
        TaskService<String> service = new TaskService<>();
        Task<String> task = new Task<>("1", Task.Status.NEW, Task.Priority.MEDIUM, LocalDateTime.now());
        service.addTask(task);

        assertEquals(List.of(task), service.getAll());
    }

    @Test
    public void testAddExistingTaskStringId() {
        TaskService<String> service = new TaskService<>();
        Task<String> task1 = new Task<>("1", Task.Status.NEW, Task.Priority.MEDIUM, LocalDateTime.now());
        Task<String> task2 = new Task<>("1", Task.Status.NEW, Task.Priority.MEDIUM, LocalDateTime.now());
        service.addTask(task1);

        assertThrows(IllegalArgumentException.class, () -> service.addTask(task2));
    }

    @Test
    public void testFilterTasksByPriority() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, Task.Status.NEW, Task.Priority.HIGH, LocalDateTime.now());
        Task<Integer> task2 = new Task<>(2, Task.Status.IN_PROGRESS, Task.Priority.LOW, LocalDateTime.now());
        Task<Integer> task3 = new Task<>(3, Task.Status.IN_PROGRESS, Task.Priority.MEDIUM, LocalDateTime.now());
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);

        assertEquals(List.of(task1), service.filterByPriority(Task.Priority.HIGH));
    }

    @Test
    public void testFilterTasksByPriorityEmptyList() {
        TaskService<String> service = new TaskService<>();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.filterByPriority(Task.Priority.HIGH));
        assertEquals("Задач нет", exception.getMessage());
    }

    @Test
    public void testFilterTasksByStatus() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, Task.Status.DONE, Task.Priority.HIGH, LocalDateTime.now());
        Task<Integer> task2 = new Task<>(2, Task.Status.NEW, Task.Priority.LOW, LocalDateTime.now());
        Task<Integer> task3 = new Task<>(3, Task.Status.IN_PROGRESS, Task.Priority.MEDIUM, LocalDateTime.now());
        service.addTask(task3);
        service.addTask(task2);
        service.addTask(task1);

        assertEquals(List.of(task2), service.filterByStatus(Task.Status.NEW));
    }

    @Test
    public void testFilterTasksByStatusEmptyList() {
        TaskService<String> service = new TaskService<>();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> service.filterByStatus(Task.Status.IN_PROGRESS));
        assertEquals("Задач нет", exception.getMessage());
    }

    @Test
    public void testSortTasksByDate() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, Task.Status.DONE, Task.Priority.HIGH, LocalDateTime.of(2026, 5, 10, 13, 14));
        Task<Integer> task2 = new Task<>(2, Task.Status.NEW, Task.Priority.LOW, LocalDateTime.of(2026, 5, 12, 3, 1));
        Task<Integer> task3 = new Task<>(3, Task.Status.IN_PROGRESS, Task.Priority.MEDIUM, LocalDateTime.of(2026, 3, 3, 3, 4));
        service.addTask(task3);
        service.addTask(task2);
        service.addTask(task1);

        assertEquals(List.of(task3, task1, task2), service.sortByDate());
    }

    @Test
    public void testDeleteTask() {
        TaskService<Integer> service = new TaskService<>();
        Task<Integer> task1 = new Task<>(1, Task.Status.DONE, Task.Priority.HIGH, LocalDateTime.of(2026, 5, 10, 13, 14));
        service.addTask(task1);
        service.deleteTaskById(task1.getId());

        assertTrue(service.getAll().isEmpty());
    }
}
