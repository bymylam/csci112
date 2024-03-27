public abstract class Business {
    //FIELDS
    private String name;
    private String address;

    //CONSTRUCTOR
    public Business(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //BEHAVIOR
    public String toString() {
        return name + " is located at " + address;
    }
    public String getName() { return name; }
}
