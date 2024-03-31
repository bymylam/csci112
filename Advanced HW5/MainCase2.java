//Case 2: using POLYMORPHISM
//we can get the purpose of shorter and more productive codes
public class MainCase2
{
	public static void main(String[] args) {
		String[] charactersNovel1 = new String[]{"Jay Gatsby", "Tom Buchanan", "Daisy Buchanan"};
		Book[] book1 = {
		    new Novel("The Great Gatsby", charactersNovel1),
		    new Textbook("The Bible", "creation"),
		    new Cookbook("the Betty Crocker Cookbook"),
		    new ComputerScienceTextbook("Introduction to Computer Science Using Python", "CBSE Code 083"),
		    new BakingCookbook("Bread Machine")
		};
		for (Book b : book1) {
		    System.out.println(b + "\n");
		    if (b instanceof toStringInterface) {
		        toStringInterface bResult = (toStringInterface) b;
		        bResult.toString();
		    }
		}
	}
}