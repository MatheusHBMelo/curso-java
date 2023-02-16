package genericssetmap.tiposcuringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EstudoTiposCuringa {
    public static void main(String[] args) {
        List<Object> listOne = new ArrayList<Object>();
        List<Integer> listTwo = new ArrayList<Integer>();
        // listOne = listTwo; - Erro de compilação, Integer não pode ser convertido para Object

        List<?> listThree = new ArrayList<Object>();
        List<Integer> listFour = new ArrayList<Integer>();
        listThree = listFour;

        /* ----------------------------------------------------------------------------------- */
        List<Integer> listFive = Arrays.asList(5, 2, 10);
        printList(listFive);

        List<String> listSix = Arrays.asList("Matheus", "Davi", "Jesus");
        printList(listSix);

        List<Double> listSeven = Arrays.asList(5.1, 5.4, 5.5);
        printList(listSeven);
    }

    public static void printList(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
