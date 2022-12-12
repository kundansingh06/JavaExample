package singaltonex;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonLazyInstantiation object = SingletonLazyInstantiation.getInstance();
        object.showMessage();

    }
}
