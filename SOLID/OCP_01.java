package SOLID;

/**
 * 👇 Instead of using `if-else` on customer type, we use interfaces.
 * This allows extending discount logic without modifying existing code.
 */
interface CustomerType {
    double getDiscount(double total);
}

class BronzeCustomer implements CustomerType {
    public double getDiscount(double total) {
        return total * 0.05;
    }
}

class SilverCustomer implements CustomerType {
    public double getDiscount(double total) {
        return total * 0.15;
    }
}

/**
 * 👇 Uses polymorphism so we don't touch this class when new types are added.
 */
class BillProcessor {
    public double processDiscount(CustomerType type, double total) {
        return type.getDiscount(total);
    }
}

public class OCP_01 {
    public static void main(String[] args) {
        BillProcessor bp = new BillProcessor();
        System.out.println("Silver: " + bp.processDiscount(new SilverCustomer(), 150));
    }
}

