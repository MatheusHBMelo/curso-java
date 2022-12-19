package ConstantesAndFinal;

public class EstudoMetodoFinal {
    public static void main(String[] args) {}

    public class TesteUm {
        final void m1()
        {
            System.out.println("Esse é um método final!");
        }
    }

    public class TesteDois extends TesteUm {
        /*
        @Override
        void m1()
        {
            Erro de compilação! Nós não podemos sobrescrever esse método
            System.out.println("Esse é um outro metodo!");
        }
        */
    }
}
