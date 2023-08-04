package co.edu.uptc.presenter;
import java.util.Scanner;

import co.edu.uptc.model.Product;
import co.edu.uptc.model.ServiceSale;

public class Presenter {
    private ServiceSale serviceSale;

    public Presenter(ServiceSale serviceSale) {
        this.serviceSale = serviceSale;
    }

    public void addSale(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que producto desea comprar?");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i].getName());
        }
        int choice = scanner.nextInt();
        Product product = products[choice-1];
        
        System.out.println("¿Cuantas unidades desea comprar?");
        int quantity = scanner.nextInt();
        
        serviceSale.sellProduct(product, quantity);
    }

    public void showSale() {
        serviceSale.showSale();
    }
}
