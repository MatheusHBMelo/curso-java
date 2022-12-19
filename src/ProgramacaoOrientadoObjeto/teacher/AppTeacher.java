package ProgramacaoOrientadoObjeto.teacher;

import java.util.Scanner;

public class AppTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Teacher prof = new Teacher();

        System.out.println("Digite o nome do professor: ");
        prof.nome = sc.next();
        System.out.println("Digite o sobrenome do professor: ");
        prof.sobrenome = sc.next();
        System.out.println("Digite a idade do professor: ");
        prof.idade = sc.nextInt();
        System.out.println("Digite a disciplina do professor: ");
        prof.disciplina = sc.next();

        prof.ministrarAula();
        prof.ministrarAula();
        prof.encerrarAula();
        prof.encerrarAula();

        System.out.println(prof);

        sc.close();
    }
}
