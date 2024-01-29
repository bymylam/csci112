public class ClothingStoreMain {
    public static void testCase1() {
        System.out.println("Test Case 1:");
        ClothingStore shop = new ClothingStore();
        for (int i = 0; i < 8; i++) {
            shop.processOrder(new Order(4, 3, 12, 2));
        }
        System.out.println(shop);
    }
    public static void testCase2() {
        System.out.println("\nTest Case 2:");
        ClothingStore shop = new ClothingStore();
        for (int i = 0; i < 5; i++) {
            shop.processOrder(new Order(0, 30, 0, 5));
        }
        System.out.println(shop);
    }
    public static void testCase3() {
        System.out.println("\nTest Case 3:");
        ClothingStore shop = new ClothingStore();
        for (int i = 0; i < 30; i++) {
            shop.processOrder(new Order(1, 0, 2, 0));
        }
        System.out.println(shop);
    }
    public static void testCase4() {
        System.out.println("\nTest Case 4:");
        ClothingStore shop = new ClothingStore();
        for (int i = 0; i < 50; i++) {
            shop.processOrder(new Order(1, 1, 1, 1));
        }
        System.out.println(shop);
    }
    public static void testCase5() {
        System.out.println("\nTest Case 5:");
        ClothingStore shop = new ClothingStore();
        System.out.println(shop);
    }
    public static void testCase6() {
        System.out.println("\nTest Case 6:");
        ClothingStore shop = new ClothingStore();
        shop.processOrder(new Order(35, 60, 70, 30));
        System.out.println(shop);
    }
    public static void testCase7() {
        System.out.println("\nTest Case 7:");
        ClothingStore shop = new ClothingStore();
        shop.processOrder(new Order(36, 61, 71, 31));
        System.out.println(shop);
    }
    public static void testCase8() {
        System.out.println("\nTest Case 8:");
        ClothingStore shop = new ClothingStore();
        shop.processOrder(new Order(0, 0, 1, 0));
        shop.processOrder(new Order(1, 0, 0, 0));
        shop.processOrder(new Order(0, 1, 0, 0));
        shop.processOrder(new Order(0, 0, 0, 1));
        System.out.println(shop);
    }
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
        testCase6();
        testCase7();
        testCase8();
    }
}System.out.println("\nTest Case 8:");
        ClothingStore shop = new ClothingStore();
        shop.processOrder(new Order(0, 0, 1, 0));
        shop.processOrder(new Order(1, 0, 0, 0));
        shop.processOrder(new Order(0, 1, 0, 0));
        shop.processOrder(new Order(0, 0, 0, 1));
        System.out.println(shop);
        }
public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
        testCase6();
        testCase7();
        testCase8();
        }
        }
