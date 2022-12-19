package membrosEstaticos.contador;

public class Contador {
    public static int cont;

    public static void incrementarContador(){
        cont++;
    }

    public static void zerarContador(){
        cont = 0;
    }

    public static int obterValor(){
        return cont;
    }

    public static void imprimirValor(){
        System.out.println(obterValor());
    }
}
