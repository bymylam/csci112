public class Cookbook extends Book implements toStringInterface{
    //constructor
    public Cookbook(String title) {
        super(title);
    }
    
    //behavior
    public String toString() {
        return "COOKBOOK\n" + super.toString();
    }
}