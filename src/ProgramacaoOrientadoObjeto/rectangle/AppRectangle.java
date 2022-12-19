package ProgramacaoOrientadoObjeto.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class AppRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle retangulo = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        System.out.print("Width: ");
        retangulo.width = sc.nextDouble();
        System.out.print("Height: ");
        retangulo.height = sc.nextDouble();

        System.out.printf("AREA: %.2f%n", retangulo.area());
        System.out.printf("PERIMETER: %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", retangulo.diagonal());


        sc.close();
    }
}
