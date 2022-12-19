package funcoesDoJava.randomFunctions;

import java.util.Random;

public class EstudoFuncaoRandom {
    public static void main(String[] args){

        // Numero aleatorio - MIN: 1 Max: 10 - Metodo Random da class Math
        int numero = (int) (1 + (Math.random() * 10));
        System.out.println(numero);

        // Numero aleatorio - MIN: 1 Max: 10 - Class
        Random aleatorio = new Random();
        int numero2 = aleatorio.nextInt(10) + 1;
        System.out.println(numero2);
    }
}
