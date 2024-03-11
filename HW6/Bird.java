public class Bird extends Pet implements CanFly {
    //CONSTRUCTOR
    public Bird(String name, int age) {
        super(name, age);
    }
    public void fly() {
        System.out.println(super.getName() + " flew around the room");
    }
}
