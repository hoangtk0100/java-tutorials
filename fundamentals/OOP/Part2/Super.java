/**
 * The super keyword in Java is used in subclasses to access superclass members 
 * (attributes, constructors and methods).
 * 
 * Uses of super keyword
 *  1. To call methods of the superclass that is overridden in the subclass.
 *  2. To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.
 *  3. To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.
 */

class Animal {
    protected String name = "animal";

    // default or no-arg constructor
    Animal() {
      System.out.println("Type: animal");
    }
  
    // parameterized constructor
    Animal(String type) {
      System.out.println("Type: "+type);
    }

    public void display() {
        System.out.println("Im an animal");
    }
  }
  
  class Dog extends Animal {
  
    // default constructor
    Dog() {
  
      // calling parameterized constructor of the superclass
      super("Animal");
  
      System.out.println("I am a dog");
    }
    
    // parameterized constructor
    Dog(String name) {
  
      // calling parameterized constructor of the superclass
      super("Animal");
  
      System.out.println("I am a dog: " + name);
    }
    
    @Override
    public void display() {
        super.display();
        
        System.out.println("I am a dog");
    }
  }
  
class Super {
    public static void main(String[] args) {
      Dog dog1 = new Dog("Husky");
      dog1.display();
    }
  }