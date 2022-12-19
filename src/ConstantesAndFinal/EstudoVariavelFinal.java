package ConstantesAndFinal;

public class EstudoVariavelFinal {
    public static void main(String[] args) {
        // Declarando uma variavel final (constante) [UPPERCASE]
        final int VALOR;       // Sem inicializar
        final int VALOR2 = 10; // Com inicialização

        // Tentando alterar o valor da variavel
        VALOR = 5;       // Permitido, pois a constante não havia sido inicializada
        // valor2 = 15;  // Erro, pois constantes são imutaveis

        System.out.println(VALOR);
        System.out.println(VALOR2);
    }
}
