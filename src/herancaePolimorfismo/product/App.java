package herancaePolimorfismo.product;

import herancaePolimorfismo.product.entities.ImportedProduct;
import herancaePolimorfismo.product.entities.Product;
import herancaePolimorfismo.product.entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        Product pdt;

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nProduct #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            switch (answer){
                case 'c':
                    pdt = new Product(name, price);
                    list.add(pdt);
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String date = sc.nextLine();
                    pdt = new UsedProduct(name, price, date);
                    list.add(pdt);
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customFee = sc.nextDouble();
                    sc.nextLine();
                    pdt = new ImportedProduct(name, price, customFee);
                    list.add(pdt);
                    break;
            }
        }
        System.out.println("\nPRICE TAGS:");
        for (Product pdts: list) {
            System.out.println(pdts.priceTag());
        }

        sc.close();
    }
}
