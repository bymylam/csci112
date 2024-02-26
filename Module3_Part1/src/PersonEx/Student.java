package PersonEx;

public class Student extends Person {
    private String college;
    private double gpa;

    //CONSTRUCTOR
    public Student(
                   String college, double gpa) {
//        super(name, age, address);
        this.college = college;
        this.gpa = gpa;
    }

    //BEHAVIOR
    public void sayHello() {
        //call the sayHello() method from Person class
        super.sayHello();
        System.out.println("My college is " + college + "." +
                "\nMy gpa is " + gpa + ".");
    }
}
