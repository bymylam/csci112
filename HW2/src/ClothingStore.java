public class ClothingStore {
    //FIELDS
    //total remaining inventory
    int dresses;
    int shirts;
    int pants;
    int suits;

    //item prices
    public static final double DRESSES_PRICE = 35;
    public static final double SHIRTS_PRICE = 22;
    public static final double PANTS_PRICE = 22.5;
    public static final double SUITS_PRICE = 50;

    int returnedOrders;
    double totalSales;

    //CONSTRUCTOR
    public ClothingStore() {
        dresses = 22;
        shirts = 68;
        pants = 74;
        suits = 99;
        totalSales = 0;
    }

    //METHODS
    public String toString() {

        return "Dresses sold: " + (22-dresses) + "\n" +
                //................
                "The number of returned orders: " + returnedOrders + "\n" +
                "Total sales: " + totalSales;
    }

    public void processOrder(Order order) {
        dresses -= order.getDressCount();
        shirts -= order.getShirtCount();
        pants -= order.getPantsCount();
        suits -= order.getSuitCount();

        //total price for each
        double priceDresses = order.getDressCount()*DRESSES_PRICE;
        double priceShirts = order.getShirtCount()*SHIRTS_PRICE;
        double pricePants = order.getPantsCount()*PANTS_PRICE;
        double priceSuits = order.getSuitCount()*SUITS_PRICE;
        totalSales += priceDresses + priceShirts + pricePants + priceSuits;
    }

}
