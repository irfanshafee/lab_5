public class Furniture implements  Product{
    private String name;
    private int stockQuantity;
    private double unitPrice;
    private static  final double TAX_RATE = 0.08;

    public Furniture(String name, int stockQuantity, double unitPrice) {
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }

    public String getName(){
        return name;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }

    public double getUnitPrice() {
        return 0;
    }

    public double calculateTotalPrice(){
        return unitPrice + (unitPrice* TAX_RATE);
    }
}
