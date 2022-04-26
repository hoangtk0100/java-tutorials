// Abstract can be applied for class, method, not for fields
// Cannot create objects of abstract classes

abstract class Language {
    // Abstract method
    abstract void abstractMethod();

    // Regular method
    public void display() {
        System.out.println("Hello");
    }
}

public class Abstract extends Language {
    // Must override all the abstract method
    // Provide implementation of abstract method
    // Not provide implementation of abstract method, the class extend the abstract class should also be declared as a abstract
    @Override
    public void abstractMethod() {
        System.out.println("This is an abstract method");
    }

    public static void main(String[] args) {
        // Can not create object of an abstract class
        Abstract object = new Abstract();

        // Access method of abstract class
        // Using object of Abstract class
        object.display();
        object.abstractMethod();
    }
    
}
