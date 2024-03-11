public class Cat extends Pet {
    private String favoriteFood;

    public Cat(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    public String toString() {
        return super.toString() + ", Favorite Food: " + this.favoriteFood;
    }
}
