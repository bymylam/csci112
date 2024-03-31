//Case 1: Using normal datatype Array
public class Novel extends Book implements toStringInterface {
    String[] characters;
    
    //constructor
    public Novel(String title, String[] characters) {
        super(title);
        this.characters = characters;
    }
    
    //behavior
    public String toString() {
        String result = "NOVEL\n" + super.toString();
        for (int i = 0; i < characters.length; i++) {
            result += "\nCharacter " + (i+1) + ": " + characters[i];
        }
        return result;
    }
}

/*Case 2: Using ArrayList
import java.util.*;

public class Novel extends Book {
    ArrayList<String> characters;
    
    //constructor
    public Novel(String title, ArrayList<String> characters) {
        super(title);
        this.characters = characters;
    }
    
    //behavior
    public String toString() {
        String result = super.toString() + "\n";
        for (int i = 0; i < characters.size(); i++) {
            result += "Character " + (i+1) + ": " + characters.get(i) + "\n";
        }
        return result;
    }
}
*/