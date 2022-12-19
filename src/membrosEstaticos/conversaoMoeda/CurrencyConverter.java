package membrosEstaticos.conversaoMoeda;

public class CurrencyConverter {
    public static final double IOF = 0.0638;

    public static double convert(double value, double cotation){
        double iofTaxa = value * cotation * IOF;
        return value * cotation + iofTaxa;
    }
}
