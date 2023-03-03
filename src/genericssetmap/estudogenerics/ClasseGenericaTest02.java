package genericssetmap.estudogenerics;

import genericssetmap.estudogenerics.dominio.Carro;
import genericssetmap.estudogenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês");
        carroRentavelService.retornarCarro(carro);
    }
}
