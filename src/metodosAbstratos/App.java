package metodosAbstratos;

import metodosAbstratos.entities.Circle;
import metodosAbstratos.entities.Rectangle;
import metodosAbstratos.entities.Shape;
import metodosAbstratos.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        Color color;

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nShape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color1 = sc.next();
            if (answer == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                sc.nextLine();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();
                Shape shape = new Rectangle(color = Color.valueOf(color1), width, height);
                list.add(shape);
            } else if (answer == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();
                Shape shape = new Circle(color = Color.valueOf(color1), radius);
                list.add(shape);
            }
        }
        System.out.println("\nSHAPE AREAS:");
        for (Shape sp: list){
            System.out.printf("%.2fm^2%n", sp.area());
        }

        sc.close();
    }
}
