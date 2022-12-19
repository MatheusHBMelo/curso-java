package enumeracoes;

public enum PeriodoEnumeracao {
    MANHA("Manhã"), // Enum(Valor)
    TARDE("Tarde"), // Enum(Valor)
    NOITE("Noite"); // Enum(Valor)

    // Atributo de referência para o construtor
    private String periodo;

    // Construtor do Enum (não usar modificadores de acesso)
    PeriodoEnumeracao(String periodo){
        this.periodo = periodo;
    }

    // Getter para retornar o periodo
    public String getPeriodo(){
        return periodo;
    }
}
