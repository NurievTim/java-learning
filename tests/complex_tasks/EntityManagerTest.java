package complex_tasks;

import complex_tasks.task1.Customer;
import complex_tasks.task1.Entity;
import complex_tasks.task1.EntityManager;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityManagerTest {
    @Test
    public void testAddEntity() {
        Customer customer = new Customer("Pete", 21, true);
        EntityManager<Customer> manager = new EntityManager<>();
        manager.addEntity(customer);

        assertEquals(List.of(customer), manager.getAllEntities());
    }

    @Test
    public void testDeleteEntity() {
        Customer customer = new Customer("Pete", 21, true);
        EntityManager<Customer> manager = new EntityManager<>();
        manager.addEntity(customer);

        assertTrue(manager.deleteEntity(customer));
        assertTrue(manager.getAllEntities().isEmpty());
    }

    @Test
    public void testFilterByAge() {
        Customer customer1 = new Customer("Pete", 21, true);
        Customer customer2 = new Customer("Ann", 19, true);
        Customer customer3 = new Customer("Bob", 29, false);
        EntityManager<Customer> manager = new EntityManager<>();
        manager.addEntity(customer1);
        manager.addEntity(customer2);
        manager.addEntity(customer3);

        List<Customer> sortedList = manager.filterByAge(20, 30);

        assertEquals(2, sortedList.size());
        assertTrue(sortedList.stream()
                .allMatch(customer -> customer.getAge() >= 20 && customer.getAge() <= 30));
    }

    @Test
    public void testFilterByName() {
        Customer customer1 = new Customer("Pete", 21, true);
        Customer customer2 = new Customer("Ann", 19, true);
        Customer customer3 = new Customer("Bob", 29, false);
        EntityManager<Customer> manager = new EntityManager<>();
        manager.addEntity(customer1);
        manager.addEntity(customer2);
        manager.addEntity(customer3);

        List<Customer> sortedList = manager.filterByName("Ann");

        assertEquals(1, sortedList.size());
        assertTrue(sortedList.stream()
                .allMatch(customer -> customer.getName().contains(customer2.getName())));
    }

    @Test
    public void testFilterByActivity() {
        Customer customer1 = new Customer("Pete", 21, true);
        Customer customer2 = new Customer("Ann", 19, true);
        Customer customer3 = new Customer("Bob", 29, false);
        EntityManager<Customer> manager = new EntityManager<>();
        manager.addEntity(customer1);
        manager.addEntity(customer2);
        manager.addEntity(customer3);

        List<Customer> sortedList = manager.filterByActivity(true);

        assertEquals(2, sortedList.size());
        assertTrue(sortedList.stream()
                .allMatch(Entity::isActive));
    }




}
