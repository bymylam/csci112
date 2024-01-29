public class Order {
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
        return this.dressCount + this.shirtCount + this.pantsCount + this.suitCount;
    }
}
