package composicaoDeClasses.pedido;

import composicaoDeClasses.pedido.entities.Client;
import composicaoDeClasses.pedido.entities.Order;
import composicaoDeClasses.pedido.entities.OrderItem;
import composicaoDeClasses.pedido.entities.Product;
import composicaoDeClasses.pedido.enums.OrderStatus;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Colhendo as informações do cliente
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birth = sc.nextLine();

        // Instanciando um cliente com as informações anteriores
        Client client = new Client(name, email, birth);

        // Colhendo a informação do Status do pedido
        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        // Criando um pedido com o status e o cliente
        Order order = new Order(status, client);

        // Recebendo a quantidade de items que serão cadastrados no pedido
        System.out.print("\nHow many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Estrutura for para cadastro dos items que estarão no pedido
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("\nEnter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            // Criando um produto com nome e preço
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();

            // Criando um item do pedido com quantidade, preço e produto
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            // Adicionando o item ao pedido
            order.addItem(orderItem);
        }
        // Imprimindo a estrutura do pedido
        System.out.println(order);

        sc.close();
    }
}