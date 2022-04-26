enum Size {
    // enum constants calling the enum constructors 
   SMALL("The size is small."),
   MEDIUM("The size is medium."),
   LARGE("The size is large."),
   EXTRALARGE("The size is extra large.");

    private final String pizzleSize;

    // Private enum constructor
    private Size(String pizzleSize) {
        this.pizzleSize = pizzleSize;
    }

    public String getSize() {
        return this.pizzleSize;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        // Can not access to the Size constructor from outside the class
        // Use enum constant SMALL to call the constructor Size with string as an argument
        Size size = Size.SMALL; 
        System.out.println(size.getSize());
    }
}
