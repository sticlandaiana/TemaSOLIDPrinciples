public class Main {
    public static void main(String[] args) {
        GeometricTrousse manager = new GeometricTrousse();
        Shape square = new Square(5);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(6);
        manager.addShape(square);
        manager.addShape(circle);
        manager.addShape(triangle);

        manager.letsDrawThemAll();
    }
}