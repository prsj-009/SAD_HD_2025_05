package SOLID;

/**
 * 👇 We introduce an interface so that Switch works with any Device, not just LightBulb.
 */
interface Device {
    void on();
    void off();
}

/**
 * 👇 Lamp is a concrete implementation of the Device interface.
 */
class Lamp implements Device {
    public void on() {
        System.out.println("Lamp lit.");
    }

    public void off() {
        System.out.println("Lamp dark.");
    }
}

/**
 * 👇 Switch now depends on abstraction (Device), not a specific Lamp class.
 */
class Toggle {
    private final Device dev;

    public Toggle(Device dev) {
        this.dev = dev;
    }

    public void press() {
        dev.on(); // Abstraction call
    }
}

public class DIP_01 {
    public static void main(String[] args) {
        Device l = new Lamp();
        Toggle t = new Toggle(l);
        t.press();
    }
}


