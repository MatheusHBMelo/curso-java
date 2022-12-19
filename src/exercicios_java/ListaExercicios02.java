package exercicios_java;

import java.util.Scanner;
import java.util.Locale;

public class ListaExercicios02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /*01
        Escreva um algoritmo em JAVA que leia um número e informe se ele é divisível por
        10, por 5 ou por 2 ou se não é divisível por nenhum deles.
         */
        System.out.println("Digite um número: ");
        int num1 = sc.nextInt();

        if (num1 % 10 == 0){
            System.out.println("O numero é divisivel por 10");
        }
        if (num1 % 5 == 0){
            System.out.println("O numero é divisivel por 5");
        }
        if (num1 % 2 == 0){
            System.out.println("O numero é divisivel por 2");
        } else {
            System.out.println("O numero não é divisivel por 10, 5 e 2");
        }

        /*02
        Construa um algoritmo de PORTUGOL para determinar se o indivíduo esta com um peso favorável.
        Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como
        sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo;
        IMC abaixo de 20 - Abaixo do peso
        IMC de 20 à 25   - Peso ideal
        IMC de 25 à 30   - Sobrepeso
        IMC de 30 à 40   - Obeso
        IMC acima de 40  - Obeso morbido
         */
        System.out.println("Digite a sua altura em centimetros (m): ");
        double altura = sc.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * 2);

        if (imc < 20){
            System.out.println("Você está abaixo do peso ideal");
        } else if (imc > 20 && imc < 25) {
            System.out.println("Você está no peso ideal");
        } else if (imc > 25 && imc < 30) {
            System.out.println("Você está com sobrepeso");
        } else if (imc > 30 && imc < 40) {
            System.out.println("Você está com obesidade inicial");
        } else if (imc > 40) {
            System.out.println("Você está com obesidade grau morbido");
        }

        /*03
        Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B
        é menor que C.
         */
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        int c =  sc.nextInt();

        if ( a + b > c){
            System.out.println("A soma de A + B é maior que C");
        } else if (a + b == c) {
            System.out.println("A soma de A + B é igual a C");
        }else {
            System.out.println("A soma de A + B é menor que C");
        }

        /*04
        Faça um algoritmo que leia o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
        estado civil seja “CASADA”, solicitar o tempo de casada (anos)
         */
        System.out.println("Digite o seu sexo (F/M): ");
        char sexo = sc.next().charAt(0);

        System.out.println("Digite o seu estado civil: ");
        String estadoCivil = sc.next();

        int tempoCasado = 0;
        if (sexo == 'F' && estadoCivil.equals("CASADO")){
            System.out.println("Digite o tempo de casado (anos): ");
            tempoCasado = sc.nextInt();
        }
        System.out.println(tempoCasado);

        /*05
        Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.
         */
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

        /*06
        Faça um algoritmo que leia dois valores inteiros valorA e valorB se os valores forem iguais deverá se
        somar os dois, caso contrário multiplique valorA por valorB. Ao final de qualquer um dos cálculos deve-se
        atribuir o resultado para uma variável C e mostrar o seu conteúdo na tela.
         */
        System.out.println("Digite o valor de A: ");
        int valorA = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int valorB = sc.nextInt();

        int valorIgual;
        int valorDiferente;
        if (valorA == valorB) {
            valorIgual = valorA + valorB;
            System.out.printf("RESULTADO: %d%n", valorIgual);
        } else {
            valorDiferente = valorA * valorB;
            System.out.printf("RESULTADO: %d%n", valorDiferente);
        }

        /*07
        Encontrar o dobro de um número caso ele seja positivo e o seu triplo
        caso seja negativo, imprimindo o resultado.
         */
        System.out.println("Digite um número: ");
        int numeroUm = sc.nextInt();

        int valorFinal;
        if (numeroUm < 0){
            valorFinal = numeroUm * 3;
            System.out.printf("RESULTADO: %d%n", valorFinal);
        } else {
            valorFinal = numeroUm * 2;
            System.out.printf("RESULTADO: %d%n", valorFinal);
        }

        /*08
        Faça um algoritmo que leia uma variável e some 5 caso seja par ou
        some 8 caso seja ímpar, imprimir o resultado desta operação.
         */
        System.out.println("Digite o valor: ");
        int numeroDois = sc.nextInt();

        int somaFinal;
        if (numeroDois % 2 == 0){
            somaFinal = numeroDois + 5;
            System.out.printf("RESULTADO: %d%n", somaFinal);
        }else {
            somaFinal = numeroDois + 8;
            System.out.printf("RESULTADO: %d%n", somaFinal);
        }

        /*09
        Escreva um algoritmo que leia três valores inteiros e diferentes e
        mostre-os em ordem decrescente.
         */
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();

        if ((valor1 > valor2 && valor1 > valor3) && valor2 > valor3){
            System.out.printf("%d,%d,%d%n", valor1, valor2, valor3);
        } else if ((valor1 > valor2 && valor1 > valor3) && valor3 > valor2){
            System.out.printf("%d,%d,%d%n", valor1, valor3, valor2);
        } else if ((valor2 > valor1 && valor2 > valor3) && valor1 > valor3){
            System.out.printf("%d,%d,%d%n", valor2, valor1, valor3);
        } else if ((valor2 > valor1 && valor2 > valor3) && valor3 > valor1){
            System.out.printf("%d,%d,%d%n", valor2, valor3, valor1);
        } else if ((valor3 > valor1 && valor3 > valor2) && valor1 > valor2){
            System.out.printf("%d,%d,%d%n", valor3, valor1, valor2);
        } else if ((valor3 > valor1 && valor3 > valor2) && valor2 > valor1){
            System.out.printf("%d,%d,%d%n", valor3, valor2, valor1);
        } else {
            System.out.println("ERRO: Os números precisam ser diferentes.");
        }

        /*10
        Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
        normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
        para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.

        Código Condição de pagamento:

        1 À vista em dinheiro ou cheque, recebe 10% de desconto
        2 À vista no cartão de crédito, recebe 15% de desconto
        3 Em duas vezes, preço normal de etiqueta sem juros
        4 Em duas vezes, preço normal de etiqueta mais juros de 10%
         */
        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println("Digite o número referente a consição de pagamento: ");
        int pagamento = sc.nextInt();

        double finalValor;

        switch (pagamento) {
            case 1 -> {
                // Dinheiro e cheque == 10% de desconto
                finalValor = valorProduto - (valorProduto * 0.10);
                System.out.printf("Valor a pagar total: %.2f%n", finalValor);
            }
            case 2 -> {
                // Cartão de crédito == 15% de desconto
                finalValor = valorProduto - (valorProduto * 0.15);
                System.out.printf("Valor a pagar total: %.2f%n", finalValor);
            }
            case 3 -> {
                // Em duas vezes == preço normal
                finalValor = valorProduto;
                System.out.printf("Valor a pagar total: %.2f%n", finalValor);
            }
            case 4 -> {
                // Em quatro vezes == 10% de juros
                finalValor = valorProduto + (valorProduto * 0.10);
                System.out.printf("Valor a pagar total: %.2f%n", finalValor);
            }
            default -> System.out.println("Digite a forma de pagamento entre 0 à 4: ");
        }

        /*11
        Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas
        3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
        aproveitamento, usando a fórmula:

        MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7

        A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno,
        suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a
        mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
        Média de aproveitamento Conceito

        >= 90 A
        >= 75 e < 90 B
        >= 60 e < 75 C
        >= 40 e < 60 D
        < 40 E
         */
        System.out.println("Digite o seu ID de aluno: ");
        int idAluno = sc.nextInt();

        System.out.println("Digite a sua primeira nota: ");
        double nota1 = sc.nextInt();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = sc.nextInt();

        System.out.println("Digite a sua terceira nota: ");
        double nota3 = sc.nextInt();

        System.out.println("Digite a sua média de exercicios (ME): ");
        double mediaE = sc.nextDouble();

        double mediaDeAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaE) / 7;

        char conceitoFinal = 'n';
        String mensagem;

        if (mediaDeAproveitamento < 40) {
            conceitoFinal = 'E';
        } else if (mediaDeAproveitamento >= 40 && mediaDeAproveitamento < 60){
            conceitoFinal = 'D';
        } else if (mediaDeAproveitamento >= 60 && mediaDeAproveitamento < 75) {
            conceitoFinal = 'C';
        } else if (mediaDeAproveitamento >= 75 && mediaDeAproveitamento < 90) {
            conceitoFinal = 'B';
        } else if (mediaDeAproveitamento >= 90) {
            conceitoFinal = 'A';
        }else {
            System.out.println("Erro");
        }

        if (conceitoFinal == 'A' || conceitoFinal == 'B' || conceitoFinal == 'C' ){
            mensagem = "Aprovado";
        } else {
            mensagem = "Reprovado";
        }

        System.out.printf("Numero: %d - Notas: [%.1f][%.1f][%.1f] - ME: %.2f - MA: %.2f - Conceito: %c - Resultado: %s%n",
                idAluno, nota1, nota2, nota3, mediaE, mediaDeAproveitamento, conceitoFinal, mensagem);

        /*12
        Escrever um algoritmo que leia as três notas obtidas por um aluno durante o semestre. Calcular a sua
        média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação
        (media entre 5.1 a 6.9).
        */
        System.out.println("Digite a sua primeira nota: ");
        double nota01 = sc.nextDouble();
        System.out.println("Digite a sua primeira nota: ");
        double nota02 = sc.nextDouble();
        System.out.println("Digite a sua primeira nota: ");
        double nota03 = sc.nextDouble();

        double mediaAritmetica = (nota01 + nota02 + nota03) / 3;

        if (mediaAritmetica >= 7.0) {
            System.out.println("Aprovado");
        } else if (mediaAritmetica <= 5.0) {
            System.out.println("Reprovado");
        } else if (mediaAritmetica > 5.0 && mediaAritmetica <= 6.9) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Erro");
        }

        /*13
        Elabore um algoritmo que leia do teclado o sexo de uma pessoa. Se o sexo digitado for M ou F, escrever na tela
        “Sexo válido!”. Caso contrário, informar “Sexo inválido!”;
        */
        System.out.println("Digite o seu sexo (M/F): ");
        char sexoId = sc.next().charAt(0);

        if (sexoId == 'M' || sexoId == 'F'){
            System.out.println("Sexo válido!");
        }else {
            System.out.println("Sexo inválido!");
        }

        /*14
        Elabore um algoritmo que leia 5 valores inteiros e apresente na tela o maior e o menor deles.
        */
        System.out.println("Digite o primeiro número: ");
        int valorUm = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int valorDois = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int valorTres = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        int valorQuatro = sc.nextInt();
        System.out.println("Digite o quinto número: ");
        int valorCinco = sc.nextInt();

        int maiorN = 0;
        int menorN = 0;

        if (valorUm > valorDois && valorUm > valorTres && valorUm > valorQuatro && valorUm > valorCinco) {
            maiorN = valorUm;
        }else if (valorDois > valorUm && valorDois > valorTres && valorDois > valorQuatro && valorDois > valorCinco) {
            maiorN = valorDois;
        }else if (valorTres > valorUm && valorTres > valorDois && valorTres > valorQuatro && valorTres > valorCinco) {
            maiorN = valorTres;
        }else if (valorQuatro > valorUm && valorQuatro > valorDois && valorQuatro > valorTres && valorQuatro > valorCinco) {
            maiorN = valorQuatro;
        }else if (valorCinco > valorUm && valorCinco > valorDois && valorCinco > valorTres && valorCinco > valorQuatro) {
            maiorN = valorCinco;
        }else {
            System.out.println("Os numeros precisam ser diferentes.");
        }

        if (valorUm < valorDois && valorUm < valorTres && valorUm < valorQuatro && valorUm < valorCinco) {
            menorN = valorUm;
        }else if (valorDois < valorUm && valorDois < valorTres && valorDois < valorQuatro && valorDois < valorCinco) {
            menorN = valorDois;
        }else if (valorTres < valorUm && valorTres < valorDois && valorTres < valorQuatro && valorTres < valorCinco) {
            menorN = valorTres;
        }else if (valorQuatro < valorUm && valorQuatro < valorDois && valorQuatro < valorTres && valorQuatro < valorCinco) {
            menorN = valorQuatro;
        }else if (valorCinco < valorUm && valorCinco < valorDois && valorCinco < valorTres && valorCinco < valorQuatro) {
            menorN = valorCinco;
        }else {
            System.out.println("Os numeros precisam ser diferentes.");
        }

        System.out.printf("Maior: %d - Menor: %d%n", maiorN, menorN);

        /*15
        Num determinado Estado, para transferências de veículos, o DETRAN cobra uma taxa de 1% para carros
        fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante,
        taxa esta incidindo sobre o valor de tabela do carro. O algoritmo abaixo lê o ano e
        o preço do carro e a seguir calcula e imprime imposto a ser pago.
        */
        System.out.println("Digite o ano do veiculo: ");
        int anoVeh = sc.nextInt();
        System.out.println("Digite o valor do veiculo: ");
        double valorVeh = sc.nextDouble();

        double impostoVeh;

        if (anoVeh < 1990) {
            impostoVeh = valorVeh * 0.01;
        } else {
            impostoVeh = valorVeh * 0.015;
        }

        System.out.printf("Valor do imposto: R$%.2f%n", impostoVeh);

        /*16
        Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. Faça um
        algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre
        uma mensagem informando o saldo médio e o valor do crédito.

        Saldo médio Percentual:

        de 0 a 200 nenhum crédito
        de 201 a 400 20% do valor do saldo médio
        de 401 a 600 30% do valor do saldo médio
        acima de 601 40% do valor do saldo médio
        */
        System.out.println("Digite o seu saldo médio: ");
        double saldoMedio = sc.nextDouble();
        double credito;

        if(saldoMedio >= 0 && saldoMedio <= 200){
            credito = 0.0;
            System.out.printf("Saldo médio: R$%.2f - Valor do crédito: R$%.2f%n", saldoMedio, credito);
        } else if (saldoMedio >= 201 && saldoMedio <= 400){
            credito = 0.20 * saldoMedio;
            System.out.printf("Saldo médio: R$%.2f - Valor do crédito: R$%.2f%n", saldoMedio, credito);
        } else if (saldoMedio >= 401 && saldoMedio <= 600){
            credito = 0.30 * saldoMedio;
            System.out.printf("Saldo médio: R$%.2f - Valor do crédito: R$%.2f%n", saldoMedio, credito);
        } else if (saldoMedio >= 601){
            credito = 0.40 * saldoMedio;
            System.out.printf("Saldo médio: R$%.2f - Valor do crédito: R$%.2f%n", saldoMedio, credito);
        } else {
            System.out.println("ERRO");
        }

        /*17
        O cardápio de uma lanchonete é o seguinte:
        Especificação Preço unitário
        100 Cachorro quente 1,10
        101 Bauru simples 1,30
        102 Bauru c/ovo 1,50
        103 Hamburger 1,15
        104 Cheeseburger 1,60
        105 Refrigerante 1,00
        Escrever um algoritmo que leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche.
        Considere que a cada execução somente será calculado um item.
        */
        System.out.println("Digite o código do produto: ");
        int codeProduto = sc.nextInt();
        System.out.println("Digite a quantidade de produto: ");
        int qtdProduto = sc.nextInt();

        double valorTot;

        switch (codeProduto) {
            case 100 -> {
                valorTot = 1.10 * qtdProduto;
                System.out.printf("Custo total: R$%.2f%n", valorTot);
            }
            case 101 -> {
                valorTot = 1.30 * qtdProduto;
                System.out.printf("Custo total: R$%.2f%n", valorTot);
            }
            case 102 -> {
                valorTot = 1.50 * qtdProduto;
                System.out.printf("Custo total: R$%.2f%n", valorTot);
            }
            case 103 -> {
                valorTot = 1.15 * qtdProduto;
                System.out.printf("Custo total: R$%.2f%n", valorTot);
            }
            case 104 -> {
                valorTot = 1.60 * qtdProduto;
                System.out.printf("Custo total: R$%.2f%n", valorTot);
            }
            case 105 -> {
                valorTot = 1.00 * qtdProduto;
                System.out.printf("Custo total: R$%.2f%n", valorTot);
            }
            default -> System.out.println("Erro");
        }

        /*18
        Escreva um algoritmo para determinar se um dado número N
        (recebido através do teclado) é POSITIVO, NEGATIVO ou NULO.
        */
        System.out.println("Digite um número: ");
        int numberOne = sc.nextInt();

        if (numberOne == 0){
            System.out.println("NULO");
        } else if (numberOne > 0){
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        /*19
        Escreva um algoritmo que leia um número e imprima a raiz quadrada
        do número caso ele seja positivo ou igual a zero e o quadrado do número caso ele seja
        negativo.
        */
        System.out.println("Digite um numero: ");
        int numberTwo = sc.nextInt();

        if (numberTwo >= 0){
            System.out.println(Math.sqrt(numberTwo));
        } else {
            System.out.println(Math.pow(numberTwo, numberTwo));
        }

        /*20
        A prefeitura de Contagem abriu uma linha de crédito para os funcionários estatutários.
        O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um
        algoritmo que permita entrar com o salário bruto e o valor da prestação, e informar se
        o empréstimo pode ou não ser concedido.
        */
        System.out.println("Digite o seu salario bruto: ");
        double salary = sc.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        double valorPrest = sc.nextDouble();

        double emprestimo = salary * 0.30;

        if (valorPrest > emprestimo){
            System.out.println("O emprestimo não poderá ser consedido");
        }else {
            System.out.println("O emprestimo poderá ser consedido");
        }

        /*21
        Escreva um algoritmo que dada a idade de uma pessoa, determine
        sua classificação segundo a seguinte tabela:
            - maior de idade;
            - menor de idade;
            - pessoa idosa (idade superior ou igual a 65 anos).
        */
        System.out.println("Digite a sua idade: ");
        int age = sc.nextInt();

        if (age < 18){
            System.out.println("Menor de idade");
        } else if (age < 65){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Pessoa idosa");
        }

        /*22
        Crie um algoritmo que leia a idade de uma pessoa e informe a sua
        classe eleitoral:
            - não eleitor (abaixo de 16 anos);
            - eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
            - eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).
        */
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16){
            System.out.println("Não eleitor");
        } else if (idade >= 18 && idade < 72){
            System.out.println("Eleitor obrigatorio");
        }else {
            System.out.println("Eleitor facultativo");
        }

        /*23
        Criar um algoritmo que leia um número inteiro entre 1 e 12 e
        escrever o mês correspondente. Caso o usuário digite um número fora desse intervalo,
        deverá aparecer uma mensagem informando que não existe mês com este número.
        */
        System.out.println("Digite um número entre 1 e 12: ");
        int numMes = sc.nextInt();

        switch (numMes) {
            case 1 -> System.out.println("JANEIRO");
            case 2 -> System.out.println("FEVEREIRO");
            case 3 -> System.out.println("MARÇO");
            case 4 -> System.out.println("ABRIL");
            case 5 -> System.out.println("MAIO");
            case 6 -> System.out.println("JUNHO");
            case 7 -> System.out.println("JULHO");
            case 8 -> System.out.println("AGOSTO");
            case 9 -> System.out.println("SETEMBRO");
            case 10 -> System.out.println("OUTUBRO");
            case 11 -> System.out.println("NOVEMBRO");
            case 12 -> System.out.println("DEZEMBRO");
            default -> System.out.println("Não existe mês com este número");
        }

        sc.close();
    }
}