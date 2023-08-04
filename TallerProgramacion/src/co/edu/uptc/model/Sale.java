package co.edu.uptc.model;
public class Sale {
    private Product product;
    private int quantity;
    private double total;
    private double discount;
    private double tax;

    public Sale(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.discount = calculateDiscount();
        this.tax = calculateTax();
        this.total = calculateTotal();
    }

    private double calculateDiscount() {
        double discount = 0;
        if (quantity >= 5 && quantity <= 10) {
            discount = 0.05;
        } else if (quantity >= 11 && quantity <= 20) {
            discount = 0.1;
        } else if (quantity >= 21 && quantity <= 50) {
            discount = 0.2;
        } else if (quantity > 50) {
            discount = 0.3;
        }
        return discount;
    }

    private double calculateTax() {
        return product.getPrice() * quantity * 0.19; // IVA del 19%
    }

    private double calculateTotal() {
        return (product.getPrice() * quantity) * (1 - discount) + tax;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTax() {
        return tax;
    }
}
