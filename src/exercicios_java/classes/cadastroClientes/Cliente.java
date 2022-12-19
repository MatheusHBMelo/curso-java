package exercicios_java.classes.cadastroClientes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Cliente {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private Character sexo;
    private String telefone;
    private Integer numeroRegistro;
    private LocalDateTime timestamp;

    public Cliente(){}

    public Cliente(String nome, String sobrenome, LocalDate dataNascimento, String nacionalidade, Character sexo, String telefone, Integer numeroRegistro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.numeroRegistro = numeroRegistro;
        this.timestamp = LocalDateTime.now();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public Character getSexo(){
        return sexo;
    }

    public void setSexo(Character sexo){
        this.sexo = sexo;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public Integer getNumeroRegistro(){
        return numeroRegistro;
    }

    public void setNumeroRegistro(Integer numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public static Integer validaNumeroRegistro(List<Cliente> list, int numero){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumeroRegistro() == numero){
                return i;
            }
        }
        return null;
    }

    public String toString(){
        return "Cliente "
                + numeroRegistro
                + ", Nome Completo: "
                + nome
                + " "
                + sobrenome
                + ", Sexo: "
                + sexo
                + ", Nacionalidade: "
                + nacionalidade
                + ", Telefone: "
                + telefone
                + ", Data de nascimento: "
                + dataNascimento
                + " | Log criação de conta: "
                + timestamp;
    }
}
