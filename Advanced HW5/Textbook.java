public class Textbook extends Book implements toStringInterface {
  String subject;

  //constructor
  public Textbook (String title, String subject)
  {
	super (title);
	this.subject = subject;
  }

  //behavior
  public String toString ()
  {
	return "TEXTBOOK\n" + super.toString() + "\n" + 
	    "Subject: " + subject;
  }
}
