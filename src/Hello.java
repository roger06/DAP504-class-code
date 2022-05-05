public class Hello {

    public static void main(String[] args) {

        // object instantiated to call method.

        Printer myPrinter = new Printer();
        myPrinter.getHello_world();


        // second object calling a different constructor
        Printer myOtherPrinter = new Printer("Hello", 21);

        // we'll call a different method
        myOtherPrinter.printDetails();

    }

}

