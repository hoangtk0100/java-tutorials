/**
 ** Polymorphism is an important concept of object-oriented programming. It
 * simply means more than one form.
 * 
 * That is, the same entity (method or operator or object) can perform different
 * operations in different scenarios.
 */
class Polygon {

    // method to render a shape
    public void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square extends Polygon {

    // renders Square
    public void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle extends Polygon {

    // renders circle
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // create an object of Square
        Square s1 = new Square();
        s1.render();

        // create an object of Circle
        Circle c1 = new Circle();
        c1.render();
    }
}

/**
 ** We can achieve polymorphism in Java using the following ways:
 * 
 * 1. Method Overriding (run-time polymorphism)
 * 2. Method Overloading
 * 3. Operator Overloading
 * + operator is overloaded to perform numeric addition as well as string
 * concatenation, and
 * operators like &, |, and ! are overloaded for logical and bitwise operations.
 */

/**
 ** Polymorphic Variables (upcasting)
 */
class ProgrammingLanguage {
    public void display() {
        System.out.println("I am Programming Language.");
    }
}

class Java extends ProgrammingLanguage {
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language.");
    }
}

class Main {
    public static void main(String[] args) {

        // declare an object variable
        ProgrammingLanguage pl;

        // create object of ProgrammingLanguage
        pl = new ProgrammingLanguage();
        pl.display();

        // create object of Java class
        pl = new Java();
        pl.display();
    }
}