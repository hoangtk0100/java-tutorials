/**
 ** An anonymous class must be defined inside another class. 
 * Hence, it is also known as an anonymous inner class
 * A nested class that doesn't have any name is known as an anonymous class.
 * 
 * class outerClass {

    // defining anonymous class
    object1 = new Type(parameterList) { // Type: superclass or interface
         // body of the anonymous class
    };
}
 */

class Polygon {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo {
    public void createClass() {
        // Creation of anonymous class extending class Polygon
        Polygon polygon = new Polygon() {
            public void display() {
                System.out.println("Inside the anonymous class");
            }
        };

        polygon.display();
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        AnonymousDemo demo = new AnonymousDemo();
        demo.createClass();
    }
}