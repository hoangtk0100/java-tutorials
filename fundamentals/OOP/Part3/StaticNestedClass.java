/**
 ** Static nested classes are not called static inner classes.
 * 
 * Unlike inner class, a static nested class cannot access the member variables of the outer class. 
 * It is because the static nested class doesn't require you to create an instance of the outer class.
 * OuterClass.NestedClass obj = new OuterClass.NestedClass();
 * 
 * The outer class cannot be referenced using OuterClass.this
 */

/**
 ** Key Points to Remember
 * Java treats the inner class as a regular member of a class. They are just
 * like methods and variables declared inside a class.
 * Since inner classes are members of the outer class, you can apply any access
 * modifiers like private, protected to your inner class which is not possible
 * in normal classes.
 * Since the nested class is a member of its enclosing outer class, you can use
 * the dot (.) notation to access the nested class and its members.
 * Using the nested class will make your code more readable and provide better
 * encapsulation.
 * Non-static nested classes (inner classes) have access to other members of the
 * outer/enclosing class, even if they are declared private.
 */

 //! Static Top-level Class: CAN NOT
 //! static class MotherBoard: CAN NOT
class MotherBoard {
    String model;

    public MotherBoard(String model) {
        this.model = model;
    }

    // static nested class
    static class USB {
        int usb2 = 2;
        int usb3 = 1;

        int getTotalPorts() {
            // accessing the variable model of the outer class
            // if (MotherBoard.this.model.equals("MSI")) { //! error: non-static variable this cannot be referenced from a static context
            //     return 4;
            // }

            return usb2 + usb3;
        }
    }

    public String getModel() {
        return this.model;
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {

        // create an object of the static nested class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());

        System.out.println("Model: " + usb.getModel()); //! error: cannot find symbol getModel() 
    }
}

/**
 ** Note: In Java, only nested classes are allowed to be static.
 * 
 * Like regular classes, static nested classes can include both static and non-static fields and methods. For example,
 * Class Animal {
    static class Mammal {
        // static and non-static members of Mammal
    }
    
    // members of Animal
} 
 */