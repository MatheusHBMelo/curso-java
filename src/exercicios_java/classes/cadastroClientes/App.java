package exercicios_java.classes.cadastroClientes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> list = new ArrayList<>();

        int resposta = 0;
        while (resposta != 5){
            System.out.println("\n------------ MENU ------------");
            System.out.println("1 - Cadastrar novo cliente");
            System.out.println("2 - Editar cliente");
            System.out.println("3 - Consultar cliente");
            System.out.println("4 - Apagar cliente");
            System.out.println("5 - Sair do programa");
            System.out.println("---------- FIM MENU ----------\n");
            resposta = sc.nextInt();

            int registroConsulta;
            switch (resposta) {
                case 1 -> {
                    System.out.print("Digite o nome do cliente: ");
                    String nome = sc.next();
                    System.out.print("Digite o sobrenome do cliente: ");
                    String sobrenome = sc.next();
                    sc.nextLine();
                    System.out.print("Digite a data de nascimento do cliente: ");
                    String dataNascimento = sc.nextLine();
                    System.out.print("Digite a nacionalidade do cliente: ");
                    String nacionalidade = sc.next();
                    System.out.print("Digite o sexo (M/F) do cliente: ");
                    char sexo = sc.next().charAt(0);
                    System.out.print("Digite o telefone do cliente: ");
                    String telefone = sc.next();
                    System.out.print("Digite o numero de registro do cliente: ");
                    int numeroRegistro = sc.nextInt();
                    while (Cliente.validaNumeroRegistro(list, numeroRegistro) != null) {
                        System.out.println("\nJá existe um cliente com esse numero de registro - Digite novamente\n");
                        System.out.print("Digite o numero de registro do cliente: ");
                        numeroRegistro = sc.nextInt();
                    }
                    Cliente cli = new Cliente(nome, sobrenome, LocalDate.parse(dataNascimento), nacionalidade, sexo, telefone, numeroRegistro);
                    list.add(cli);
                }
                case 2 -> {
                    System.out.println("\n------------ MENU ------------");
                    System.out.println("1 - Editar nome");
                    System.out.println("2 - Editar sobrenome");
                    System.out.println("3 - Editar dataNascimento");
                    System.out.println("4 - Editar nacionalidade");
                    System.out.println("5 - Editar sexo");
                    System.out.println("6 - Editar telefone");
                    System.out.println("7 - Editar numero de registro");
                    System.out.println("---------- FIM MENU ----------\n");
                    int resposta2 = sc.nextInt();
                    int registro;
                    switch (resposta2) {
                        case 1 -> {
                            System.out.print("\nDigite o numero de registro do cliente que deseja alterar: ");
                            registro = sc.nextInt();
                            while (Cliente.validaNumeroRegistro(list, registro) == null) {
                                System.out.print("\nEsse cliente não existe, digite o numero de registro cadastrado: ");
                                registro = sc.nextInt();
                            }
                            System.out.print("Digite o novo nome: ");
                            String newName = sc.next();
                            for (Cliente cliente : list) {
                                if (cliente.getNumeroRegistro() == registro) {
                                    cliente.setNome(newName);
                                }
                            }
                        }
                        case 2 -> {
                            System.out.print("\nDigite o numero de registro do cliente que deseja alterar: ");
                            registro = sc.nextInt();
                            while (Cliente.validaNumeroRegistro(list, registro) == null) {
                                System.out.print("\nEsse cliente não existe, digite o numero de registro cadastrado: ");
                                registro = sc.nextInt();
                            }
                            System.out.print("Digite o novo sobrenome: ");
                            String newSobrename = sc.next();
                            for (Cliente cliente : list) {
                                if (cliente.getNumeroRegistro() == registro) {
                                    cliente.setSobrenome(newSobrename);
                                }
                            }
                        }
                        case 3 -> {
                            System.out.print("\nDigite o numero de registro do cliente que deseja alterar: ");
                            registro = sc.nextInt();
                            while (Cliente.validaNumeroRegistro(list, registro) == null) {
                                System.out.print("\nEsse cliente não existe, digite o numero de registro cadastrado: ");
                                registro = sc.nextInt();
                            }
                            System.out.print("Digite a nova data de nascimento: ");
                            String datanascimento = sc.nextLine();
                            LocalDate newdata = LocalDate.parse(datanascimento);
                            for (Cliente cliente : list) {
                                if (cliente.getNumeroRegistro() == registro) {
                                    cliente.setDataNascimento(newdata);
                                }
                            }
                        }
                        case 4 -> {
                            System.out.print("\nDigite o numero de registro do cliente que deseja alterar: ");
                            registro = sc.nextInt();
                            while (Cliente.validaNumeroRegistro(list, registro) == null) {
                                System.out.print("\nEsse cliente não existe, digite o numero de registro cadastrado: ");
                                registro = sc.nextInt();
                            }
                            System.out.print("Digite a nova nacionalidade: ");
                            String newNacionalidade = sc.next();
                            for (Cliente cliente : list) {
                                if (cliente.getNumeroRegistro() == registro) {
                                    cliente.setNacionalidade(newNacionalidade);
                                }
                            }
                        }
                        case 5 -> {
                            System.out.print("\nDigite o numero de registro do cliente que deseja alterar: ");
                            registro = sc.nextInt();
                            while (Cliente.validaNumeroRegistro(list, registro) == null) {
                                System.out.print("\nEsse cliente não existe, digite o numero de registro cadastrado: ");
                                registro = sc.nextInt();
                            }
                            System.out.print("Digite a novo sexo (M/F): ");
                            char newSexo = sc.next().charAt(0);
                            for (Cliente cliente : list) {
                                if (cliente.getNumeroRegistro() == registro) {
                                    cliente.setSexo(newSexo);
                                }
                            }
                        }
                        case 6 -> {
                            System.out.print("\nDigite o numero de registro do cliente que deseja alterar: ");
                            registro = sc.nextInt();
                            while (Cliente.validaNumeroRegistro(list, registro) == null) {
                                System.out.print("\nEsse cliente não existe, digite o numero de registro cadastrado: ");
                                registro = sc.nextInt();
                            }
                            System.out.print("Digite o novo telefone: ");
                            String newTelefone = sc.next();
                            for (Cliente cliente : list) {
                                if (cliente.getNumeroRegistro() == registro) {
                                    cliente.setTelefone(newTelefone);
                                }
                            }
                        }
                        case 7 -> {
                            System.out.print("\nDigite o numero de registro do cliente que deseja alterar: ");
                            registro = sc.nextInt();
                            while (Cliente.validaNumeroRegistro(list, registro) == null) {
                                System.out.print("\nEsse cliente não existe, digite o numero de registro cadastrado: ");
                                registro = sc.nextInt();
                            }
                            System.out.print("Digite o novo numero de registro: ");
                            int newNumeroRegistro = sc.nextInt();
                            while (Cliente.validaNumeroRegistro(list, newNumeroRegistro) != null) {
                                System.out.print("Já existe um cliente com esse numero de registro - Digite outro: ");
                                newNumeroRegistro = sc.nextInt();
                            }
                            for (Cliente cliente : list) {
                                if (cliente.getNumeroRegistro() == registro) {
                                    cliente.setNumeroRegistro(newNumeroRegistro);
                                }
                            }
                        }
                        default -> System.out.println("A opção escolhida não está dentre as possiveis!");
                    }
                }
                case 3 -> {
                    System.out.print("\nDigite o numero de registro do cliente que deseja consultar: ");
                    registroConsulta = sc.nextInt();
                    while (Cliente.validaNumeroRegistro(list, registroConsulta) == null) {
                        System.out.print("\nEsse cliente não existe, digite um numero de registro valido: ");
                        registroConsulta = sc.nextInt();
                    }
                    for (Cliente cliente : list) {
                        if (cliente.getNumeroRegistro() == registroConsulta) {
                            System.out.println("\n" + cliente);
                        }
                    }
                }
                case 4 -> {
                    System.out.print("\nDigite o numero de registro do cliente que deseja consultar: ");
                    registroConsulta = sc.nextInt();
                    while (Cliente.validaNumeroRegistro(list, registroConsulta) == null) {
                        System.out.print("\nEsse cliente não existe, digite um numero de registro válido: ");
                        registroConsulta = sc.nextInt();
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNumeroRegistro() == registroConsulta) {
                            System.out.printf("\nO cliente com o número de registro %d foi removido com sucesso!\n", list.get(i).getNumeroRegistro());
                            list.remove(i);
                        }
                    }
                }
                case 5 -> System.out.println("Fim do programa\n");
                default -> System.out.println("\nA opção escolhida não está dentre as possiveis!\n");
            }
        }

        System.out.println("Lista de clientes: ");
        for (Cliente cc: list) {
            System.out.println(cc);
        }

        sc.close();
    }
}
