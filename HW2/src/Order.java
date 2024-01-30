public class Order {
    //item prices
    //These will never change, so they are 'static' and 'final'
    public static final double DRESSES_PRICE = 35;
    public static final double SHIRTS_PRICE = 22;
    public static final double PANTS_PRICE = 22.5;
    public static final double SUITS_PRICE = 50;

    //FIELDS
    private int dressCount;
    private int shirtCount;
    private int pantsCount;
    private int suitCount;

    //CONSTRUCTOR
    public Order(int dressCount, int shirtCount, int pantsCount, int suitCount) {
        this.dressCount = dressCount;
        this.shirtCount = shirtCount;
        this.pantsCount = pantsCount;
        this.suitCount = suitCount;
    }

    //METHODS
    public int getDressCount() { return dressCount; }
    public int getShirtCount() { return shirtCount; }
    public int getPantsCount() { return pantsCount; }
    public int getSuitCount() { return suitCount; }

    public double calculateTotal() {
        return (dressCount*DRESSES_PRICE) +
                (shirtCount*SHIRTS_PRICE) +
                (pantsCount*PANTS_PRICE) +
                (suitCount*SUITS_PRICE);
    }
}
