/**
 ** Enum class
 * special Java class with options
 * can have methods in Enum class
 * The compiler automatically create instances for each enum constants
 */
import java.lang.reflect.Field;

enum Size {
    SMALL,
    MEDIUM,
    LARGE,
    INVALID; // Default: public final static

    public String getSize() {
        return this.toString().toLowerCase();
    }
}

public class EnumClass {
    public static Enum getValidEnum(Class enumClass, String input) {
        Field[] fields = enumClass.getFields();
        for (Field fieldIndex : fields) {
            if (fieldIndex.getName().equalsIgnoreCase(input)) {
                return Enum.valueOf(enumClass, fieldIndex.getName());
            }
        }
    
        System.out.println("InvalidArgumentException: Invalid enum value");
        return Size.INVALID;
    }

    public static void main(String[] args) {
        System.out.println("Size: " + Size.SMALL);
        System.out.println("Size: " + Size.SMALL.getSize());

        System.out.println("compareTo: " + Size.SMALL.compareTo(Size.MEDIUM)); // return ordinal(SMALL) - ordinal(MEDIUM)
        System.out.println("valueOf SMALL: " + Size.valueOf("SMALL"));
        // System.out.println("valueOf small: " + Size.valueOf("small")); //! error: No enum constant Size.small
        System.out.println("values: " + Size.values());
        System.out.println("getValidEnum: " + getValidEnum(Size.class, "small"));
    }
}
