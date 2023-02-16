package genericssetmap.tiposcuringa.contraevariancia.contravariancia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando uma lista de OBJECT, ou seja, aceita qualquer tipo
        List<Object> listObj = new ArrayList<>();

        // Adicionando dois elementos do tipo String
        listObj.add("Matheus");
        listObj.add("Henrique");

        // Criando uma lista de tipo curinga que aceitar NUMBER e a super classe de Number, ou seja, OBJECTS
        List<? super Number> listS = listObj;

        // Adicionando valores
        listS.add(50);
        listS.add(5.4);
        listS.add(32);

        // Number x = listS.get(2); - Erro de compilação, operação inserir é permitida mas get não.
    }
}
