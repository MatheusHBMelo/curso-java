package varargs;

public class EstudoVarargs {
    public static void main(String[] args) {
        // Testando um método com limite de parametros
        System.out.println(somar(10, 15));

        // Testando um método sem limite de parametros
        System.out.println(somar2(5, 5, 5, 5, 10));
    }

    // Método sem varargs
    public static int somar(int x, int y){
        return x + y;
    }

    // Método com varargs
    public static int somar2(int...x){
        int soma = 0;
        for (int v: x) {
            soma += v;
        }
        return soma;
    }
}
