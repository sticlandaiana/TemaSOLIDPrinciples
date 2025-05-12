import java.util.ArrayList;
import java.util.List;

public class SumAreas {
    private List<Shape> shapes;
    private double sum;

    public SumAreas(){
        this.shapes = new ArrayList<>();
        this.sum = 0;
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void computeTheSumOfTheAreas(){
        for(Shape shape : shapes){
            sum +=shape.getArea();
        }
    }

    public void printAreas() {
        for (Shape shape : shapes) {
            System.out.println("Area " + shape.getClass().getSimpleName() + ": " + shape.getArea());
        }
    }

    public double getSum(){
        return sum;
    }
}
