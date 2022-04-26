enum Size {
    SMALL {
        // Override toString()
        public String toString() {
            return "This size is small";
        }
    },
    
    MEDIUM {
        // Override toString()
        public String toString() {
            return "This size is medium";
        }
    }
}

public class EnumString {
    public static void main(String[] args) {
        System.out.println(Size.MEDIUM.toString());
        System.out.println(Size.MEDIUM.name()); // can not override name(), bz name() is final
    }
}
