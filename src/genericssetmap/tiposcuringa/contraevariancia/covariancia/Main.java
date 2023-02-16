package genericssetmap.tiposcuringa.contraevariancia.covariancia;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando uma lista de Integer e adicinando quatro valores
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Criando uma lista de tipo curinga que aceitar qualquer subtipo de Number
        List<? extends Number> list3 = list;

        // Pegando o valor de referencia da posição 0 da lista e armazenando numa variavel de tipo Number
        Number x = list3.get(0);

        // Printando o valor
        System.out.println(x);

        // Tentando adicionar um novo elemento na lista
        // list3.add(10); - Erro de compilação, operação de get é permitida mas a de inserir não.
    }
}
