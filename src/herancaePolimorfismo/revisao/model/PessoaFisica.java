package herancaePolimorfismo.revisao.model;

public class PessoaFisica extends Pessoa{
    private double gastosComSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double tax() {
        double imposto = (getRendaAnual() < 20000) ? getRendaAnual() * 0.15 : getRendaAnual() * 0.25;
        imposto -= getGastosComSaude() * 0.5;
        double total = (imposto < 0.0) ? 0.0 : imposto;
        return total;
    }
}
