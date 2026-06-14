package complex_tasks;

import complex_tasks.task5.InventoryService;
import complex_tasks.task5.OutOfStockException;
import complex_tasks.task5.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    @Test
    public void testAddProductToStock() {
        InventoryService service = new InventoryService();
        Product product = new Product("MacBook Air", "Техника", 60000);
        service.addProductToStock(product);

        assertTrue(service.getAll().containsKey(product.getCategory()));
    }

    @Test
    public void testCannotAddProductToStock() {
        InventoryService service = new InventoryService();
        Product product = new Product("MacBook Air", "Техника", 60000);
        service.setInventoryOpen();
        service.addProductToStock(product);

        assertFalse(service.getAll().containsKey(product.getCategory()));
    }

    @Test
    public void testGetProductByCategory() {
        InventoryService service = new InventoryService();
        Product product1 = new Product("MacBook Air", "Техника", 60000);
        Product product2 = new Product("MacBook Pro", "Техника", 150000);
        Product product3 = new Product("Dyson", "Бытовая Техника", 3000);
        service.addProductToStock(product1);
        service.addProductToStock(product2);
        service.addProductToStock(product3);

        assertEquals(product1, service.getProductByCategory("Техника"));
    }

    @Test
    public void testGetProductOutOfStock() {
        InventoryService service = new InventoryService();

        OutOfStockException exception = assertThrows(OutOfStockException.class, () -> service.getProductByCategory("Техника"));
        assertEquals("В этой категории нету товара", exception.getMessage());
    }

    @Test
    public void testFilterProductsByPrice() {
        InventoryService service = new InventoryService();
        Product product1 = new Product("MacBook Air", "Техника", 60000);
        Product product2 = new Product("MacBook Pro", "Техника", 150000);
        Product product3 = new Product("Dyson", "Бытовая Техника", 3000);
        service.addProductToStock(product1);
        service.addProductToStock(product2);
        service.addProductToStock(product3);

        assertEquals(List.of(product1, product2), service.filterProductsByPrice(50000));
        assertEquals(2, service.filterProductsByPrice(50000).size());

    }
}
