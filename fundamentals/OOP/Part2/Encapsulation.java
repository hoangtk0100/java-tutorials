/** 
 ** Encapsulation
 * Encapsulation is one of the key features of object-oriented programming.
 * Encapsulation refers to the bundling of fields and methods inside a single class.
 * It prevents outer classes from accessing and changing fields and methods of a class. 
 * This also helps to achieve data hiding.
 */

 /**
  * Note: People often consider encapsulation as data hiding, but that's not entirely true.
  *
  * Encapsulation refers to the bundling of related fields and methods together. 
  * This can be used to achieve data hiding.
  * Encapsulation in itself is not data hiding.
  */

class Area {
    private int length;
    private int breadth;

    // Constructor to initialize values
    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }

    public void setLength(int length) {
        if(length > 0) {
            this.length = length;
        }
    }

    public int getLength() {
        return this.length;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Area area = new Area(4, 5);
        area.getArea();
        
        area.setLength(6);
        area.getArea();
    }
}
