package complex_tasks.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InventoryService {
    private boolean isInventoryOpen = true;
    private Map<String, List<Product>> stock = new ConcurrentHashMap<>();

    public void setInventoryOpen() {
        isInventoryOpen = !isInventoryOpen;
    }

    public void addProductToStock(Product product) {
        if (isInventoryOpen) {
            stock.computeIfAbsent(product.getCategory(), category -> new ArrayList<>()).add(product);
        }
    }

    public Product getProductByCategory(String category) {
        List<Product> products = stock.get(category);
        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("В этой категории нету товара");
        }
        return products.getFirst();
    }

    public Map<String, List<Product>> getAll() {
        return stock;
    }

    public List<Product> filterProductsByPrice(double minPrice) {
        return stock.values().stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() >= minPrice)
                .toList();
    }
}
