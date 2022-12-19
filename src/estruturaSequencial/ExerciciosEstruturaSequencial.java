package estruturaSequencial;
import java.util.Scanner;

public class ExerciciosEstruturaSequencial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Exercicio 1
        System.out.println("Digite o primeiro numero: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.printf("Soma = %d%n", soma);

        // Exercicio 2
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f%n", area);

        // Exercicio 3
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        int d = sc.nextInt();

        int dif = (a * b) - (c * d);

        System.out.printf("Diferença = %d%n", dif);

        // Exercicio 4
        System.out.println("Digite o numero do funcionario: ");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        double salary = valorHora * (double) horasTrabalhadas;

        System.out.printf("Number: %d%n", numeroFuncionario);
        System.out.printf("Salary: R$%.2f%n", salary);

        // Exercicio 5
        System.out.println("Digite a quantidade de pecas: ");
        int qtdPecasUm = sc.nextInt();
        System.out.println("Digite o valor das pecas: ");
        double valorPecaUm = sc.nextDouble();

        System.out.println("Digite a quantidade de pecas: ");
        int qtdPecasDois = sc.nextInt();
        System.out.println("Digite o valor das pecas: ");
        double valorpecaDois = sc.nextDouble();

        double total = ( (double) qtdPecasUm * valorPecaUm) + ( (double) qtdPecasDois * valorpecaDois);

        System.out.printf("Valor a pagar: R$%.2f%n", total);

        // Exercicio 6
        System.out.println("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = sc.nextDouble();

        double areaTriangulo = A * C / 2;
        double areaCirculo = pi * Math.pow(C, 2);
        double areaTrapezio = (A + B) * C / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
        double areaLosango = A * B / 2;
        double comprimentoCircunferencia = 2 * pi * C;

        System.out.printf("Triangulo: %.3f%n", areaTriangulo);
        System.out.printf("Circulo: %.3f%n", areaCirculo);
        System.out.printf("Trapezio: %.3f%n", areaTrapezio);
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Retangulo: %.3f%n", areaRetangulo);
        System.out.printf("Losango: %.3f%n", areaLosango);
        System.out.printf("Circunferencia: %.3f%n", comprimentoCircunferencia);

        // Exercicio 7
        System.out.println("Digite o valor de A: ");
        int X = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int Y = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        int Z = sc.nextInt();

        int delta = (int) (Math.pow(Y, 2) - 4 * X * Z);

        double raizPositiva = (( -Y + (Math.sqrt(delta))) / (2 * A));

        double raizNegativa = (( -Y - (Math.sqrt(delta))) / (2 * A));

        System.out.printf("Raiz positiva: %f %n", raizPositiva);
        System.out.printf("Raiz negativa: %f %n", raizNegativa);

        sc.close();
    }
}
