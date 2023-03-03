package genericssetmap.estudogenerics;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        printConsulta(cachorros); // Erro de type Erasure
        printConsulta(gatos);     // Erro de type Erasure
    }
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }

        // animals.add(new Gato());     ERROR
        // animals.add(new Cachorro()); ERROR
    }
    private static void printConsultaAnimal(List<? super Animal> animals){
        animals.add(new Gato());
        animals.add(new Cachorro());
    }

    // Wildcard ou caractere curinga é expressado pelo simbolo de interrogação ( ? )

    // Solução para o erro de Type Erasure nesse caso:
    // 1- Utilizar o caractere curinga informando que será uma lista de classes que extends de Animal
    // OBS: Ao utilizar a sintaxe de generic List<? extends Animal> não será possivel add elementos a lista [...]
    // [...] pois ser for passado uma lista de Gatos, não será possivel adicionar um Cachorro, pois está configurado para subclasse especifica
    // Por tanto ocorrerá uma problemas entre as classes irmãs.

    // Para corrigir isso, deve-se generalizar o tipo da lista, usando-se então: List<? super Animal>, dessa forma é possivel adicionar ambas as subclasses
    // Dessa forma passará no teste "É UM" de polimorfismo e por isso poderão ser adicionados qualquer uma das classes filhas.
}
