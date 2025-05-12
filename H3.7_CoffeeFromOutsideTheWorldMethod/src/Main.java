import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CoffeeLover user = new CoffeeLover();

        user.setCoffeeMachines(Arrays.asList(new SimpleCoffeeMachine(), new ComplexCoffeeMachine()));

        user.makeCoffee();
    }
}