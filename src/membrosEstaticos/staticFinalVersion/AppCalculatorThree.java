package membrosEstaticos.staticFinalVersion;

import java.util.Locale;
import java.util.Scanner;

public class AppCalculatorThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /*
        Não é necessário instanciar um objeto, pois a classe CalculatorThree possui apenas
        membros estaticos, por tanto, pode ser utilizada uma chamada direta

        NomeDaClasse.NomeDoMetodo();
         */
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        // É feita uma chamada diretamente na classe que possui o membro estatico
        double c = CalculatorThree.circumference(radius);
        double v = CalculatorThree.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", CalculatorThree.PI);

        sc.close();
    }
}
