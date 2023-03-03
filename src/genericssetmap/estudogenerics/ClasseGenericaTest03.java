package genericssetmap.estudogenerics;

import genericssetmap.estudogenerics.dominio.Barco;
import genericssetmap.estudogenerics.dominio.Carro;
import genericssetmap.estudogenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentalService.retornarObjeto(carro);

        System.out.println("\n");

        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService2.buscarObjetoDisponivel();
        System.out.println("Usando barco por um mês...");
        rentalService2.retornarObjeto(barco);
    }
}
