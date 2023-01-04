package excecoes;

public class EstudoFinallyTwo {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12};
        int[] numeros2 = {0, 2, 3, 0, 2};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + " / " + numeros2[i] + " = " + (numeros[i] / numeros2[i]));
            }
            catch (ArithmeticException ae){
                System.out.println("Erro: Não é possivel dividir por zero.");
            }
            catch (ArrayIndexOutOfBoundsException aibe){
                System.out.println("Erro: Posição do array invalida.");
            }
            finally {
                System.out.println("Essa linha é impressa sempre após o try ou o catch!");
            }
        }
    }
}
