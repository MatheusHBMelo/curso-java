package exercicios_java.classes.jogador;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Jogador jogador1 = new Jogador();

        jogador1.setNome("Matheus Henrique");
        jogador1.setPosicao("Defesa");
        jogador1.setNacionalidade("Brasileiro");
        jogador1.setAltura(1.76);
        jogador1.setPeso(97.5);
        jogador1.setIdade(25);

        jogador1.tempoAposentar();

        System.out.println(jogador1);

        sc.close();
    }
}
