package ProgramacaoOrientadoObjeto.calculadora;

public class Calculadora {

    public double valorPrimario;
    public double valorSecundario;

    public double adicao(){
        return valorPrimario + valorSecundario;
    }

    public double subtracao(){
        return valorPrimario - valorSecundario;
    }

    public double multiplicacao(){
        return valorPrimario * valorSecundario;
    }

    public double divisao(){
        return valorPrimario / valorSecundario;
    }
}
