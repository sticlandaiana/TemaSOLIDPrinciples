public class Main {
    public static void main(String[] args) {
        //User uses some Coffee Machines,
        // delivered (injected) from outside
        // world and make it run
        CoffeeLover user = new CoffeeLover();
        user.makeCoffee();
    }
}