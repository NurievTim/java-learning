package complex_tasks.task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EntityManager<T extends Entity> {
    private CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void addEntity(T entity) {
        entities.add(entity);
    }

    public boolean deleteEntity(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAllEntities() {
        return List.copyOf(entities);
    }

    public List<T> filterByName(String name) {
        return entities.stream()
                .filter(entity -> entity.getName().equals(name))
                .toList();
    }

    public List<T> filterByAge(int minAge, int maxAge) {
        return entities.stream()
                .filter(entity -> entity.getAge() >= minAge && entity.getAge() <= maxAge)
                .toList();
    }

    public List<T> filterByActivity(boolean isActive) {
        return entities.stream()
                .filter(entity -> entity.isActive() == isActive)
                .toList();
    }
}
