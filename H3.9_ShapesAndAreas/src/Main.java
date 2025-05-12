import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3.0));
        shapes.add(new Square(4.0));
        shapes.add(new Triangle(5, 2));

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}
