package co.edu.uptc.model;
public class Product {
    private ProductType type;
    private int stock;

    public Product(ProductType type, int stock) {
        this.type = type;
        this.stock = stock;
    }

    public String getName() {
        return type.getName();
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return type.getPrice();
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
