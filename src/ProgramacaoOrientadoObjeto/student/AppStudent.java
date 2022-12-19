package ProgramacaoOrientadoObjeto.student;

import java.util.Locale;
import java.util.Scanner;

public class AppStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student estudante = new Student();

        System.out.print("Nome: ");
        estudante.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        estudante.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        estudante.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        estudante.nota3 = sc.nextDouble();

        estudante.media();

        sc.close();
    }
}
