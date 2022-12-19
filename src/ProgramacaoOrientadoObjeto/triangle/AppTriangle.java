package ProgramacaoOrientadoObjeto.triangle;

import java.util.Locale;
import java.util.Scanner;

public class AppTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Instanciando dois objetos do tipo Triangle
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        // Recebendo os valores dos objetos via console
        System.out.println("Enter the measures of Triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of Triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // Chamando o método da área e imprimindo na tela
        System.out.printf("Triagle X area: %.4f%n", x.area());
        System.out.printf("Triagle y area: %.4f%n", y.area());

        // Comparando o maior entre os dois objetos
        String maior = (x.area() > y.area()) ? "Larger: X" : "Larger: Y";
        System.out.println(maior);
    }
}