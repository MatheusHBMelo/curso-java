package enumeracoes;

public enum ComprasEnumeracao {
    COMPRA(1),
    VENDA(2),
    ESTOQUE(3);

    // Se o códigos forem constantes, usar a palavra chave 'final'
    private Integer code;
    ComprasEnumeracao(Integer code){
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }
}
