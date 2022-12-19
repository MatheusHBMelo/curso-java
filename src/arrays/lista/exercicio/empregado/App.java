package arrays.lista.exercicio.empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // Criando a lista de empregados
        List<Empregado> lista = new ArrayList<>();

        System.out.print("Quantos empregados serão registrados: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpregado #" + (i+1) + ": ");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            // Verificando se já existe funcionario com o mesmo ID
            while (temId(lista, id) != null){
                System.out.print("Esse ID já existe - Digite um novo valor de ID: ");
                id = sc.nextInt();
                sc.nextLine();
            }

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            Empregado emp = new Empregado(id, nome, salario);

            lista.add(emp);
        }

        // Conferindo se o ID existe para poder aumentar o salario do empregado
        System.out.print("\nDigite o ID do empregado que receberá o aumento: ");
        int idEmpregado = sc.nextInt();
        sc.nextLine();
        Integer resultadoId = temId(lista, idEmpregado);
        if (resultadoId == null){
            System.out.println("\nEsse ID não existe!");
            return;
        }else {
            System.out.print("Digite o percentual de aumento: ");
            double percentual = sc.nextDouble();
            lista.get(resultadoId).aumentoSalario(percentual);
        }

        // Retornando a lista de empregados
        System.out.println("\nLista de empregados:");
        for (Empregado e: lista) {
            System.out.println(e);
        }

        sc.close();
    }
    // Função para validar se o ID existe
    public static Integer temId(List<Empregado> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}