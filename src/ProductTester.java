import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


public class ProductTester {

    @Test
    public void testElectronicsTotalPrice(){
        Product electronics = new Electronics("laptop", 10, 1000);
        assertEquals(1150, electronics.calculateTotalPrice());
   }

   @Test
    public void testClothingTotalPrice(){
        Product clothing = new Clothing("Tshirt", 20, 50);
        assertEquals(55, clothing.calculateTotalPrice());
    }

    @Test
    public void testFurnitureTotalPrice(){
        Product furniture = new Furniture("Chair", 15, 200);
        assertEquals(216, furniture.calculateTotalPrice());
    }

    @Test
    public void testSortProductsByTotalPrice() {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Laptop", 10, 1000));
        products.add(new Clothing("T-Shirt", 20, 50));
        products.add(new Furniture("Chair", 15, 200));

        OrderManager orderManager = new OrderManager();
        List<Product> sortedProducts = orderManager.sortProducts(products);

        assertEquals("T-Shirt", sortedProducts.get(0).getName());
        assertEquals("Chair", sortedProducts.get(1).getName());
        assertEquals("Laptop", sortedProducts.get(2).getName());
    }

    @Test
    public void teatSortProductByName(){
        List<Product>products = new ArrayList<>();
        products.add( new Electronics("BETA", 10,1000));
        products.add( new Electronics("ALPHA", 10,1000));

        OrderManager orderManager = new OrderManager();
        List<Product> sortedProducts = orderManager.sortProducts(products);

        assertEquals("ALPHA", sortedProducts.get(0).getName());
        assertEquals("BETA", sortedProducts.get(1).getName());
    }
    @Test
    public void testSortProductsByStockQuantity() {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("Phone", 5, 1000));
        products.add(new Electronics("Phone", 10, 1000));

        OrderManager orderManager = new OrderManager();
        List<Product> sortedProducts = orderManager.sortProducts(products);

        assertEquals(5, sortedProducts.get(0).getStockQuantity());
        assertEquals(10, sortedProducts.get(1).getStockQuantity());
    }
}
