package genericssetmap.estudogenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        // Forma utilizada até a versão 1.4 do Java

        List lista = new ArrayList<>(); // Sintaxe anterior

        lista.add("Matheus");
        lista.add(150L);
        lista.add('a');
        lista.add("Davi");

        for (Object o : lista) {
            if (o instanceof String){
                System.out.println(o);
            }

            if (o instanceof Long){
                System.out.println(o);
            }

            if (o instanceof Character){
                System.out.println(o);
            }
        }

        /* Alguns problemas que podiam acontecer

        1- Ter que utilizar um Object como variavel de referência quando for preciso percorrer a coleção.
        2- Ter que criar multiplas condições para avaliar de a variavel de controle é um instanceOf de uma classe
        2- Incompatibilidade de tipos gerando exceções, duplicação de códigos, etc..
         */

        System.out.println("------------------------------------------");

        /* Solução encontrada pelos desenvolvedores do Java - Generics

        1- Forçar o tipo da coleção e verificar em tempo de compilação, não permitindo dados de outros tipos.
         */

        List<String> lista2 = new ArrayList<>(); // Sintaxe com Generics

        lista2.add("Matheus");
        lista2.add("Davi");
        lista2.add("Carlos");

        for (String name : lista2){
            System.out.println(name);
        }
    }
}
