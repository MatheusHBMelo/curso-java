package interfaces.herdarvscumprircontrato.application;

import interfaces.herdarvscumprircontrato.enums.Color;
import interfaces.herdarvscumprircontrato.models.Circle;
import interfaces.herdarvscumprircontrato.models.IShape;
import interfaces.herdarvscumprircontrato.models.Retangle;
import interfaces.herdarvscumprircontrato.models.Shape;

public class Program {
    public static void main(String[] args) {
        Shape s1 = new Circle(Color.BLACK, 2.0);
        Shape s2 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

        IShape s3 = new Circle(Color.BLACK, 2.0);
        IShape s4 = new Retangle(Color.WHITE, 3.0, 4.0);
        // System.out.println("Circle color: " + s3.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s3.area()));
        // System.out.println("Rectangle color: " + s4.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s4.area()));
    }
}
