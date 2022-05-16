public class Printer {

    // instance properties (variables)
    String name;
    int age;

    // no argumanent constructor
    public Printer() {

    }

    // alternative constructor ('overloaded')


    public Printer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     *  method - no longer static
     *  can be only called by an object
     */
    public void getHello_world() {

        System.out.println("Hello world");
    }

    public void printDetails(){

        System.out.println("Name = " + this.name + " Age = " + this.age);
    }
}