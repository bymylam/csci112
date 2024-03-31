public abstract class Book implements toStringInterface {
    String title;
    
    //constructor
    public Book(String title) {
        this.title = title;
    }
    
    //behavior
    public String toString() {
        return "Title: " + title;
    }
}