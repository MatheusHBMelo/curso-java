package herancaePolimorfismo.revisao.model;

public class PessoaJuridica extends Pessoa {
    private int numeroDeFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double tax() {
        if (numeroDeFuncionarios > 10){
            return getRendaAnual() * 0.14;
        }else {
            return getRendaAnual() * 0.16;
        }
    }
}
