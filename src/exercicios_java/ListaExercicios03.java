package exercicios_java;

import java.util.Random;
import java.util.Scanner;
import java.util.Locale;

public class ListaExercicios03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random ran = new Random();

        // LISTA DE EXERCICIOS COM WHILE

        /*01
        Crie um programa que imprima 11 vezes a frase " Hello World!"
        em uma estrutura de repetição while.
        */
        int vezes = 1;
        while (vezes <= 11) {
            System.out.println(vezes + " Hello world");
            vezes++;
        }

        /*02
        Escrever um programa para exibir os números de 1 até 50 na tela.
        */
        int inicio = 1;
        while (inicio <= 50) {
            System.out.println(inicio);
            inicio++;
        }

        /*03
        Crie um programa para ler 3 notas e mostrar a média delas.
        */
        int contagem = 1;
        double soma = 0;
        while (contagem <= 3) {
            System.out.println("Digite a nota");
            double nota = sc.nextDouble();
            soma = soma + nota;
            contagem++;
        }
        double media = soma / 3;
        System.out.printf("Média: %.2f%n", media);

        /*04
        Faça um programa que mostre a tabuada de um número N (N será lido do teclado).
        */
        System.out.println("Digite um número N: ");
        int N = sc.nextInt();

        int cont = 1;
        while (cont <= 10) {
            System.out.printf("%d X %d = %d%n", N, cont, N * cont);
            cont++;
        }

        /*05
        Faça um programa que peça ao usuário um número entre 12 e 20.
        Se a pessoa digitar um número diferente, mostrar a mensagem "entrada inválida"
        e solicitar o número novamente. Se digitar correto mostrar o número digitado.
        */
        boolean resultado = true;
        while (resultado) {
            System.out.println("Digite um número entre (12-20): ");
            int num = sc.nextInt();

            if (num >= 12 && num <= 20) {
                System.out.println(num);
                resultado = false;
            } else {
                System.out.println("Entrada invalida");
            }
        }

        /*06
        O Departamento Estadual de Meteorologia lhe contratou para desenvolver
        um programa que leia um conjunto indeterminado de temperaturas,
        e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
         */
        System.out.println("Digite quantas temperaturas deseja verificar: ");
        int qtdTemperaturas = sc.nextInt();
        sc.nextLine();

        int contagemTemp = 1;
        double maior = 0;
        double menor = 0;
        while (contagemTemp <= qtdTemperaturas){
            System.out.println("Digite a temperatura " + contagemTemp + ": ");
            double temperaturaIndice = sc.nextDouble();
            sc.nextLine();

            if (contagemTemp == 1){
                maior = temperaturaIndice;
                menor = temperaturaIndice;
            }

            if (temperaturaIndice > maior){
                maior = temperaturaIndice;
            }

            if (temperaturaIndice < menor){
                menor = temperaturaIndice;
            }

            contagemTemp++;
        }
        System.out.println("O maior: " + maior);
        System.out.println("O menor: " + menor);

        /*07
        Faça um programa que leia número reais maiores que zero. Quando for entrado o número zero, o
        programa deverá apresentar quantos números foram entrados e a média destes
         */
        int num02;
        int quantidade = 0;
        double media02 = 0.0;
        while (true) {
            System.out.println("Digite um numero: ");
            num02 = sc.nextInt();
            if (num02 == 0) {
                break;
            } else {
                quantidade++;
                media02 = media02 + num02;
            }
        }
        System.out.println("Quantidade = " + quantidade);
        System.out.println("Media = " + media02 / quantidade);

        /*08
        Faça um programa que receba uma senha formada de quatro números inteiros, verifique se a senha está
        correta e, caso não esteja, solicite novamente a senha. Se a senha entrada for a correta, deverá ser
        apresentada a mensagem “Senha Correta”, caso contrário, “Senha Incorreta”.
         */
        int password = 2107;
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();
        while (senha != password){
            System.out.println("Senha incorreta!");
            System.out.println("Digite a senha novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta!");

        /*09
        Faça um programa que simule a urna eletrônica.
        A tela a ser apresentada deverá ser da seguinte forma:
        As opcoes sao:

        1. Candidato Jair Rodrigues
        2. Candidato Carlos Luz
        3. Candidato Neves Rocha
        4. Nulo
        5. Branco

        Entre com o seu voto:
        O programa deverá ler os votos dos eleitores e, quando for entrado o número 6, apresentar as seguintes
        informações:

        a) O número de votos de cada candidato;
        b) A porcentagem de votos nulos;
        c) A porcentagem de votos brancos;
        d) O candidato vencedor.
         */
        int voto = 0;
        int votoJair = 0, votoLuis = 0, votoCiro = 0, votoBranco = 0, votoNulo = 0;
        while (voto != 6) {

            System.out.println("1 - Jair Bolsonaro");
            System.out.println("2 - Luis Inacio");
            System.out.println("3 - Ciro Gomes");
            System.out.println("4 - Branco");
            System.out.println("5 - Nulo");
            System.out.println("6 - Fim\n");

            for (int contador = 0; contador < 100; contador++) {
                voto = 1 + ran.nextInt(5);

                switch (voto) {
                    case 1 -> {
                        votoJair++;
                        System.out.println("Voto computado\n");
                    }
                    case 2 -> {
                        votoLuis++;
                        System.out.println("Voto computado\n");
                    }
                    case 3 -> {
                        votoCiro++;
                        System.out.println("Voto computado\n");
                    }
                    case 4 -> {
                        votoBranco++;
                        System.out.println("Voto computado\n");
                    }
                    case 5 -> {
                        votoNulo++;
                        System.out.println("Voto computado\n");
                    }
                    default -> System.out.println("Numero errado\n");
                }
            }
            voto = 6;
            System.out.println("Votação encerrada!\n");
        }

        int totalVotos = votoJair + votoBranco + votoLuis + votoNulo + votoCiro;
        double taxaBranco = (double) (votoBranco * 100) / totalVotos;
        double taxaNulo = (double) (votoNulo * 100) / totalVotos;
        double taxaJair1 = (double) (votoJair * 100) / totalVotos;
        double taxaLuis1 = (double) (votoLuis * 100) / totalVotos;
        double taxaCiro1 = (double) (votoCiro * 100) / totalVotos;
        int votosValidos = votoCiro + votoJair + votoLuis;
        double taxaJair = (double) (votoJair * 100) / votosValidos;
        double taxaLuis = (double) (votoLuis * 100) / votosValidos;
        double taxaCiro = (double) (votoCiro * 100) / votosValidos;

        System.out.printf("Total de votos: %d %n%n", totalVotos);
        System.out.printf("Candidato Jair: %d votos | Validos: %.2f%n", votoJair, taxaJair1);
        System.out.printf("Candidato Luis: %d votos | Validos: %.2f%n", votoLuis, taxaLuis1);
        System.out.printf("Candidato Ciro: %d votos | Validos: %.2f%n%n", votoCiro, taxaCiro1);
        System.out.printf("Votos em Branco: %d | Percentual: %.2f %n", votoBranco, taxaBranco);
        System.out.printf("Votos em Nulo: %d | Percentual: %.2f %n%n", votoNulo, taxaNulo);
        System.out.printf("Total de votos válidos: %d %n%n", votosValidos);
        System.out.printf("Candidato Jair (validos): %.2f %n", taxaJair);
        System.out.printf("Candidato Luis (validos): %.2f %n", taxaLuis);
        System.out.printf("Candidato Ciro (validos): %.2f %n%n", taxaCiro);

        if(taxaJair > taxaLuis && taxaJair > taxaCiro) {
            System.out.println("Candidato vencedor: Jair Bolsonaro!");
        } else if (taxaCiro > taxaLuis && taxaCiro > taxaJair) {
            System.out.println("Candidato vencedor: Ciro Gomes!");
        } else if (taxaLuis > taxaJair && taxaLuis > taxaCiro) {
            System.out.println("Candidato vencedor: Luis Inacio!");
        }

        /*10
        Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.
         */
        int numeroLista = sc.nextInt();
        int contadorLista = 0;
        while (contadorLista <= numeroLista){
            System.out.println(contadorLista);
            contadorLista++;
        }

        /*11
        Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser.
         */
        char resposta = 's';
        while (resposta == 's') {
            System.out.println("Numero 1: ");
            int numero1 = sc.nextInt();
            System.out.println("Numero 2: ");
            int numero2 = sc.nextInt();

            int somaNum =  numero1 + numero2;

            System.out.println("Soma: " + somaNum);

            System.out.println("Deseja continua o programa (s/n): ");
            resposta = sc.next().charAt(0);
        }

        /*12
        Escreva um programa que recebe um numero inteiro e mostra os números pares e ímpares (separados,
        em duas colunas), de 1 até esse inteiro.
         */
        System.out.println("Digite um número inteiro: ");
        int inteiro = sc.nextInt();
        sc.nextLine();

        int contagemInteiro = 1;

        while (contagemInteiro <= inteiro) {
            if (contagemInteiro % 2 == 0){
                System.out.println("Par: " + contagemInteiro);
            } else {
                System.out.println("Impar: " + contagemInteiro);
            }
            contagemInteiro++;
        }

        /*13
        Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
        Em seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os alunos da sala,
        um por vez. Por fim, o programa deve mostrar a média aritmética, da turma.
         */
        System.out.println("Existe quantos alunos na sua sala: ");
        int alunos = sc.nextInt();
        sc.nextLine();

        double notas, somas = 0.0, medias = 0.0;

        int contadorNotas = 1;
        while (contadorNotas <= alunos) {
            System.out.println("Digite a nota do aluno " + contadorNotas + ": ");
            notas = sc.nextDouble();
            sc.nextLine();

            somas = somas + notas;
            medias = somas / alunos;

            contadorNotas++;
        }
        System.out.println("Média aritmetica: " + medias);

        /*14
        Faça um programa que lê um valor que esteja entre 0 e 9, e imprima a tabuada.
         */
        System.out.println("Digite um numero entre 0 e 9: ");
        int tabuadaNumber = sc.nextInt();

        int contadorTabuada = 0;
        while (contadorTabuada <= 10) {
            System.out.printf("%d X %d = %d%n", tabuadaNumber, contadorTabuada, tabuadaNumber * contadorTabuada);
            contadorTabuada++;
        }

        /*15
        Crie um programa para converter escalas termometricas, use as formulas:
        Celcius para Kevin       = K = C + 273
        Celcius para Fahrennheit = F =  C x 1,8 + 32
        Kevin para celcius       = C = K - 273
        Fahrennheit para Celcius = C = (F - 32) / 1,8
        Fahrennheit para Kelvin  = K = (F - 32) X 5 / 9 + 273
        Kelvin para Fahrennheit  = F = (K - 273) x 1,8 + 32
         */
        int numOperacao;
        char respostaTemperatura = 's';
        double C, K, F;
        while (respostaTemperatura == 's') {
            System.out.println("Selecione a operação que deseja realizar: \n");
            System.out.println("1 - Celcius para Kevin ");
            System.out.println("2 - Celcius para Fahrennheit");
            System.out.println("3 - Kevin para celcius");
            System.out.println("4 - Fahrennheit para Celcius");
            System.out.println("5 - Fahrennheit para Kelvin");
            System.out.println("6 - Kelvin para Fahrennheit\n");
            numOperacao = sc.nextInt();
            sc.nextLine();

            switch (numOperacao) {
                case 1 -> {
                    System.out.println("Digite o valor em Celcius: ");
                    C = sc.nextDouble();
                    sc.nextLine();
                    K = C + 273;
                    System.out.printf("%n%.2f celcius = %.2f Kelvin%n", C, K);
                }
                case 2 -> {
                    System.out.println("Digite o valor em Celcius: ");
                    C = sc.nextDouble();
                    sc.nextLine();
                    F = C * 1.8 + 32;
                    System.out.printf("%n%.2f celcius = %.2f Fahrennheit%n", C, F);
                }
                case 3 -> {
                    System.out.println("Digite o valor em Kelvin: ");
                    K = sc.nextDouble();
                    sc.nextLine();
                    C = K - 273;
                    System.out.printf("%n%.2f Kelvin = %.2f Celcius%n", K, C);
                }
                case 4 -> {
                    System.out.println("Digite o valor em Fahrennheit: ");
                    F = sc.nextDouble();
                    sc.nextLine();
                    C = (F - 32) / 1.8;
                    System.out.printf("%n%.2f Fahrennheit = %.2f Celcius%n", F, C);
                }
                case 5 -> {
                    System.out.println("Digite o valor em Fahrennheit: ");
                    F = sc.nextDouble();
                    sc.nextLine();
                    K = (F - 32) * 5 / 9 + 273;
                    System.out.printf("%n%.2f Fahrennheit = %.2f Kelvin%n", F, K);
                }
                case 6 -> {
                    System.out.println("Digite o valor em Kelvin: ");
                    K = sc.nextDouble();
                    sc.nextLine();
                    F = (K - 273) * 1.8 + 32;
                    System.out.printf("%n%.2f Kelvin = %.2f Fahrennheit%n", K, F);
                }
                default -> System.out.println("\nNumero errado!\n");
            }
            System.out.println("\nQuer rodar o programa novamente(s/n): ");
            respostaTemperatura = sc.next().charAt(0);
        }

        // LISTA DE EXERCICIOS COM DO-WHILE

        /*16
        Escreva um algoritmo que leia um número do teclado até que encontre um número menor ou igual a 1.
         */
        int numeroDigitado;
        do {
            System.out.println("Digite um número: ");
            numeroDigitado = sc.nextInt();
        } while (!(numeroDigitado <= 1));
        System.out.println("FIM");

        /*17
        Crie um programa que leia um número do teclado até que encontre um número igual a zero.
        No final, mostre a soma dos números digitados.
         */
        int numeroDigitado2;
        int somaNumeroDigitado = 0;
        do {
            System.out.println("Digite um número: ");
            numeroDigitado2 = sc.nextInt();
            somaNumeroDigitado = somaNumeroDigitado + numeroDigitado2;
        } while (!(numeroDigitado2 == 0));
        System.out.println("SOMA: " + somaNumeroDigitado);

        /*18
        Faça um programa que implemente um menu onde o usurário deverá selecionar 1 ou 0. Caso seja entrado
        um número diferente, o programa deverá solicitar uma nova opção.
         */
        int valorNumero;
        do {
            System.out.println("Menu: \n");
            System.out.println("0 - Continua");
            System.out.println("1 - Continua\n");
            valorNumero = sc.nextInt();
        } while (valorNumero == 0 || valorNumero == 1);
        System.out.println("FIM");

        /*19
        Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre;
        • a quantidade de pessoas com mais de 90 quilos;
        • a média das idades das sete pessoas
         */
        int contadorPessoas = 1;
        int idade, qtdNoventa = 0, somaIdade = 0;
        double peso, mediaIdade;
        do {
            System.out.println("Digite a sua idade: ");
            idade = sc.nextInt();
            System.out.println("Digite o seu peso: ");
            peso = sc.nextDouble();

            somaIdade = somaIdade + idade;

            if (peso > 90.0) {
                qtdNoventa++;
            }

            mediaIdade = (double) somaIdade / 7;

            contadorPessoas++;
        } while (contadorPessoas <= 7);
        System.out.println("Pessoas com mais de 90 KG: " + qtdNoventa);
        System.out.println("Media de idades: " + mediaIdade);

        /*20
        Faça um programa que peça uma nota, entre zero e dez.
        Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
         */
        int numeroDigitado3;
        do {
            System.out.println("Digite um número entre 0 e 10: ");
            numeroDigitado3 = sc.nextInt();
        } while (!((numeroDigitado3 >= 0) && (numeroDigitado <= 10)));
        System.out.println("FIM");

        /*21
        Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
        mostrando uma mensagem de erro e voltando a pedir as informações.
         */
        String senhaUser;
        String nome;
        do{
            System.out.println("Digite o seu usuario: ");
            nome = sc.next();
            System.out.println("Digite sua senha: ");
            senhaUser = sc.next();
        } while (senhaUser.equals(nome));


        // LISTA DE EXERCICIOS COM FOR

        /*22
        Escrever um programa para exibir os números de 1 até 50 na tela.
         */
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        /*23
        Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
        Depois modifique o programa para que ele mostre os números um ao lado do outro.
         */
        for (int l = 1; l <= 20; l++) {
            System.out.print(l + " ");
        }

        /*24
        Faça um programa que receba dois números inteiros e gere os números inteiros
        que estão no intervalo compreendido por eles.
         */
        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundoNumero = sc.nextInt();

        for (int numeroSeq = primeiroNumero + 1; numeroSeq < segundoNumero; numeroSeq++) {
            System.out.print(numeroSeq + " ");
        }

        /*25
        Fazer um programa para encontrar todos os números pares entre 1 e 100.
         */
        for (int contadorPar = 1; contadorPar < 100; contadorPar++) {
            if (contadorPar % 2 == 0){
                System.out.println(contadorPar);
            }
        }

        /*26
        Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.
         */
        System.out.println("TABUADA: Digite um numero entre 1 e 10");
        int numeroDigi = sc.nextInt();

        for (int contagemTab = 1; contagemTab <= 10; contagemTab++) {
            System.out.printf("%d X %d = %d%n", numeroDigi, contagemTab, numeroDigi * contagemTab);
        }

        /*27
        Leia várias idades e calcule a média entre as idades (usar uma variável para idade).
         */
        for (int contadorId = 1; contadorId <= 5; contadorId++) {
            System.out.println("Digite a idade: ");
            int quartoNumero = sc.nextInt();
            soma = soma + quartoNumero;
        }
        double mediaId = soma / 5;
        System.out.println("Media: " + mediaId);

        /*28
        Ler 10 números e imprimir quantos são pares e quantos são ímpares.
         */
        int pares = 0, impares = 0;
        for (int r = 1; r <= 10; r++) {
            System.out.println("Digite um numero: ");
            int terceiroNumero = sc.nextInt();

            if (terceiroNumero % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares + "| Impares: " + impares);

        /*29
        faça um programa que receba 10 números e conte quantos deles estão no intervalo [10,20]
        e quantos deles estão fora do intervalo
         */
        int dentroIntervalo = 0, foraIntervalo = 0;
        for (int contadorNumber = 1; contadorNumber <= 10; contadorNumber++) {
            System.out.println("Digite o numero: ");
            int numberSqe = sc.nextInt();

            if (numberSqe >= 10 && numberSqe <= 20){
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }
        System.out.println("Dentro do intervalo: " + dentroIntervalo);
        System.out.println("Dentro do intervalo: " + foraIntervalo);
        sc.close();
    }
}
