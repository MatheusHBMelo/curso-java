package genericssetmap.estudogenerics;

import genericssetmap.estudogenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa"));
    }

    // Metodo generico é declarado depois dos modificadores e antes do tipo de retorno
    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}
