package co.edu.uptc.view;
import java.util.Scanner;

import co.edu.uptc.model.Product;
import co.edu.uptc.model.ProductType;
import co.edu.uptc.model.ServiceSale;
import co.edu.uptc.presenter.Presenter;

public class Runner {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(ProductType.LICORES, 100);
        products[1] = new Product(ProductType.VIVERES, 100);
        products[2] = new Product(ProductType.MEDICINAS, 100);
        products[3] = new Product(ProductType.ASEO, 100);
        products[4] = new Product(ProductType.RANCHO, 100);

        ServiceSale serviceSale = new ServiceSale();
        Presenter presenter = new Presenter(serviceSale);

        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            presenter.addSale(products);
            System.out.println("¿Desea agregar otra venta? (s/n)");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("s"));

        presenter.showSale();
    }
}
