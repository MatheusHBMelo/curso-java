package ProgramacaoOrientadoObjeto.productWithConstructorEncapsulation;

import java.util.Locale;
import java.util.Scanner;

public class AppProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());

        System.out.println("----------");
        System.out.println("Product Data: " + product);

        System.out.println("----------");
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("----------");
        System.out.println("Updated Data: " + product);

        System.out.println("----------");
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("----------");
        System.out.println("Updated Data: " + product);

        sc.close();
    }
}
