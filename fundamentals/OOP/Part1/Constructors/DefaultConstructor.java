class Constructor {
    int a;
    String b;
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        System.out.println("A = " + constructor.a);
        System.out.println("B = " + constructor.b);
    }
}