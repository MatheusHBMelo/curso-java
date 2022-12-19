package ProgramacaoOrientadoObjeto.product;

import java.util.Scanner;
import java.util.Locale;

public class AppProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        product.name = sc.next();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("-");
        System.out.println("Product Data: " + product);

        System.out.println("-");
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("-");
        System.out.println("Updated Data: " + product);

        System.out.println("-");
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("-");
        System.out.println("Updated Data: " + product);

        sc.close();
    }
}
