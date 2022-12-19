package estruturaCondicional.ifElse;

import java.util.Scanner;

public class ExerciciosIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercicio 1 - Positivo ou Negativo
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("Não Negativo");
        } else {
            System.out.println("Negativo");
        }

        // Exercicio 2 - Par ou Impar
        System.out.println("Digite um numero: ");
        int numeroDois = sc.nextInt();

        if (numeroDois % 2 != 0){
            System.out.println("IMPAR");
        } else {
            System.out.println("PAR");
        }

        // Exercicio 3 - Multiplos
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        // Exercicio 4 - Hora do jogo
        System.out.println("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) %n", duracao);

        // Exercicio 5 - Codigo e quantidade de produto
        System.out.println("Digite o código do produto: ");
        int code = sc.nextInt();
        System.out.println("Digite a quantidade de produtos: ");
        int qtd = sc.nextInt();

        double total = 0.0;
        if (code == 1){
            total = qtd * 4.00;
        } else if (code == 2) {
            total = qtd * 4.50;
        } else if (code == 3) {
            total = qtd * 5.00;
        } else if (code == 4) {
            total = qtd * 2.00;
        } else if (code == 5) {
            total = qtd * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        //Exercicio 6 - intervalos
        System.out.println("Digite o valor de intervalo: ");
        double inter = sc.nextDouble();

        if (inter >= 0 && inter < 25){
            System.out.println("Intervalo (0-25)");
        } else if (inter > 25 && inter < 50) {
            System.out.println("Intervalo (25-50)");
        } else if (inter > 50 && inter < 75) {
            System.out.println("Intervalo (50-75)");
        } else if (inter > 75 && inter < 100) {
            System.out.println("Intervalo (75-100)");
        } else {
            System.out.println("Fora do intervalo!");
        }

        // Exercicio 7 - Plano cartesiano
        System.out.println("Digite o valor de x: ");
        double x = sc.nextDouble();
        System.out.println("Digite o valor de y: ");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0){
            System.out.println("Origem");
        } else if (y == 0.0){
            System.out.println("Eixo Y");
        } else if (x == 0.0){
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x > 0.0 && y < 0.0){
            System.out.println("Q4");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0){
            System.out.println("Q3");
        }

        // Exercicio 8 - imposto de renda
        System.out.println("Digite o valor do seu salario: ");
        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000){
            imposto = 0.0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f %n", imposto);
        }

        sc.close();
    }
}
