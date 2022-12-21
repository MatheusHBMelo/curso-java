package composicaoDeClasses.pedido.entities;

import composicaoDeClasses.pedido.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    public static final DateTimeFormatter stf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        int total = 0;
        for(OrderItem item : items){
            total += item.subtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:").append("\n");
        sb.append("Order moment: ");
        sb.append(moment.format(stf2)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client.getName()).append(" (");
        sb.append(client.getBirthDate().format(Client.stf)).append(") - ");
        sb.append(client.getEmail()).append("\n");
        sb.append("Order items: ").append("\n");
        for(OrderItem item : items){
            sb.append(item.getProduct().getName()).append(", ");
            sb.append(String.format("$%.2f", item.getPrice())).append(", ");
            sb.append("Quantity: ");
            sb.append(item.getQuantity()).append(", ");
            sb.append("Subtotal: ");
            sb.append(String.format("$%.2f", item.subtotal())).append("\n");
        }
        sb.append("Total price: ");
        sb.append(String.format("$%.2f", total()));
        return sb.toString();
    }
}