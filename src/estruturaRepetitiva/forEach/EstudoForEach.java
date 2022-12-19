package estruturaRepetitiva.forEach;

public class EstudoForEach {
    public static void main(String[] args) {
        // Criando um array literal de numeros inteiros
        int[] numeros = new int[] {1, 2, 3, 4, 5, 6, 7};

        // Percorrendo o array com For Simple
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("----------");

        // Percorrendo o array com ForEach
        for (int n : numeros){
            System.out.println(n);
        }
    }
}
