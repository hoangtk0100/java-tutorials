class Constructor {
    String language;

    public Constructor() {
        this.language = "Java";
    }
    
    public Constructor(String language) {
        this.language = language;
    }
    
    public void getName() {
        System.out.println("Programming language: " + this.language);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Constructor noArgConstructor = new Constructor();
        noArgConstructor.getName();
        
        Constructor paramConstructor = new Constructor("Golang");
        paramConstructor.getName();
    }
}