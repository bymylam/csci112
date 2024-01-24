import java.util.Scanner;

public class EmailAccount {
    //FIELD
    private String name;
    private int age;
    private String userName;
    private String passWord;

    //CONSTRUCTOR
    public EmailAccount() {
        name = "";
        age = 0;
        userName = "";
        passWord = "";
    }
    public EmailAccount(String name, int age, String userName, String passWord) {
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.passWord = passWord;
    }

    //BEHAVIOR
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public void eighteenCheck(int age) {
        if (this.age <= 18) {
            System.out.println("You are not allowed to make an account.");
        } else {
            System.out.println("Welcome!!!!");
        }
    }

    public void printOut() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + userName + "@www.com");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password to reveal it.");
        String pass = scan.next();
        if (pass.equalsIgnoreCase(passWord)) {
            System.out.println("Password: " + passWord);
        } else {
            System.out.println("Password: XXXXX");
        }
    }

    public void reset() {
        name = "";
        age = 0;
        userName = "";
        passWord = "";
    }

    //COPY METHOD
    public EmailAccount copy() {
        return new EmailAccount(this.name, this.age, this.userName, this.passWord);
    }

    //EQUAL METHOD
//    public boolean equals(EmailAccount p) {
//        return ((p.getX() == this.x) && (p.getY() == this.y));
}
