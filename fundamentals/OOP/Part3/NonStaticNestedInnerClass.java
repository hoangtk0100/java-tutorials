/**
 * Nested Non-static class (Inner class)
 */

class CPU {
    double price;
    String brandName;
    String version;

    // No-arg constructor
    public CPU() {};

    // Assign values using contructor
    public CPU(String brandName, String version) {
        this.brandName = brandName;
        this.version = version;
    }

    private String getBrandName() {
        return this.brandName;
    }

    public String getVersion() {
        return this.version;
    }

    // Nested class
    class Processor {
        // Members of nested class
        double cores;
        String manufacturer;

        double getCache() {
            return 4.4;
        }
    }

    // Protected nested class
    protected class RAM {
        // Members of protected nested class
        double memory;
        String memoryType;
        String manufacturer;

        double getClockSpeed() {
            return 6.0;
        }

        void setMemoryType() {
            //! Accessing Members of Outer Class within Inner Class
            // Access the brandName, version properties of CPU (outer class properties)
            if(CPU.this.brandName.equals("Mac")) {
                // Invoking the method getVersion of CPU
                switch(CPU.this.getVersion()) {
                    case "M1": this.memoryType = "Standard";
                    case "M1 Max": this.memoryType = "Medium";
                    case "M1 Ultra": this.memoryType = "Premium";
                }
            } else if(CPU.this.brandName.equals("Intel")) {
                switch(CPU.this.getVersion()) {
                    case "i5": this.memoryType = "Standard";
                    case "i7": this.memoryType = "Medium";
                    case "i9": this.memoryType = "Premium";
                }
            } else {
                this.memoryType = "Standard";
            }
        }

        String getMemoryType() {
            return this.memoryType;
        }
    }
}

public class NonStaticNestedInnerClass {
    public static void main(String[] args) {
        // Create a object of outer class CPU
        CPU cpu = new CPU("Mac", "M1 Max");
        
        // Create an object of inner class Processor using outer class CPU
        CPU.Processor processor = cpu.new Processor();

        // Create an object of inner class RAM using outer class CPU
        // CPU.RAM ram = new CPU.RAM(); // error: an enclosing instance that contains CPU.RAM is required
        CPU.RAM ram = cpu.new RAM();

        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());

        ram.setMemoryType();
        System.out.println("Memory type: " + ram.getMemoryType());
        System.out.println("Version: " + cpu.getVersion()); // getVersion method of CPU class is public, so can be accessed
    }
}
