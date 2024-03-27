public class Restaurant extends Business implements SellsFood {
    //FIELDS are inherited from Business class
    //CONSTRUCTOR
    public Restaurant(String name, String address) {
        super(name, address);
    }

    //BEHAVIOR
    public String toString() { return super.toString(); }
    public void foodType() {
        System.out.println(super.getName() + " sells brunch.");
    }
}
