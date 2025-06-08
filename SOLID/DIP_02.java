package SOLID;

/**
 * 👇 Generalized notification mechanism
 */
interface AlertSystem {
    void sendAlert();
}

/**
 * 👇 Concrete email or SMS notification
 */
class SMSNotifier implements AlertSystem {
    public void sendAlert() {
        System.out.println("Sending SMS...");
    }
}

/**
 * 👇 Employee now depends on abstraction (AlertSystem).
 */
class Person {
    private final AlertSystem notifier;

    public Person(AlertSystem notifier) {
        this.notifier = notifier;
    }

    public void notifyPerson() {
        notifier.sendAlert(); // works for any AlertSystem
    }
}

public class DIP_02 {
    public static void main(String[] args) {
        Person p = new Person(new SMSNotifier());
        p.notifyPerson();
    }
}
