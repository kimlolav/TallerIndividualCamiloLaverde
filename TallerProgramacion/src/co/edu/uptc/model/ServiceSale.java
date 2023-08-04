package co.edu.uptc.model;
import java.util.ArrayList;

public class ServiceSale {
    private ArrayList<Sale> sales;

    public ServiceSale() {
        sales = new ArrayList<>();
    }

    public void sellProduct(Product product, int quantity) {
        if (product.getStock() < quantity) {
            System.out.println("No hay suficiente stock para vender " + quantity + " unidades de " + product.getName());
            return;
        }
        product.setStock(product.getStock() - quantity);
        Sale sale = new Sale(product, quantity);
        sales.add(sale);
        System.out.println("Se vendieron " + quantity + " unidades de " + product.getName() + " por un total de $" + sale.getTotal());
    }

    public void showSale() {
        double totalSales = 0;
        for (Sale sale : sales) {
            System.out.println(sale.getQuantity() + " x " + sale.getProduct().getName() + " = $" + sale.getTotal());
            totalSales += sale.getTotal();
        }
        System.out.println("Total de ventas: $" + totalSales);
}}