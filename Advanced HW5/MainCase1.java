//Case 1: traditional way with longer coding lines
//import java.util.*; //for Case B

public class MainCase1
{
	public static void main(String[] args) {
	    //NOVEL
	    //Case A: Using normal datatype Array
	    String[] charactersNovel1 = new String[]{"Jay Gatsby", "Tom Buchanan", "Daisy Buchanan"};
	    Book novel1 = new Novel("The Great Gatsby", charactersNovel1);
	    System.out.println(novel1.toString());
	    
	    /*Case B: Using ArrayList
	    ArrayList<String> charactersNovel1 = new ArrayList<String>();
	    charactersNovel1.add("Jay Gatsby");
	    charactersNovel1.add("Tom Buchanan");
	    charactersNovel1.add("Daisy Buchanan");
		Book novel1 = new Novel("The Great Gatsby", charactersNovel1);
		System.out.println(novel1.toString());
		*/
		
		//TEXTBOOK
		Book textbook1 = new Textbook("The Bible", "creation");
		System.out.println(textbook1.toString());
		
		//COOKBOOK
		Book cookbook1 = new Cookbook("the Betty Crocker Cookbook");
		System.out.println(cookbook1.toString());
		
		//COMPUTER SCIENCE TEXTBOOK 
		Book computerScienceTextbook1 = new ComputerScienceTextbook("Introduction to Computer Science Using Python", "CBSE Code 083");
		System.out.println(computerScienceTextbook1.toString());
		
		//BAKING COOKBOOK 
		Book bakingCookbook1 = new BakingCookbook("Bread Machine");
		System.out.println(bakingCookbook1.toString());
	}
}
