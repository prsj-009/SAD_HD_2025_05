package SOLID;

/**
 * 👇 Originally, one big interface included scan and fax methods.
 * We now separate functionality for simpler printers.
 */
interface PrintService {
    void print();
}

/**
 * 👇 This printer only implements what it actually supports.
 * No need to throw UnsupportedOperationException anymore.
 */
class InkjetPrinter implements PrintService {
    public void print() {
        System.out.println("Print job running.");
    }
}

public class ISP_01 {
    public static void main(String[] args) {
        InkjetPrinter printer = new InkjetPrinter();
        printer.print();
    }
}
