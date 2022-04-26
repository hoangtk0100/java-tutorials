/**
 * Annotations can be created by using @interface followed by the annotation name.
 * The annotation can have elements that look like methods but they do not have an implementation.
 * The default value is optional. The parameters cannot have a null value.
 * The return type of the method can be primitive, enum, string, class name or array of these types.
 */

@interface MyAnnotation {
    String value() default "default value";
}

public class CustomAnnotation {
    public static void main(String[] args) {
        @MyAnnotation()
        CustomAnnotation obj = new CustomAnnotation();
        obj.method();
    }
}
