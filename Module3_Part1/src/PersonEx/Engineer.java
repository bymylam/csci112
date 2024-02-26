package PersonEx;

public class Engineer extends Person {
    private String company;
    private int hoursPerWeek;

    //CONSTRUCTOR
    public Engineer(String name, int age, String address,
                    String company, int hoursPerWeek) {
        super(name, age, address);
        this.company = company;
        this.hoursPerWeek = hoursPerWeek;
    }

    //BEHAVIOR
    public void sayHello() {
        //call the sayHello() method from Person class
        super.sayHello();
        System.out.println("My company is " + company + "." +
                "\nMy hour per week is " + hoursPerWeek + " hours.");
    }
}
