package programacaofuncionalAndExpressoesLambda.function.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static String staticSetUppercase(Product p){
        return p.getName().toUpperCase();
    }

    public String nonStaticSetUppercase(){
        return name.toUpperCase();
    }

    public String toString(){
        return "Nome: " + name + " | Preço: R$" + String.format("%.2f", price);
    }
}
