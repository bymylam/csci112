public class Bookstore extends Business implements SellsBooks {
    //FIELDS are inherited from Business
    //CONSTRUCTOR
    public Bookstore(String name, String address) {
        super(name, address);
    }

    //BEHAVIOR
    //BEHAVIOR
    public String toString() { return super.toString(); }
    public void bookType() {
        System.out.println(super.getName() + " sells novels.");
    }
}
