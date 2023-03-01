package collections.map;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor implements Comparable<Consumidor> {
    private Long id;
    private String name;

    public Consumidor(String name) {
        this.id = ThreadLocalRandom.current().nextLong(0, 100);
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + name;
    }

    @Override
    public int compareTo(Consumidor o) {
        return this.id.compareTo(o.getId());
    }
}
