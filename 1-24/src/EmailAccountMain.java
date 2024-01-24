public class EmailAccountMain {
    public static void main(String[] args) {
        //USER 1
        EmailAccount user1 = new EmailAccount("My",20,"mylam","12345");
        user1.eighteenCheck(18);
        user1.printOut();

        //USER 2
        EmailAccount user2 = new EmailAccount();
        user2 = user1.copy();
        user2.printOut();

        if (user2 == user1) {
            user2.reset();
        }
    }
}
