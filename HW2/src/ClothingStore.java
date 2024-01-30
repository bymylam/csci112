public class ClothingStore {
    //ITEMS INVENTORY
    public static final int DRESSES_INVENTORY = 24;
    public static final int SHIRTS_INVENTORY = 65;
    public static final int PANTS_INVENTORY = 87;
    public static final int SUITS_INVENTORY = 22;

    //FIELDS
    private int dresses;
    private int shirts;
    private int pants;
    private int suits;

    int returnedOrders;
    double totalSales;

    //CONSTRUCTOR
    public ClothingStore() {
        dresses = DRESSES_INVENTORY;
        shirts = SHIRTS_INVENTORY;
        pants = PANTS_INVENTORY;
        suits = SUITS_INVENTORY;
        returnedOrders = 0;
        totalSales = 0;
    }

    //METHODS
    public void processOrder(Order order) {
        //case1: the order can be fulfilled
        if ((dresses < order.getDressCount())
        && (shirts < order.getShirtCount())
        && (pants < order.getPantsCount())
        && (suits < order.getSuitCount())) {
            dresses -= order.getDressCount();
            shirts -= order.getShirtCount();
            pants -= order.getPantsCount();
            suits -= order.getSuitCount();

            //total price for each
            totalSales += order.calculateTotal();
        } else {
            returnedOrders++;
        }
    }

    public String toString() {
        int dressesSold = DRESSES_INVENTORY-dresses;
        int shirtsSold = SHIRTS_INVENTORY-shirts;
        int pantsSold = PANTS_INVENTORY-pants;
        int suitsSold = SUITS_INVENTORY-suits;
        return "Dresses sold: " + dressesSold + "\n" +
                "Shirts sold: " + shirtsSold + "\n" +
                "Pants sold: " + pantsSold + "\n" +
                "Suits sold: " + suitsSold + "\n" +
                "The number of returned orders: " + returnedOrders + "\n" +
                "Total sales: " + totalSales;
    }

}
