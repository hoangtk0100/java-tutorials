
/**
 * Reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.
 * 
 * There is a class in Java named Class that keeps all the information about objects and classes at runtime. 
 * The object of Class can be used to perform reflection. (get information about methods, fields, and constructors present in a class.)
 */
import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

class Dog extends Animal {
    public String type;

    private String color;

    public Dog() {}

    private Dog(int age) {}

    public void display() {
        System.out.println("I am a dog");
    }
}

public class Reflection {
    public static void main(String[] args) {
        // /**
        // * Using forName()
        // *
        // * create object of Class
        // * to reflect the Dog class
        // */
        // Class a = Class.forName("Dog");

        // /**
        // * Using getClass()
        // *
        // * create object of Class
        // * to reflect Dog
        // */
        // Dog dog = new Dog();
        // Class b = dog.getClass();

        // /**
        // * Using .class
        // *
        // * create object of Class
        // * to reflect the Dog class
        // */
        // Class c = Dog.class;

        try {
            // create an object of Dog
            Dog dog = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = dog.getClass();

            // get name of the class
            String name = obj.getName();
            System.out.println("Name: " + name);

            // get the access modifier of the class
            int modifier = obj.getModifiers();

            // convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());

            // get the fields of Dog
            System.out.println("Fields: " + superClass.getFields());

            // get all the declared methods of Dog
            Method[] methods = obj.getDeclaredMethods();

            // create an object of the Method class
            for (Method m : methods) {

                // get names of methods
                System.out.println("Method Name: " + m.getName());

                // get the access modifier of methods
                int methodModifier = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(methodModifier));

                // get the return types of method
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }

            /**
             ** Access and modify PUBLIC fields
             */
            // Access and set the public field value
            Field typeField = obj.getField("type");
            typeField.set(dog, "labrador");

            // Get value of field type
            String typeValue = (String) typeField.get(dog);
            System.out.println("Type value: " + typeValue);

            /**
             ** Access and modify PRIVATE fields
             */
            // Access
            Field colorField = obj.getDeclaredField("color");

            // Allow to modify
            colorField.setAccessible(true);

            // Set the value of color
            colorField.set(dog, "orange");

            // Get value of field type
            String colorValue = (String) colorField.get(dog);
            System.out.println("Color value: " + colorValue);

            /**
             ** Get constructors
             */
            // get all constructors of Dog
            Constructor[] constructors = obj.getDeclaredConstructors();

            for (Constructor item : constructors) {

                // get the name of constructors
                System.out.println("Constructor Name: " + item.getName());

                // get the access modifier of constructors
                // convert it into string form
                int itemModifier = item.getModifiers();
                String itemMod = Modifier.toString(itemModifier);
                System.out.println("Modifier: " + itemMod);

                // get the number of parameters in constructors
                System.out.println("Parameters: " + item.getParameterCount());
                System.out.println("");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
