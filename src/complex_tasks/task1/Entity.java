package complex_tasks.task1;

public abstract class Entity {
    private final String name;
    private final int age;
    private final boolean isActive;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public Entity(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }
}
