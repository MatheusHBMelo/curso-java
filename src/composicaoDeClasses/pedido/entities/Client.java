package composicaoDeClasses.pedido.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    public static final DateTimeFormatter stf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Client() {
    }

    public Client(String name, String email, String birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = LocalDate.parse(birthDate, stf);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}