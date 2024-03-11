abstract public class Pet {
    private String name;
    private int age;

    //CONSTRUCTOR
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //METHOD
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
