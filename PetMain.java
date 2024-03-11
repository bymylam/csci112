public class PetMain {
    public static void main(String[] args) {
        Pet[] pets = {
                new Dog("Stevie", 10),
                new Cat("Sergio", 9, "salmon"),
                new Bird("Frank", 2)
        };

        for(Pet p : pets) {
            System.out.println(p);
            if(p instanceof Walkable) {
                ((Walkable) p).goForWalk("Magnuson Park");
            }
            if(p instanceof CanFly) {
                ((CanFly) p).fly();
            }
        }
    }
}