package ProgramacaoOrientadoObjeto.carro;

import java.util.Locale;
import java.util.Scanner;

public class AppCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Car carOne = new Car();

        System.out.print("Digite a marca do veiculo: ");
        carOne.marca = sc.nextLine();
        System.out.print("Digite a modelo do veiculo: ");
        carOne.modelo = sc.nextLine();
        System.out.print("Digite o ano de fabricação do veiculo: ");
        carOne.anoFabricacao = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a cor do veiculo: ");
        carOne.cor = sc.nextLine();
        System.out.print("Digite o valor atual do veiculo: ");
        carOne.valorAtual = sc.nextDouble();

        System.out.println("------------------------------");

        System.out.println(carOne);

        System.out.println("------------------------------");

        carOne.acelerar(50);
        carOne.freiar(50);
        carOne.desligar();
        carOne.ligar();

        carOne.acelerar(110);
        carOne.acelerar(20);
        carOne.acelerar(20);
        carOne.freiar(100);
        carOne.freiar(10);
        carOne.freiar(20);
        carOne.freiar(1);

        sc.close();
    }
}
