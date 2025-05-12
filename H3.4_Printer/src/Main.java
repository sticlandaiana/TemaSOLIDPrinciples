public class Main {
    public static void main(String[] args) {

        MyPrinter myPrinter = new MyPrinter();
        myPrinter.print();

        MyFullyFunctionalPrinter mySmartPrinter = new MyFullyFunctionalPrinter();
        mySmartPrinter.print();
        mySmartPrinter.scan();
        mySmartPrinter.fax();
    }
}