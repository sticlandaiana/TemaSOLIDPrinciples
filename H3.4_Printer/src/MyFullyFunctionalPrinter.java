public class MyFullyFunctionalPrinter implements MultifunctionalPrinter{

    @Override
    public void print(){
        System.out.println("My fully functional printer is printing :)");
    }

    @Override
    public void scan(){
        System.out.println("Of course my fully functional printer has a scanner :)");
    }

    @Override
    public void fax(){
        System.out.println("Of course my fully functional printer has a fax :)");
    }
}
