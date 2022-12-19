package comportamentoDeMemoria;

public class BonxingUnboxingWithWrapperClasses {
    public static void main(String[] args) {
        // Criando uma variavel primitiva (x) de tipo valor e atribuindo o valor 50;
        int x = 50;

        // Criando uma variavel Integer (Wrapper de int) de tipo refêrencia e atribuindo X
        Integer obj = x;

        // Criando uma variavel primitiva (y) de tipo valor e atribuindo obj;
        // Não é necessário Casting, por Interger ser a Wrapper Class equivale a int
        int y = obj;

        // Imprimindo o valor de x, y e obj
        System.out.println(x);
        System.out.println(obj);
        System.out.println(y);
    }
}
