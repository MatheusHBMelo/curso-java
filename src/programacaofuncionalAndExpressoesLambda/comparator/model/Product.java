package programacaofuncionalAndExpressoesLambda.comparator.model;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(String name, Double price){
        Objects.requireNonNull(name, "O nome não pode ser nulo");
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Nome: " + name + " | Price: " + String.format("R$%.2f", price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Product o) {
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }
}
