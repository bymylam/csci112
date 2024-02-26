package HW5;
import java.util.*;

public class Novel extends Book {
    ArrayList<String> characters;

    //CONSTRUCTOR
    public Novel(String title, ArrayList<String> characters) {
        super(title);
        this.characters = characters;
    }
}
