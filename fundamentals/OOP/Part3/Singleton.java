/**
 ** Singleton
 * 
 * Singleton is a design pattern that ensures that a class can only have one object.
 * 
 * To create a singleton class, a class must implement the following properties:
 * Create a private constructor of the class to restrict object creation outside of the class.
 * Create a private attribute of the class type that refers to the single object.
 * Create a public static method that allows us to create and access the object we created. Inside the method, we will create a condition that restricts us from creating more than one object.
 */

class Database {
    // Private field that refers to the object
    private static Database dbObject;

    private Database() {
        // Constructor of the Database class
    }

    public static Database getInstance() {
        // Create object if it's not already created
        if(dbObject == null) {
            dbObject = new Database();
        }

        // Returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database");
    }
}

public class Singleton {
    public static void main(String[] args) {
        Database db;

        // Refers to the only objet of Database
        db = Database.getInstance();
        db.getConnection();
    }
}
