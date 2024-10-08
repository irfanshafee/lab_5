import java.util.List;
import java.util.Comparator;

public class OrderManager {
    public List<Product> sortProducts(List<Product>products){

        products.sort(Comparator.comparingDouble(Product:: calculateTotalPrice)
                                .thenComparing(Product:: getName)
                                        .thenComparingInt(Product:: getStockQuantity));
                                                return products;

    }

}
