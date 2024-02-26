package HW5;

public class Textbook extends Book {
    String subjectTextbook;

    //CONSTRUCTOR
    public Textbook(String title, String subjectTextbook) {
        super(title);
        this.subjectTextbook = subjectTextbook;
    }
}
