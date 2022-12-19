package ProgramacaoOrientadoObjeto.teacher;

public class Teacher {
    public String nome;
    public String sobrenome;
    public int idade;
    public String disciplina;
    public boolean ativo;

    public void ministrarAula(){
        if (ativo){
            System.out.println("Professor já está ministrando aula!");
        } else {
            System.out.println("Professor iniciando aula!");
            ativo = true;
        }
    }

    public void encerrarAula(){
        if (ativo) {
            System.out.println("Encerrando aula!");
            ativo = false;
        }else {
            System.out.println("O professor não está ministrando aula!");
        }
    }

    public String toString(){
        return  "NOME: "
                + nome
                + " "
                + sobrenome
                + ", IDADE: "
                + idade
                + " anos, DISCIPLINA: "
                + disciplina
                + ", STATUS: "
                + ativo;
    }
}
