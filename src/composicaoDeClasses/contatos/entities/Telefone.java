package composicaoDeClasses.contatos.entities;

import composicaoDeClasses.contatos.enums.TipoTelefone;

public class Telefone {
    private TipoTelefone tipo;
    private String ddd;
    private String numero;

    public Telefone() {
    }

    public Telefone(TipoTelefone tipo, String ddd, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{ Tipo: "
                + tipo
                + " | Número: "
                + "(" + ddd + ") "
                + numero + " }";
    }
}
