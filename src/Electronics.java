
public class Electronics implements Product {
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private static final double TAX_RATE = 0.15;

    public Electronics(String name, int stockQuantity, double unitPrice) {
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public double calculateTotalPrice() {
        return unitPrice + (unitPrice * TAX_RATE);
    }
}