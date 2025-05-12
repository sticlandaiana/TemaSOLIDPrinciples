import java.util.List;

public class CoffeeLover {

    private List<CoffeeMachine> machines;

    public void setCoffeeMachines(List<CoffeeMachine> machines){
        this.machines = machines;
    }

    public void makeCoffee(){

        if(machines==null||machines.isEmpty()){
            System.out.println("We don't have coffee machines");
            return;
        }else{
            machines.forEach(cm -> cm.start());
        }
    }
}
