public class Main {
    public static void main(String[] args) {
        SumAreas manager = new SumAreas();

        manager.addShape(new Circle(2));
        manager.addShape(new Rectangle(1, 4));
        manager.addShape(new Circle(2));

        manager.printAreas();
        manager.computeTheSumOfTheAreas();
        System.out.println("The sum of the areas is "+manager.getSum());
    }
}