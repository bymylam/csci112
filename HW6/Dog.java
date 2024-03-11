public class Dog extends Pet implements Walkable {
    //CONSTRUCTOR
    public Dog(String name, int age) {
        super(name, age);
    }
    //METHOD
    public void goForWalk(String location) {
        System.out.println(super.getName() + " walked to " + location);
    }
}
