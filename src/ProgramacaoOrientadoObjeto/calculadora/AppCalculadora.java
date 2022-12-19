package ProgramacaoOrientadoObjeto.calculadora;

import java.util.Scanner;
import java.util.Locale;

public class AppCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Calculadora cal = new Calculadora();
        cal.valorPrimario = 50;
        cal.valorSecundario = 10;

        System.out.println(cal.adicao());
        System.out.println(cal.subtracao());
        System.out.println(cal.multiplicacao());
        System.out.println(cal.divisao());

        sc.close();
    }
}
