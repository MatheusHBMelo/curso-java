package exercicios_java;

import exercicios_java.classes.*;

import java.util.Locale;
import java.util.Scanner;

public class ListaExercicios05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("-------------------------");
        System.out.println(" LISTA DE 54 EXERCICIOS ");
        System.out.println("-------------------------\n");

        /* Exercicio 01
        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em:

            Kelvin (K)
            Réaumur (Re)
            Rankine (Ra)
            Fahrenheit (F)

        Seguindo as fórmulas:
            F = C * 1.8 + 32;
            K = C + 273.15;
            Re = C * 0.8;
            Ra = C * 1.8 + 32 + 459.67
         */
        System.out.println(" ");
        System.out.print("Digite a temperatura em cº: ");
        double C = sc.nextDouble();
        sc.nextLine();

        double f, k, re, ra;
        f = C * 1.8 + 32;
        k = C + 273.15;
        re = C * 0.8;
        ra = C * 1.8 + 32 + 459.67;

        System.out.println("Temperatura em Kelvin: " + String.format("%.2fK", k));
        System.out.println("Temperatura em Reaumur: " + String.format("%.2fRE", re));
        System.out.println("Temperatura em Rankine: " + String.format("%.2fRA", ra));
        System.out.println("Temperatura em Fahrenheit: " + String.format("%.2fF", f));

        /* Exercicio 02
        Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
        Fazer um algoritmo que calcule e escreva:

            A. a maior e a menor altura do grupo;
            B. média de altura dos homens;
            C. o número de mulheres.
         */
        System.out.println(" ");
        System.out.println(" ");
        double aMaior = 0.0, aMenor = 0.0, sumH = 0.0, avgH;
        int qtdMulher = 0, qtdHomem = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o sexo da pessoa (m/f): ");
            char sexo = sc.next().charAt(0);
            System.out.print("Digite a altura da pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            if (aMaior == 0.0 & aMenor == 0.0){
                aMaior = altura;
                aMenor = altura;
            }
            if (altura > aMaior){
                aMaior = altura;
            }
            if (altura < aMenor){
                aMenor = altura;
            }
            if (sexo == 'm') {
                sumH += altura;
                qtdHomem++;
            }
            if (sexo == 'f'){
                qtdMulher++;
            }
        }
        avgH = sumH / qtdHomem;
        System.out.println("Maior altura: " + String.format("%.2fm", aMaior));
        System.out.println("Menor altura: " + String.format("%.2fm", aMenor));
        System.out.println("Média altura H: " + String.format("%.2fm", avgH));
        System.out.println("Quantidade de mulheres: " + String.format("%d", qtdMulher));

        /* Exercicio 03
        Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário:

            A grade de funcionários
            Os salários

        Retornando a média salarial.
         */
        System.out.println(" ");
        System.out.print("Digite a quantidade de funcionarios: ");
        int qtdFuncionarios = sc.nextInt();

        double sum = 0, avg;

        for (int i = 1; i <= qtdFuncionarios; i++) {
            System.out.print("Digite o salario do funcionario " + i + ": ");
            double valor = sc.nextDouble();
            sc.nextLine();
            sum += valor;
        }
        avg = sum / qtdFuncionarios;

        System.out.println("Média de salários: " + String.format("R$%.2f", avg));

        /* Exercicio 04
        Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede)
        precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões:

            ha (altura do azulejo)
            la (largura do azulejo).

        Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos
        com as medidas dadas são necessários para cobrir a parede dada.
         */
        System.out.println(" ");
        System.out.print("Digite a altura da parede (hp): ");
        double hp = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a largura da parede (lp): ");
        double lp = sc.nextDouble();
        sc.nextLine();
        double areaParede = hp * lp;

        System.out.print("Digite a altura do azulejo (ha): ");
        double ha = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a largura do azulejo (la): ");
        double la = sc.nextDouble();
        sc.nextLine();
        double areaAzulejo = ha * la;

        double qtdAzulejos = areaParede / areaAzulejo;
        System.out.println("Azulejos necessários: " + String.format("%.2f", qtdAzulejos));

        /* Exercicio 05
        Calcule e apresente o valor do volume de uma lata de óleo, utilizando a fórmula:

            V = 3.14159 * R * R * A

        Em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
         */
        System.out.println(" ");
        System.out.print("Calculadora de volume - Digite o raio da lata: ");
        double raioLata = sc.nextDouble();
        sc.nextLine();
        System.out.print("Calculadora de volume - Digite a altura da lata: ");
        double alturaLata = sc.nextDouble();
        sc.nextLine();
        double volumeLata = 3.14 * raioLata * raioLata * alturaLata;

        System.out.println("Volume da lata: " + String.format("%.2f", volumeLata));

        /* Exercicio 06
        Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas
        a uma altura de h metros em t segundos.

        Considere cavalos:

            (m * h / t) / 745,6999
         */
        System.out.println(" ");
        System.out.print("Digite o valor da massa: ");
        double massaKG = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a altura em metros: ");
        double alturaMetros = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o tempo em segundos: ");
        double tempoSegundos = sc.nextDouble();
        sc.nextLine();

        double cavalosPotencia = (massaKG * alturaMetros / tempoSegundos) / 745.6999;
        System.out.println("Quantidade de cavalos: " + String.format("%.2f", cavalosPotencia));

        /* Exercicio 07
        Desenvolver programa que peca ao usuario para cadastrar uma senha; na sequencia, deve pedir ao usuario que digite duas variaveis reais,
        e ira calcular a divisão da primeira pela segunda. O programa ira pedir ao usuario que digite sua senha:
        Se estiver correta ela mostra o resultado da divisao. Se não dá mensagem de erro e encerra o aplicativo.
         */
        System.out.println(" ");
        System.out.print("Digite a sua senha: ");
        String senha1 = sc.next();
        System.out.print("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o segundo numero: ");
        int numero2 = sc.nextInt();
        sc.nextLine();

        String senha2;
        do {
            System.out.print("Digite a senha para saber o resultado: ");
            senha2 = sc.next();
        } while (!(senha1.equals(senha2)));
        System.out.println("Resultado divisão: " + (numero1 / numero2));

        /* Exercicio 08
        Implementar programa que realize todas das 4 operações (+), (-), (/) e (*) de acordo com a escolha do usuário, entre duas variáveis.
         */
        System.out.println(" ");
        System.out.print("Calculadora - Qual operação deseja fazer (+, -, * ou /): ");
        String operacao = sc.next();

        switch (operacao) {
            case "+" -> {
                System.out.println("Digite o primeiro numero: ");
                int primeiroNumero = sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                int segundoNumero = sc.nextInt();

                int soma = primeiroNumero + segundoNumero;

                System.out.println("Soma: " + soma);
            }
            case "-" -> {
                System.out.println("Digite o primeiro numero: ");
                int primeiroNumero = sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                int segundoNumero = sc.nextInt();

                int subtracao = primeiroNumero - segundoNumero;

                System.out.println("Subtração: " + subtracao);
            }
            case "*" -> {
                System.out.println("Digite o primeiro numero: ");
                int primeiroNumero = sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                int segundoNumero = sc.nextInt();

                int multiplicacao = primeiroNumero * segundoNumero;

                System.out.println("Multiplicação: " + multiplicacao);
            }
            default -> {
                System.out.println("Digite o primeiro numero: ");
                int primeiroNumero = sc.nextInt();
                System.out.println("Digite o segundo numero: ");
                int segundoNumero = sc.nextInt();

                int divisao = primeiroNumero / segundoNumero;

                System.out.println("Divisão: " + divisao);
            }
        }

        /* Exercicio 09
        Crie uma classe que modele uma bola, toda bola contém:

        Circunferência
        Cor
        Marca
        Velocidade

        Após a modelagem, instancie objetos diferentes no método main para testes.
         */
        System.out.println(" ");
        Bola bola1 = new Bola(1.50, "verde", "Adidas", 3.0);
        System.out.println(bola1.getCircunferencia());
        System.out.println(bola1.getVelocidade());
        System.out.println(bola1.getCor());
        System.out.println(bola1.getMarca());
        System.out.println(bola1);

        /* Exercicio 10
        Crie uma classe para construir uma conta corrente. A classe deve possuir os seguintes atributos:

            Número da conta
            Nome do correntista
            Saldo

        No construtor, o saldo é opcional, com valor default (padrão) zero e os demais atributos são obrigatórios.
         */
        System.out.println(" ");
        ContaCorrente conta = new ContaCorrente(54631, "Matheus Henrique");
        System.out.println(conta);

        /* Exercicio 11
        Crie uma classe que represente um carro, que tenha como características:

            Nome
            Peso
            Fabricante
            Cor
            Valor do carro

        Crie também os métodos:

            darDesconto() que servirá para diminuir o preço do carro
            pintar(), que será responsável por mudar a cor do carro

        Crie um carro, utilize os métodos criados e mostre na tela preço e cor do carro antes e depois dos métodos.
         */
        System.out.println(" ");
        Carro carro = new Carro("RB18", 245.2, "Red Bull Racing Honda", "Preto fosco", 1000000.00);
        System.out.println("Valor do veiculo: " + String.format("%.2f", carro.getValorCarro()));
        System.out.println("Cor do veiculo: " + String.format("%s", carro.getCor()));

        carro.darDesconto(500000.00);
        carro.pintar("Azul escuro");

        /* Exercicio 12
        Crie uma classe Elevador para armazenar as informações de um elevador dentro de um prédio.

        A classe deve armazenar:

            Andar atual (térreo = 0)
            Total de andares no prédio (desconsiderando o térreo)
            Capacidade do elevador
            Quantas pessoas estão presentes nele

        A classe deve também disponibilizar os seguintes métodos:

            Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);

            Sai : para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);

            Sobe : para subir um andar (não deve subir se já estiver no último andar); - Desce : para descer um andar (não deve descer se já estiver no térreo);
         */
        System.out.println(" ");
        Elevador ev = new Elevador();
        ev.entra(5);
        System.out.println(ev);
        ev.entra(6);
        System.out.println(ev);
        ev.sobe(3);
        System.out.println(ev);
        ev.sobe(1);
        System.out.println(ev);
        ev.sobe(2);
        System.out.println(ev);
        ev.sai(7);
        System.out.println(ev);
        ev.desce(2);
        System.out.println(ev);
        ev.sai(4);
        System.out.println(ev);
        ev.desce(4);
        System.out.println(ev);

        /*  Exercicio 13
        Crie uma classe que represente um cartão de crédito, que deve ter como atributos:

            Limite
            Saldo da fatura
            Nome do cliente

        Crie também os métodos:

            aumentaLimite()
            diminuiLimite()
            realizaCompra() que não deve permitir uma compra caso o limite tenha sido atingido
            imprimeFatura() que imprime na tela o valor da fatura.
         */
        System.out.println(" ");
        CartaoDeCredito hiper = new CartaoDeCredito(1000.00, "Matheus Henrique");
        System.out.println(hiper);

        hiper.aumentaLimite(500.00);
        System.out.println(hiper);
        hiper.diminuiLimite(300.00);
        System.out.println(hiper);
        hiper.realizaCompra(1200.00);
        System.out.println(hiper);
        hiper.realizaCompra(100.00);
        System.out.println(hiper);
        System.out.println(hiper.imprimeFatura());

        /* Exercicio 14
        Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa
         */
        System.out.println(" ");
        int[] lista = new int[]{0,1,2,3,4,5,6,7,8,9};

        // O array tem 10 posições, (i = 10) dará erro, por tanto faz-se (i = lista.lenght - 1) sendo (i = 9) funcionará
        for (int i = lista.length - 1; i >= 0; i--){
            System.out.print(lista[i] + " ");
        }

        /* Exercicio 15
        João comprou um microcomputador para controlar o rendimento diário de seu trabalho.
        Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca
        do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente.

        João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.

        Gravar na variável:

            Excesso a quantidade de quilos
            Limite
            Valor da multa

        Imprima os dados do programa com as mensagens adequadas.
         */
        System.out.println(" ");
        final double pesoLimite = 50.0;
        System.out.print("Digite o valor do peso: ");
        double pesoPeixe = sc.nextDouble();

        double multa;
        if (pesoPeixe > pesoLimite){
            multa = (pesoPeixe - pesoLimite) * 4;
            System.out.printf("Valor da multa: R$%.2f", multa);
        }else {
            System.out.println("Dentro do limite!");
        }

        /* Exercicio 16
        Crie um programa que escreva "Olá mundo" na tela
         */
        System.out.println(" ");
        System.out.println("Olá mundo!");

        /* Exercicio 17
        Crie um script que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas de acordo com o valor digitado
         */
        System.out.println(" ");
        System.out.print("Digite o seu nome: ");
        String nomePrograma = sc.nextLine();
        System.out.println("Seja bem vindo " + nomePrograma + " !!!");

        /* Exercicio 18
        Crie um script que leia dois números e tente mostrar a soma entre eles
         */
        System.out.println(" ");
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Soma = " + (n1+n2));

        /* Exercicio 19
        Faça um programa que leia algo pelo teclado e mostre na tela o seu tipo primitivo e todas as informações possíveis sobre ele
         */
        System.out.println(" ");
        System.out.print("Digite algo: ");
        String algo = sc.nextLine();

        System.out.println("Tipo da classe: " + algo.getClass());
        System.out.println("Tamanho: " + algo.length());
        System.out.println("Está vazio: " + algo.isEmpty());
        System.out.println("Retira espaços: " + algo.trim());
        System.out.println("Tudo maiusculo: " + algo.toUpperCase());

        /* Exercicio 20
        Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e seu antecessor
         */
        System.out.println(" ");
        System.out.print("Digite um numero: ");
        int umNumero = sc.nextInt();

        System.out.printf("Antecessor: %d| Numero: %d| Sucessor: %d%n", (umNumero - 1), umNumero, (umNumero + 1));

        /* Exercicio 21
        Crie um algoritmo que leia um número e mostre o seu dobro, o seu triplo e sua raiz quadrada
         */
        System.out.println(" ");
        System.out.print("Digite um numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.printf("Dobro = %d | Triplo = %d | Raiz Quadrada = %.2f", (number * 2), (number * 3), Math.sqrt(number));

        /* Exercicio 22
        Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média
         */
        System.out.println(" ");
        System.out.print("Digite a primeira nota: ");
        int nota1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a segunda nota: ");
        int nota2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Média = " + ((double)(nota1 + nota2) / 2));

        /* Exercicio 23
        Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros
         */
        System.out.println(" ");
        System.out.print("Digite um valor em metros: ");
        int metros = sc.nextInt();

        int centimetro  = metros * 100;
        int milimetro  = metros * 1000;

        System.out.println("Centimetros: " + centimetro);
        System.out.println("Milimetros: " + milimetro);

        /* Exercicio 24
        Faça um programa que leia um número inteiro qualquer e mostre na tela a sua tabuada
         */
        System.out.println(" ");
        System.out.print("Digite um número inteiro entre 1-10: ");
        int numeroInteiro = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= 10; i++){
            System.out.println(numeroInteiro + " * " + i + " = " + (i * numeroInteiro));
        }

        /* Exercicio 25
        Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar
         */
        System.out.print("Digite quanto você tem na carteira: ");
        double dinheiroCarteira = sc.nextDouble();
        sc.nextLine();

        double dollar = dinheiroCarteira / 5.27;

        System.out.println("Você pode comprar: " + String.format("US$%.2f%n", dollar));

        /* Exercicio 26
        Faça um programa que leia a largura e a altura de uma parede em metros,
        calcule a sua área e a quantidade de tinta necessária para pintá-la, sabendo que cada litro de tinta pinta uma área de 2m²
         */
        System.out.print("Digite o valor da largura da parede em metros: ");
        double larguraParede = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o valor da altura da parede em metros: ");
        double alturaParede = sc.nextDouble();
        sc.nextLine();

        double areaParede2 = larguraParede * alturaParede;
        int qtdTintaParede = (int) (areaParede2 / 2);

        System.out.println("Área da parede: " + String.format("%.2fm%n", areaParede2));
        System.out.println("Litros de tinta: " + qtdTintaParede + "L");

        /* Exercicio 27
        Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 5% de desconto
         */
        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();
        sc.nextLine();

        double valorComDesconto = valorProduto - ( valorProduto * 0.05);

        System.out.println("Valor com desconto: " + String.format("R$%.2f%n", valorComDesconto));

        /* Exercicio 28
        Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento
         */
        System.out.print("Digite o valor do produto: ");
        double salarioFuncionario = sc.nextDouble();
        sc.nextLine();

        double salarioComAumento = salarioFuncionario + ( salarioFuncionario * 0.15);

        System.out.println("Salário com aumento: " + String.format("R$%.2f%n", salarioComAumento));

        /* Exercicio 29
        Conversor de temperaturas: escreva um programa que converta uma temperatura digitada em ºC para ºF
         */
        System.out.print("Digite a temperatura em celcius: ");
        double temperaturaCelcius = sc.nextDouble();
        sc.nextLine();

        double fah = temperaturaCelcius * 1.8 + 32;

        System.out.println("Temperatura em Fahrenheit: " + String.format("%.1fº%n", fah));

        /* Exercicio 30
        Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado e a quantidade de dias
        pelos quais ele foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$ 60 por dia e R$ 0.15 por km rodado
         */
        System.out.print("Digite o valor em KM percorridos por um carro: ");
        double kmPercorridos = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a quantidade de dias do aluguel: ");
        double qtdDiasAluguel = sc.nextDouble();
        sc.nextLine();

        double valorDoAluguel = (qtdDiasAluguel * 60) + (kmPercorridos * 0.15);

        System.out.println("Preço total do aluguel: " + String.format("R$%.2f%n", valorDoAluguel));

        /* Exercicio 31
        Crie um programa que leia um número real qualquer pelo teclado e mostre na tela a sua porção inteira
         */
        double valor;
        int result;

        System.out.print("Digite um numero real: ");
        valor = sc.nextDouble();
        sc.nextLine();

        // separando a primeira parte inteira:
        result = (int)valor;
        System.out.println(result);
        // separando a segunda parte fracionária:
        // valor original é subtraído pela parte inteiro e multiplicar por 100 para obter as duas primeiras casas decimais
        result = (int)Math.round((valor - (int)valor) * 100);
        System.out.println(result);

        /* Exercicio 32
        Faça um programa que leia o comprimento do cateto oposto (co) e do cateto adjacente (ca) de um triângulo retângulo,
        calcule e mostre o comprimento da hipotenusa
         */
        int hipotenusa;
        System.out.print("Digite o valor do cateto oposto: ");
        int catetoOposto = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o valor do cateto adjacente: ");
        int catetoAdjacente = sc.nextInt();
        sc.nextLine();

        int catetos_quadrado = (int) (Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
        hipotenusa = (int) Math.sqrt(catetos_quadrado);

        System.out.println("Valor do hipotenusa: " + hipotenusa);

        /* Exercicio 33
        Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo
         */
        double seno, cosseno, tangente;
        System.out.print("Digite o valor do Angulo: ");
        double angulo = sc.nextInt();
        sc.nextLine();

        // Convertendo para radianos antes de gerar o valor das funções
        seno = Math.sin(Math.toRadians(angulo));
        cosseno = Math.cos(Math.toRadians(angulo));
        tangente = Math.tan(Math.toRadians(angulo));

        System.out.printf("O angulo de %.1f graus possui seno = %.2f - Cosseno = %.2f e Tangente = %.2f%n", angulo, seno, cosseno, tangente);

        /* Exercicio 34
        Um professor quer sortear um dos seus quatro alunos para apagar o quadro. Faça um programa que ajude ele,
        lendo o nome deles e escrevendo o do escolhido
         */
        String[] alunosSorteio = new String[]{"Davi Jose", "Matheus Henrique", "Vera Lucia", "Silvania Barbosa"};
        System.out.println("Aluno sorteado: " + alunosSorteio[(int) (Math.random() * 4)]);

        /* Exercicio 35
        Crie um programa que leia o nome completo de uma pessoa e mostre: em letras maiúsculas, minúsculas,
        a quantidade de letras sem espaço, e quantas letras tem o primeiro nome
         */
        System.out.print("Digite o seu nome e sobrenome: ");
        String nomeSobrenome = sc.nextLine();
        // Matheus Henrique Barbosa de Melo
        // MATHEUS HENRIQUE BARBOSA DE MELO
        // matheus henrique barbosa de melo
        // 28
        // 7
        System.out.println("Maiusculo: " + nomeSobrenome.toUpperCase());
        System.out.println("Minusculo: " + nomeSobrenome.toLowerCase());
        System.out.println("Tamanho sem espaços: " + nomeSobrenome.replaceAll("\\s","").length());
        System.out.println("Letras primeiro nome: " + nomeSobrenome.split(" ")[0].length());

        /* Exercicio 36
        Faça um programa que leia um número de 0 a 9999 e mostre na tela cada um dos dígitos separados
         */
        int numCalc;
        do {
            System.out.print("Digite o valor no numero: ");
            numCalc = sc.nextInt();
            sc.nextLine();
        } while (!(numCalc >= 0 && numCalc <= 9999));

        String numCalcS = Integer.toString(numCalc);
        String[] numCalcSplit = numCalcS.split("", 4);

        System.out.println("O número digitado foi: " + numCalcS);
        System.out.println("Sua unidade é: " + numCalcSplit[3]);
        System.out.println("Sua dezena é:" + numCalcSplit[2] + "0");
        System.out.println("Sua centena é:" + numCalcSplit[1] + "00");
        System.out.println("seu milhar é:" + numCalcSplit[0] + "000");

        /* Exercicio 37
        Crie um programa que leia o nome de uma cidade e diga se ela começa ou não com a palavra "Santo"
         */
        System.out.print("Digite o nome da cidade: ");
        String nomeCidade = sc.nextLine();

        if (nomeCidade.toUpperCase().startsWith("SANTO")){
            System.out.println("A cidade possui 'SANTO' no nome");
        }else {
            System.out.println("A cidade NÃO possui 'SANTO' no nome");
        }

        /* Exercicio 38
        Crie um programa que leia o nome de uma pessoa e diga se ela tem "Silva" no nome
         */
        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        // Transformando a String do nome em um array de Strings
        String[] nomeComSplit = nomeCompleto.split(" ", 6);

        // ForEach para imprimir os nomes
        for(String s : nomeComSplit){
            System.out.println(s);
        }

        // ForEach para descobrir se possui SILVA no nome
        for (String s : nomeComSplit) {
            if (s.equalsIgnoreCase("Silva")) {
                System.out.println("Esse nome possui 'SILVA'");
            }
        }

        /* Exercicio 39
        Faça um programa que leia uma frase qualquer e mostre: quantas vezes aparece a letra "a",
        em que posição ela aparece a primeira vez em que posição ela aparece a última vez
         */
        String frase = "Ola, eu me chamo Matheus Henrique e desenvolvo em Java.";
        char letraBuscada = 'a';
        int count = 0;

        // Coloca a string em minusculo, tira espaços do inicio e fim, tira espaços de dentro
        frase = frase.toLowerCase().trim().replaceAll("\\s", "");

        // Verifica se a letra por indice == A
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letraBuscada){
                count++;
            }
        }
        System.out.println("Quantidade de vezes que a letra 'A' se repete na frase: " + count);

        /* Exercicio 40
        Faça um programa que leia o nome completo de uma pessoa, mostrando em seguida o primeiro e o último nome separadamente
         */
        System.out.println("Digite o seu nome completo: ");
        String nameComplete = sc.nextLine();

        String[] nameCompleteSplit = nameComplete.split(" ", 5);

        System.out.println("Primeiro nome: " + nameCompleteSplit[0]);
        System.out.println("Ultimo nome: "+ nameCompleteSplit[5]);

        /* Exercicio 41
        Faça um programa que leia três números e mostre qual é o maior e qual é o menor
         */
        int maior;
        int menor;
        System.out.print("Digite o primeiro número: ");
        int nume1 = sc.nextInt();
        maior = nume1;
        menor = nume1;
        System.out.print("Digite o segundo número: ");
        int nume2 = sc.nextInt();
        if (nume2 > maior) {
            maior = nume2;
        }else if (nume2 < menor){
            menor = nume2;
        }
        System.out.print("Digite o terceiro número: ");
        int nume3 = sc.nextInt();
        if (nume3 > maior) {
            maior = nume3;
        }else if (nume3 < menor){
            menor = nume3;
        }
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);

        /* Exercicio 42
        Faça um programa que leia um número qualquer e mostre o seu fatorial
        exemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120
         */
        int numero = 5;
        int fatorial = 1;
        //laço de repetição
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial de " + numero + " é igual a " + fatorial);

        /* Exercicio 43
        Escreva um programa que imprima a sequência de Fibonacci 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89(...)
         */
        int num1 = 1, num2 = 1;

        System.out.println(num2);
        System.out.println(num1);

        for(int i = 0; i < 10; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }

        /* Exercicio 44
        Faça um Programa que pergunte em que turno você estuda. Peça
        para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
        mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
        Inválido!", conforme o caso
         */
        System.out.print("Qual é o turno que você estuda (M-T-N): ");
        char turno = sc.next().charAt(0);

        switch (turno) {
            case 'M' -> System.out.println("Bom dia!");
            case 'V' -> System.out.println("Boa tarde!");
            case 'N' -> System.out.println("Boa noite!");
            default -> System.out.println("Valor inválido!");
        }

        /* Exercicio 45
        Faça um programa que calcule as raízes de uma equação do segundo
        grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
        b e c e fazer as consistências, informando ao usuário nas seguintes
        situações:
        a. Se o usuário informar o valor de A igual a zero, a equação não é
        do segundo grau e o programa não deve fazer pedir os demais
        valores, sendo encerrado;
        b. Se o delta calculado for negativo, a equação não possui raizes
        reais. Informe ao usuário e encerre o programa;
        c. Se o delta calculado for igual a zero a equação possui apenas
        uma raiz real; informe-a ao usuário;
        d. Se o delta for positivo, a equação possui duas raiz reais;
        informe-as ao usuário;
         */
        // Testes
        // Delta == 0 (1, 6, 9)
        // Delta < 0 (10, 6, 9)
        // Delta > 0 (2, 10, 9)
        System.out.print("Digite o valor de A: ");
        int valorA = sc.nextInt();
        sc.nextLine();

        if (valorA == 0){
            System.out.println("A equação não é do segundo grau!");
            return;
        }

        System.out.print("Digite o valor de B: ");
        int valorB = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o valor de C: ");
        int valorC = sc.nextInt();
        sc.nextLine();

        int delta = valorB * valorB - (4 * valorA * valorC);

        if (delta < 0){
            System.out.println("A equação não possui raizes reais!");
            return;
        }

        int raizEquacaoPositiva;
        int raizEquacaoNegativa;

        if (delta == 0){
            System.out.println("A equação possui apenas uma raiz real");
            raizEquacaoPositiva = (int) ((-valorB + Math.sqrt(delta)) / 2 * valorA);
            System.out.println("Valor da raiz: " + raizEquacaoPositiva);
            return;
        }

        raizEquacaoPositiva = ((-valorB + (int) Math.sqrt(delta)) / 2 * valorA);
        raizEquacaoNegativa = ((-(valorB) - (int) Math.sqrt(delta)) / 2 * valorA);
        System.out.println("Valor da raiz positiva: " + raizEquacaoPositiva);
        System.out.println("Valor da raiz negativa: " + raizEquacaoNegativa);

        /* Exercicio 46
        Faça um programa que faça 5 perguntas para uma pessoa sobre um
        crime. As perguntas são:
        . "Telefonou para a vítima?"
        a. "Esteve no local do crime?"
        b. "Mora perto da vítima?"
        c. "Devia para a vítima?"
        d. "Já trabalhou com a vítima?" O programa deve no final emitir
        uma classificação sobre a participação da pessoa no crime. Se
        a pessoa responder positivamente a 2 questões ela deve ser
        classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
        como "Assassino". Caso contrário, ele será classificado como
        "Inocente".
         */
        String vitima;
        int contadorCrime = 0;
        System.out.print("Telefonou para a vítima: ");
        String resposta1 = sc.next();
        if (resposta1.equalsIgnoreCase("Sim")){
            contadorCrime++;
        }
        System.out.print("Esteve no local do crime: ");
        String resposta2 = sc.next();
        if (resposta2.equalsIgnoreCase("Sim")){
            contadorCrime++;
        }
        System.out.print("Mora perto da vítima: ");
        String resposta3 = sc.next();
        if (resposta3.equalsIgnoreCase("Sim")){
            contadorCrime++;
        }
        System.out.print("Devia para a vítima: ");
        String resposta4 = sc.next();
        if (resposta4.equalsIgnoreCase("Sim")){
            contadorCrime++;
        }
        System.out.print("Já trabalhou com a vítima: ");
        String resposta5 = sc.next();
        if (resposta5.equalsIgnoreCase("Sim")){
            contadorCrime++;
        }

        if (contadorCrime == 5) {
            vitima = "Assassino";
        }else if (contadorCrime >= 3){
            vitima = "Cumplice";
        }else if (contadorCrime >= 1){
            vitima = "Suspeita";
        }else {
            vitima = "Inocente";
        }

        System.out.println("Você é " + vitima + "!");

        /* Exercicio 47
        Escreva	a	classe	ConversaoDeUnidadesDeVolume	com	métodos	estáticos
        para	conversão	das	unidades	de	volume	segundo	a	lista	abaixo.
        • 1	litro	=	1000	centímetros	cúbicos
        • 1	metro	cúbico	=	1000	litros
        • 1	metro	cúbico	=	35.32	pés	cúbicos
        • 1	galão	americano =	231	polegadas	cúbicas
        • 1	galão	americano	=	3.785	litros
         */
        System.out.println(ConversaoDeUnidadesDeVolume.litroParaCentimetroCubico(2));
        System.out.println(ConversaoDeUnidadesDeVolume.metroCubicoParaLitro(3));
        System.out.println(ConversaoDeUnidadesDeVolume.metroCubicoParaPesCubicos(2));
        System.out.println(ConversaoDeUnidadesDeVolume.galaoAmericanoParaPolegadasCubicas(2));
        System.out.println(ConversaoDeUnidadesDeVolume.galaoAmericanoParaLitro(10));

        /* Exercicio 48
        Escreva	a	classe	ConversaoDeUnidadesDeTempo	com	métodos	estáticos
        para	conversão	aproximada	das	unidades	de	velocidade	segundo	a	lista
        abaixo.
        • 1	minuto	=	60	segundos
        • 1	hora	=	60	minutos
        • 1	dia	=	24	horas
        • 1	semana	=	7	dias
        • 1	mês	=	30	dias
        • 1	ano	=	365.25	dias
         */
        System.out.println(ConversaoDeUnidadesDeTempo.minutoParaSegundo(10));
        System.out.println(ConversaoDeUnidadesDeTempo.horaParaMinuto(10));
        System.out.println(ConversaoDeUnidadesDeTempo.diaParaHora(10));
        System.out.println(ConversaoDeUnidadesDeTempo.semanaParaDia(10));
        System.out.println(ConversaoDeUnidadesDeTempo.mesParaDia(10));
        System.out.println(ConversaoDeUnidadesDeTempo.anoParaDia(10));

        /* Exercicio 49
        Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá em 2022
         */
        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        sc.nextLine();

        int idadeFinal = 2022 - anoNascimento;
        System.out.println("Sua idade em 2022: " + idadeFinal);

        /* Exercicio 50
        Faça um programa que receba um nome completo na forma de uma String e
        mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
        menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
        Almeida Prado. Abreviatura: P. J. de A. P.
         */
        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto3 = sc.nextLine();

        // Trata a String colocando em minusculo e tirando espaços do inicio e fim
        nomeCompleto3 = nomeCompleto3.toLowerCase().trim();

        // transforma a String em um array dos nomes com 5 limites
        String[] nomeCompletoSplit = nomeCompleto3.split(" ", 5);

        for (String s : nomeCompletoSplit) {
            // Pega a primeira letra de cada nome, põe em maiusculo com um (.) e printa
            if (s.length() > 3) {
                System.out.print(s.toUpperCase().charAt(0) + ". ");
            }
            // Pega complementos como Do, Da, Dos, Das, De e printa
            if (s.length() <= 3) {
                System.out.print(s + " ");
            }
        }

        /* Exercicio 51
        Fazer um programa que receba uma string do usuário e mostre o conteúdo desta
        string de forma invertida.
         */
        System.out.print("Digite uma frase: ");
        String fraseNew = sc.nextLine();

        // Coloca a frase em minusculo, retira espaços do inicio e fim e do meio da frase.
        fraseNew = fraseNew.toLowerCase().trim().replaceAll("\\s", "");

        String[] fraseArray = fraseNew.split("", 7);

        for (int i = fraseArray.length - 1 ; i >= 0; i--) {
            System.out.print(fraseArray[i]);
        }

        sc.close();
    }
}
