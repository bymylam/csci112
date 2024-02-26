package PersonEx;

public class Person {
    private String name;
    private int age;
    private String address;

    //DEFAULT CONSTRUCTOR
    public Person() {
        name = "";
        age = 0;
        address = "";
    }

    //CONSTRUCTOR
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //BEHAVIOR
    public void sayHello() {
        System.out.println("My name is " + name + "." +
                "\nI am " + age + " years old." +
                "\nI live at " + address + ".");
    }
}