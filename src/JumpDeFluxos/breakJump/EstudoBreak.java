package JumpDeFluxos.breakJump;

public class EstudoBreak {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++){
            if (i > 25){
                break; // Quando chegar em 25 ele interrompe o loop e encerra o programa
            }
            System.out.println(i);
        }
        System.out.println("Tempo de execução, em milisegundos: " + (System.currentTimeMillis() -l));
    }
}
