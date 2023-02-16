package genericssetmap.tiposcuringa.curingasDelimitados;

import genericssetmap.tiposcuringa.curingasDelimitados.model.Circle;
import genericssetmap.tiposcuringa.curingasDelimitados.model.Rectangle;
import genericssetmap.tiposcuringa.curingasDelimitados.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> list1 = new ArrayList<>();
        list1.add(new Circle(2.0));
        list1.add(new Rectangle(2.0, 5.0));

        System.out.println("Total Area List Shape: " + String.format("%.2f", totalArea(list1)));

        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle(5.0));
        list2.add(new Circle(10.0));

        System.out.println("Total Area List Circle: " + String.format("%.2f", totalArea(list2)));

        List<Rectangle> list3 = new ArrayList<>();
        list3.add(new Rectangle(5.0, 8.0));
        list3.add(new Rectangle(10.0, 4.0));

        System.out.println("Total Area List Rectangle: " + String.format("%.2f", totalArea(list3)));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
