package SOLID;

/**
 * 👇 Instead of having a base class `Bird` with fly(), we define capability interfaces.
 */
interface Flyer {
    void fly();
}

/**
 * 👇 Common superclass for all birds, regardless of flight.
 */
class Animal {}

/**
 * 👇 A flying animal (conforms to LSP).
 */
class Falcon extends Animal implements Flyer {
    public void fly() {
        System.out.println("Falcon soars high.");
    }
}

/**
 * 👇 Non-flying animal. Now doesn't override fly() it can't do.
 */
class Ostrich extends Animal {
    void walk() {
        System.out.println("Ostrich walks.");
    }
}

public class LSP_02 {
    public static void main(String[] args) {
        Flyer f = new Falcon();
        f.fly(); // Works as expected

        new Ostrich().walk(); // No LSP violation
    }
}
