package Methods.Lab;

public class BlankReceipt {
    public static void main(String[] args) {
        printReceipt();
    }

    private static void printReceipt() {
        printReceiptHeader();
        printReceiptBody();
        printReceiptFooter();
    }

    private static void printReceiptHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    private static void printReceiptBody() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    private static void printReceiptFooter() {
        System.out.println("------------------------------");
        System.out.println("© SoftUni");
    }
}
