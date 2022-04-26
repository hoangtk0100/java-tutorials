/**
 * Types of Constructor
    In Java, constructors can be divided into 3 types:

    - No-Arg Constructor
    - Parameterized Constructor
    - Default Constructor
 */

class Constructors {
    /**
     * No-Arg constructor
    */
    int value;

    public Constructors() {
        value = 10;
        System.out.println("Constructor is called");
    }
}

public class NoArgConstructor {
    public static void main(String[] args) {
        Constructors noArgConstructor = new Constructors();
        System.out.println("Value = " + noArgConstructor.value);
    }
}