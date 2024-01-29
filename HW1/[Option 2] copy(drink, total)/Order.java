import java.util.*;
public class Order {
    //milk tea
    private static final double black_milk_tea = 4.50;
    private static final double pearl_milk_tea = 5.25;
    private static final double oolong_milk_tea = 5.25;

    //winter melon tea
    private static final double winter_melon_tea = 5.25;
    private static final double winter_melon_lemon_tea = 5.50;

    //tax
    private static final double tax = 0.08;
    //--------------------------------------------

    //FIELD
    double total;
    String drink;

    //CONSTRUCTOR
    public Order() {
        total = 0;
        drink = "";
    }
    public Order(String drink, double total) {
        this.drink = drink;
        this.total = total;
    }

    //GETTER AND SETTER
    public void setTotal(double total) { this.total = total; }
    public void setDrink(String drink) { this.drink = drink; }

    //BEHAVIOR
    //receipt
    public double addTax() {
        return (total*tax)+total;
    }
    public static String printOutReceipt(Order o) {
        return "________________________________\n" +
                "Total: " + o.total + "\n" +
                "Tax: " + o.addTax() + "\n" +
                "________________________________";
    }
    // copy order
    public Order copy() {
        return new Order(this.drink, this.total);
    }

    public double askingForDrink(String drink) {
        if (this.drink.equalsIgnoreCase("Black Milk Tea")) {
            this.total += black_milk_tea;
        } else if (this.drink.equalsIgnoreCase("Pearl Milk Tea")) {
            this.total += pearl_milk_tea;
        } else if (this.drink.equalsIgnoreCase("Oolong Milk Tea")) {
            this.total += oolong_milk_tea;
        } else if (this.drink.equalsIgnoreCase("Winter Melon Tea")) {
            this.total += winter_melon_tea;
        } else if (this.drink.equalsIgnoreCase("Winter Melon Lemon Tea")) {
            this.total += winter_melon_lemon_tea;
        }
        return this.total;
    }
}