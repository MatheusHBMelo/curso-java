package exercicios_java;

import exercicios_java.classes.listas.Cliente;

import java.util.*;

public class ListaExercicios07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /* Exercicio 01
        Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone.
        Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList até que se digite um número de ID negativo.
        Em seguida exiba os dados de todos os clientes via SystemOut, formatando cada objeto separado por linhas.
         */
        List<Cliente> list = new ArrayList<>();

        while (true){
            System.out.print("Digite o ID do cliente: ");
            int id = sc.nextInt();
            sc.nextLine();
            if (id < 0){
                System.out.println("\nID invalido!");
                break;
            }
            System.out.print("Digite o NOME do cliente: ");
            String nome = sc.nextLine();
            System.out.print("Digite a IDADE do cliente: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o TELEFONE do cliente: ");
            String telefone = sc.next();

            Cliente cli = new Cliente(id, nome, idade, telefone);
            list.add(cli);
        }
        System.out.println("CLIENTES: ");
        for (Cliente cc: list){
            System.out.println(cc);
        }

        /* Exercicio 02
        Escreva um programa que adote um ArrayList como estrutura padrão de armazenamento de dados.
        O programa deverá cadastrar (sem interação do usuário), 10 valores de qualquer tipo dentro da lista (String, int, char, double, etc). Ao final,
        o programa deverá mostrar os valores cadastrados.
         */
        List<Integer> list2 = new ArrayList<>();

        int limite = 10;
        for (int i = 0; i < limite; i++) {
            int valor = (int) (Math.random() * 11);
            list2.add(valor);
        }

        for (int v:
             list2) {
            System.out.println(v);
        }

        /* Exercicio 03
        Escreva um programa que receba cinco nomes diferentes do usuário.

        Todos o s nomes deverão ser armazenados em um ArrayList tipado para Strings.

        O programa deverá mostrar os nomes cadastrados em ordem inversa a qual foram cadastrados, ou seja, do último para o primeiro.
         */
        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome #" + (i+1) + ": ");
            String nome = sc.nextLine();

            list3.add(nome);
        }
        Collections.reverse(list3);

        for (String ss: list3){
            System.out.println(ss);
        }

        /* Exercicio 04
        Escreva um programa que contenha uma lista com 5 nomes pré-cadastrados.
        O programa deverá dar ao usuário a opção de excluir um único nome da lista, com valores entre 1 e 5, exemplo.
         */
        List<String> list4 = new ArrayList<>(Arrays.asList("Neymar Junior", "Vinicius Junior", "Richarlison", "Raphinha", "Alison Becker"));

        System.out.print("Digite a posição que deseja excluir: ");
        int posicao = sc.nextInt();

        switch (posicao) {
            case 1 -> list4.remove(0);
            case 2 -> list4.remove(1);
            case 3 -> list4.remove(2);
            case 4 -> list4.remove(3);
            case 5 -> list4.remove(4);
            default -> System.out.println("Digite um valor válido!");
        }
        for (String cc: list4) {
            System.out.println(cc);
        }

        /* Exercicio 05
        Escreva um programa que cadastre em uma lista numérica de valores inteiro com 10 números aleatórios entre 10 e 100. Ao final,
        o programa deverá detectar na lista qual o maior número inteiro sorteado e mostra-lo ao usuário.
         */
        List<Integer> list6 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int numSorteado = (int) (Math.random() * 101);
            list6.add(numSorteado);
        }

        int maior = 0;
        for (int nums: list6) {
            if (nums > maior){
                maior = nums;
            }
        }
        System.out.println("Maior numero: " + maior);

        /* Exercicio 07
        Crie um programa que dê ao usuário a opção de cadastrar itens que o mesmo almeja comprar em sua ida ao supermercado.
        Para tal, o programa deverá possibilitar que o usuário vá digitando, infinitamente, nomes de produtos na lista.
        A cada ENTER, os produtos deverão ser armazenados na primeira posição da lista.
        Para “SAIR", o usuário deverá digitar "FIM DA LISTA".
        Para EXCLUIR ÚLTIMO ITEM CADASTRADO , o usuário deverá digitar "EXCLUIR".
        Para LIMPAR A LISTA, o usuário deverá digitar "ZERAR".

        Todas as outras palavras deverão ser consideradas produtos e inseridas na lista.
         */
        List<String> lista = new ArrayList<>();

        String resposta;
        final String fim = "FIM DA LISTA";
        final String excluir = "EXCLUIR";
        final String zerar = "ZERAR";
        boolean flag = true;
        int contadorItens = 0;

        while (flag){
            System.out.print("Digite o nome do produto: ");
            resposta = sc.nextLine();

            switch (resposta) {
                case fim -> {
                    flag = false;
                    System.out.println("\nFim da lista");
                }
                case excluir -> {
                    lista.remove(--contadorItens);
                    contadorItens--;
                    System.out.println("\nO ultimo item foi removido!\n");
                }
                case zerar -> {
                    System.out.println("\nOs itens da lista foram zerados!\n");
                    lista.clear();
                }
                default -> lista.add(resposta);
            }
            contadorItens++;
        }
        System.out.println("\n");
        for (String listagem: lista) {
            System.out.println("# " + listagem);
        }

        /* Exercicio 08
        Crie um ArrayList de pessoas e:

        Adicione 5 pessoas;
        Remova pessoa na última posição do ArrayList;
        Altere a segunda posição do ArrayList p/ uma nova pessoa;
        Consulte o nome da pessoa na posição 3;
        Limpe o ArrayList.
         */
        List<String> list7 = new ArrayList<>();

        // Adicione 5 pessoas
        list7.add("Matheus");
        list7.add("Davi");
        list7.add("Alexandre");
        list7.add("Everton");
        list7.add("Joe");

        // Imprimindo a lista
        for (String nomes: list7) {
            System.out.println(nomes);
        }
        System.out.println("\n-------------\n");

        // Remova pessoa na última posição do ArrayList
        list7.remove(4);

        // Imprimindo a lista
        for (String nomes: list7) {
            System.out.println(nomes);
        }
        System.out.println("\n-------------\n");

        // Altere a segunda posição do ArrayList p/ uma nova pessoa
        list7.add(2, "Gabriel");

        // Imprimindo a lista
        for (String nomes: list7) {
            System.out.println(nomes);
        }
        System.out.println("\n-------------\n");

        // Consulte o nome da pessoa na posição 3
        System.out.println(list7.get(3));
        System.out.println("\n-------------\n");

        // Imprimindo a lista
        for (String nomes: list7) {
            System.out.println(nomes);
        }
        System.out.println("\n-------------\n");

        // Limpe o ArrayList
        list7.clear();

        sc.close();
    }
}
