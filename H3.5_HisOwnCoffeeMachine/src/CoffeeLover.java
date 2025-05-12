public class CoffeeLover {
    private SimpleCoffeeMachine simple;
    private ComplexCoffeeMachine complex;

    public CoffeeLover() {
        this.simple = new SimpleCoffeeMachine();
        this.complex = new ComplexCoffeeMachine();
    }

    public void makeCoffee() {
        simple.start();
        complex.start();
    }
}
