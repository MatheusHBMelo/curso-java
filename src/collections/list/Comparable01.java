package collections.list;

import java.util.Objects;

public class Comparable01 implements Comparable<Comparable01> {
    private Long id;
    private String name;
    private double price;

    public Comparable01(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comparable01 that = (Comparable01) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Comparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Comparable01 o) {
        // Organizando por ID(Long Wrapper)
        //return this.id.compareTo(o.getId());

        // Organizando por name(String)
        return this.name.compareTo(o.getName());

        // Organizando por price(double primitivo)
        //return Double.compare(this.price, o.getPrice());
    }
}
