package genericssetmap.estudogenerics;

import genericssetmap.estudogenerics.dominio.Barco;
import genericssetmap.estudogenerics.service.BarcoRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        BarcoRentavelService carroRentavelService = new BarcoRentavelService();
        Barco barco = carroRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês");
        carroRentavelService.retornarBarco(barco);
    }
}
