package comportamentoDeMemoria;

public class EstudoUnboxing {
    public static void main(String[] args) {
        // Criando uma variavel primitiva (x) de tipo valor e atribuindo o valor 50;
        int x = 50;

        // Criando uma variavel objeto (obj) de tipo refêrencia e atribuindo X
        Object obj = x;

        // Criando uma variavel primitiva (y) de tipo valor e atribuindo obj;
        // Necessário realizar casting para o tipo de dado do recebedor
        int y = (int) obj;

        // Imprimindo o valor de x, y e obj
        System.out.println(x);
        System.out.println(obj);
        System.out.println(y);
    }
}
