package SOLID;

/**
 * 👇 This class now only holds the employee ID.
 * Originally, it also handled salary, designation, and email!
 */
class Worker {
    int id;

    public Worker(int id) {
        this.id = id;
    }
}

/**
 * 👇 Class handles title responsibilities (SRP fix).
 */
class DesignationLogic {
    public String fetchTitle(int id) {
        return "Developer";
    }
}

/**
 * 👇 Class handles salary update logic.
 */
class Compensation {
    public void revisePay(int id) {
        
    }
}

/**
 * 👇 Class manages communication only.
 */
class Communication {
    public void dispatchMail() {
        
    }
}

public class SRP_02 {}
