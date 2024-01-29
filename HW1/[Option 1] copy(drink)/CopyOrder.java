import java.util.*;
public class CopyOrder {
    private static final double tax = 0.08;
    double total;
    String drink;

    //BEHAVIOR
    //add tax
    public double addTax() {
        return (total*tax)+total;
    }
    public void copy(Order sourceOrder) {
        this.drink = sourceOrder.drink;
        this.total = sourceOrder.total;
    }
    public static void printOutReceipt(CopyOrder o) {
        System.out.println("________________________________\n" +
                "ORDER 2 is the same as ORDER 1\n" +
                "Total: " + o.total + "\n" +
                "Tax: " + o.addTax() + "\n" +
                "________________________________");
    }
}
