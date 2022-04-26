class ObjectInsideClass {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Light On? " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Light On? " + isOn);
    }

    public static void main(String[] args) {
        ObjectInsideClass led = new ObjectInsideClass();

        led.turnOn();
    }
}