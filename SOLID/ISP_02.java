package SOLID;

/**
 * 👇 Split interface into TaskWorker and BreakTaker.
 * Originally, Robot was forced to implement `rest()` which made no sense.
 */
interface TaskWorker {
    void work();
}

interface BreakTaker {
    void rest();
}

class Engineer implements TaskWorker, BreakTaker {
    public void work() {
        System.out.println("Engineer working.");
    }

    public void rest() {
        System.out.println("Engineer taking a break.");
    }
}

class Machine implements TaskWorker {
    public void work() {
        System.out.println("Machine working non-stop.");
    }
}

public class ISP_02 {
    public static void main(String[] args) {
        new Engineer().work();
        new Machine().work(); // No forced rest()
    }
}
