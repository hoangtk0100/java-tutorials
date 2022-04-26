/**
 * Abstraction is an important concept of object-oriented programming 
 * that allows us to hide unnecessary details and only show the needed information.
 * 
 * This allows us to manage complexity by omitting or hiding details with a simpler, higher-level idea.
 */

/**
 * Key Points to Remember
 * 
 * - We use the abstract keyword to create abstract classes and methods.
 * - An abstract method doesn't have any implementation (method body).
 * - A class containing abstract methods should also be abstract.
 * - We cannot create objects of an abstract class.
 * - To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
 * - A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
 * - We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example
 *      Animal.staticMethod();
*/

abstract class Motorbike {
    abstract void brake();
}

class SportBike extends Motorbike {
    @Override
    public void brake() {
        System.out.println("SportBike brake");
    }
}

class MountainBike extends Motorbike {
    @Override
    public void brake() {
        System.out.println("MountainBike brake");
    }
}

public class Abstraction {
   public static void main(String[] args) {
       SportBike sportBike = new SportBike();
       sportBike.brake();

       MountainBike mountainBike = new MountainBike();
       mountainBike.brake();
   }
}
