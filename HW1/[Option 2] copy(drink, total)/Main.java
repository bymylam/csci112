import java.util.*;

public class Main {
    public static void moreDrink(Scanner scan, String response, Order order) {
        //how to chang 'Order order1' into general order, so I can use it again afterward
        if ((response.equalsIgnoreCase("yes")) || (response.equalsIgnoreCase("no"))) {
            while (response.equalsIgnoreCase("yes")) {
                System.out.println("What would you like?");
                String drinkN = scan.nextLine();
                order.askingForDrink(drinkN);
                System.out.println("Anything else? [YES] or [NO]");
                response = scan.nextLine();
            }
        } else {
            System.out.println("Invalid response.");
        }
    }

    public static double getPriceFromDrink(String orderResponse) {
        int total = 0;

        double black_milk_tea = 4.50;
        double pearl_milk_tea = 5.25;
        double oolong_milk_tea = 5.25;

        //winter melon tea
        double winter_melon_tea = 5.25;
        double winter_melon_lemon_tea = 5.50;

        if (orderResponse.equalsIgnoreCase("Black Milk Tea")) {
            total += black_milk_tea;
        } else if (orderResponse.equalsIgnoreCase("Pearl Milk Tea")) {
            total += pearl_milk_tea;
        } else if (orderResponse.equalsIgnoreCase("Oolong Milk Tea")) {
            total += oolong_milk_tea;
        } else if (orderResponse.equalsIgnoreCase("Winter Melon Tea")) {
            total += winter_melon_tea;
        } else if (orderResponse.equalsIgnoreCase("Winter Melon Lemon Tea")) {
            total += winter_melon_lemon_tea;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO OUR BUBBLE TEA SHOP!!");
        System.out.println("______________MENU______________");
        System.out.println("|***********Milk Tea***********|");
        System.out.println("| Black Milk Tea: 4.50         |");
        System.out.println("| Pearl Milk Tea: 5.25         |");
        System.out.println("| Oolong Milk Tea: 5.25        |");
        System.out.println("|______________________________|");
        System.out.println("|*******Winter Melon Tea*******|");
        System.out.println("| Winter Melon Tea: 5.25       |");
        System.out.println("| Winter Melon Lemon Tea: 5.50 |");
        System.out.println("|______________________________|");
        System.out.println();

        System.out.println("ORDER 1");
        System.out.println("Hello. What would you like today?");
        String order1Response = scan.nextLine();

        //creating and asking customers a new order object named order1
        Order order1 = new Order();
        order1.setDrink(order1Response);
        order1.setTotal(getPriceFromDrink(order1Response));
        order1.askingForDrink(order1Response);

        //more drinks?
        System.out.println("Anything else? [YES] or [NO]");
        String responseForMoreDrink1 = scan.nextLine();
        moreDrink(scan, responseForMoreDrink1, order1);

        //PRINT OUT RECEIPT
        System.out.println(Order.printOutReceipt(order1));
        System.out.println();

        //------------------------------------------
//        System.out.println("ORDER  2");
//        System.out.println("Hello. What would you like today?\n" +
//                "(Option: Copy Previous Order)");
//        String order2Response = scan.nextLine();
//        if (order2Response.equalsIgnoreCase("Copy Previous Order")) {
//            //COPY ORDER
//            CopyOrder order2a = new CopyOrder();
//            order2a.copy(order1);
//
//            //PRINT OUT RECEIPT (use the method from class CopyOrder)
//            CopyOrder.printOutReceipt(order2a);
//        } else {
//            //creating and asking customers a new order object named order2b
//            Order order2b = new Order(order2Response);
//            order2b.askingForDrink(order2Response);
//
//            //more drinks?
//            System.out.println("Anything else? [YES] or [NO]");
//            String responseForMoreDrink2 = scan.nextLine();
//            moreDrink(scan, responseForMoreDrink2, order2b);
//
//            //PRINT OUT RECEIPT
//            System.out.println(Order.printOutReceipt(order2b));
//            System.out.println();
//        }

        //COPY ORDER
        System.out.println("ORDER 2 IS THE SAME AS ORDER1");
        Order order2 = order1.copy();

        //PRINT OUT RECEIPT (use the method from class CopyOrder)
        System.out.println(Order.printOutReceipt(order2));
    }
}