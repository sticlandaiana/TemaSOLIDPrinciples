import java.util.List;

public class CoffeeLover {
    private List<CoffeeMachine> coffeMachines;

    public CoffeeLover(List<CoffeeMachine> coffeMachines) {
        this.coffeMachines = coffeMachines;
    }

    public void makeCoffe() {
        coffeMachines.forEach(cm -> cm.start());
    }
}
