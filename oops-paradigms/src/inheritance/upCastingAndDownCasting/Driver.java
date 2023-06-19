package inheritance.upCastingAndDownCasting;

public class Driver {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.startup();
        machine.shutDown();
        Laptop laptop = new Laptop();
        laptop.startup();
        laptop.doProgramming();
        laptop.shutDown();

        Printer printer = new Printer();
        printer.startup();
        printer.print();
        printer.shutDown();


        Machine laptop1 = new Laptop();
        laptop1.startup();
        laptop1.shutDown();


        Machine printer1 = new Printer();
        printer1.startup();
        printer1.shutDown();


        Laptop laptop2 = (Laptop) new  Machine();
        laptop2.startup();
        laptop2.doProgramming();
        laptop2.shutDown();


    }
}
