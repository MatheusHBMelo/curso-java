package interfaces.comparable.exercicios.produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Produto camisaA = new Produto("Camisa A", 9.98);
        Produto camisaB = new Produto("Camisa B", 10.0);
        Produto camisaC = new Produto("Camisa C", 10.0);
        Produto camisaX = new Produto("Camisa X", 9.99);
        Produto camisaY = new Produto("Camisa Y", 9.99);
        System.out.println("Camisa A comparado com Camisa B : " + camisaA.compareTo(camisaB));
        System.out.println("Camisa B comparado com Camisa C : " + camisaB.compareTo(camisaC));
        System.out.println("Camisa C comparado com Camisa X : " + camisaC.compareTo(camisaX));
        System.out.println("Camisa X comparado com Camisa Y : " + camisaX.compareTo(camisaY));
        System.out.println("Camisa Y comparado com Camisa X : " + camisaY.compareTo(camisaX));

        List<Produto> list = new ArrayList<>();
        list.add(camisaA);
        list.add(camisaB);
        list.add(camisaC);
        list.add(camisaX);
        list.add(camisaY);

        Collections.sort(list);
        for(Produto p: list){
            System.out.println(p);
        }
    }
}
