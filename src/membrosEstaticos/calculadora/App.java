package membrosEstaticos.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        imprimirResultado(Calculadora.somar(10, 2));
        imprimirResultado(Calculadora.subtrair(10, 2));
        imprimirResultado(Calculadora.multiplicar(10, 2));
        imprimirResultado(Calculadora.dividir(10, 2));
        imprimirResultado(Calculadora.elevarPotencia(10, 2));
        imprimirResultado(Calculadora.fatorial(8));

        sc.close();
    }
    public static void imprimirResultado(int num){
        System.out.println(num);
    }
}
