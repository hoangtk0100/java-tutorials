class Constructor {
    String language;

    public Constructor(String input) {
        language = input;
        System.out.println(language + " programming language");
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Constructor python = new Constructor("Python");
        Constructor java = new Constructor("Java");
    }
}