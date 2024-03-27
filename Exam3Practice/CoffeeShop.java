public class CoffeeShop extends Business implements SellsFood {
    //FIELDS
    private String decor;

    //CONSTRUCTOR
    public CoffeeShop(String name, String address, String decor) {
        super(name, address);
        this.decor = decor;
    }

    //BEHAVIOR
    public String toString() {
        return super.getName() + " has a modern decor.";
    }

    public void foodType() {
        System.out.println(super.getName() + " sells pastries.");
    }
}
