public class SingletonTest {

    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.log("Application Started");
        l2.log("Application Running");

        System.out.println("Same Object? " + (l1 == l2));
    }
}