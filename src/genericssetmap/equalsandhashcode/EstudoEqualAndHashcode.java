package genericssetmap.equalsandhashcode;

import java.util.Objects;

public class EstudoEqualAndHashcode {
    public static void main(String[] args) {
        String a = "Matheus";
        String b = "Davi";
        String c = "Matheus";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        Cliente c1 = new Cliente("Matheus", "matheus@email.com");
        Cliente c2 = new Cliente("Matheus", "matheus@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }

    public static class Cliente{
        private String nome;
        private String email;

        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Cliente cliente = (Cliente) o;

            if (!Objects.equals(nome, cliente.nome)) return false;
            return Objects.equals(email, cliente.email);
        }

        @Override
        public int hashCode() {
            int result = nome != null ? nome.hashCode() : 0;
            result = 31 * result + (email != null ? email.hashCode() : 0);
            return result;
        }
    }
}
