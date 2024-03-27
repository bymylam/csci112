public class BusinessMain {
    public static void main( String[] args ) {

        String nameRestaurant = "Sabrina's";
        String nameCoffeeShop = "Elixr";
        String nameBookstore = "Barnes and Noble";
        String decor = "modern";

        String restaurantAddress = "123 Broadway";
        String coffeeShopAddress = "456 Ben Franklin Pkwy";
        String bookstoreAddress = "789 Market St";

        Business[] businesses = {
                new Restaurant(nameRestaurant, restaurantAddress),
                new CoffeeShop(nameCoffeeShop, restaurantAddress, decor),
                new Bookstore(nameBookstore, restaurantAddress),
        };

        for( Business b : businesses ) {
            System.out.println(b);

            if(b instanceof SellsFood ) {
                SellsFood sf = (SellsFood)b;
                sf.foodType();
            }

            if(b instanceof SellsBooks ) {
                SellsBooks sb = (SellsBooks)b;
                sb.bookType();
            }

        }

    }
}