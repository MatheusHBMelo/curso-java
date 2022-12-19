package exercicios_java.classes;

public class ConversaoDeUnidadesDeVolume {
    public static double litroParaCentimetroCubico(double valor){
        return valor * 1000;
    }

    public static double metroCubicoParaLitro(double valor) { return valor * 1000;}

    public static double metroCubicoParaPesCubicos(double valor) { return valor * 35.32;}

    public static double galaoAmericanoParaPolegadasCubicas(double valor) { return valor * 231;}

    public static double galaoAmericanoParaLitro(double valor) { return valor * 3.785;}
}
