package membrosEstaticos.noStaticVersion;

// Utilizado o modelo de delegação de função por classe
public class CalculatorTwo {
    public final double PI = 3.14;

    public double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
