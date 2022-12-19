package enumeracoes;

public class EstudoEnum {
    public static void main(String[] args) {
        // Atribuindo enums a variaveis e imprimindo-as
        PeriodoEnumeracao periodo1 = PeriodoEnumeracao.MANHA;
        System.out.println(periodo1);
        System.out.println(periodo1.getPeriodo() + "\n");

        PeriodoEnumeracao periodo2 = PeriodoEnumeracao.TARDE;
        System.out.println(periodo2);
        System.out.println(periodo2.getPeriodo() + "\n");

        PeriodoEnumeracao periodo3 = PeriodoEnumeracao.NOITE;
        System.out.println(periodo3);
        System.out.println(periodo3.getPeriodo());

        System.out.println("------------Teste Enum compras------------");

        // Convertendo de String para Enum
        ComprasEnumeracao compra01 = ComprasEnumeracao.valueOf("VENDA");
        System.out.println(compra01 + "\n");

        // Imprimindo todos os itens do Enum com values()
        for (ComprasEnumeracao ce: ComprasEnumeracao.values()) {
            System.out.println(ce);
        }

        System.out.println("\n");

        // Arrays de itens do enum
        ComprasEnumeracao[] compras = ComprasEnumeracao.values();
        for (int i = 0; i < compras.length; i++) {
            System.out.println(compras[i]);
        }

        System.out.println("------------Teste Enum transportes------------");

        System.out.println(Transportes.AVIAO.getSpeed() + "KM/h");
        System.out.println(Transportes.CARRO.getSpeed() + "KM/h");
        System.out.println(Transportes.MOTO.getSpeed() + "KM/h");
        System.out.println(Transportes.TREM.getSpeed() + "KM/h");

        Transportes t1 = Transportes.ONIBUS;
        Transportes t2 = Transportes.BIKE;
        System.out.println(t1.ordinal()); // Indice do item no enum
        System.out.println(t2.ordinal()); // Indice do item no enum
    }
}
