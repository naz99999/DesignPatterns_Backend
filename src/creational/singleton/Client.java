package creational.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingletonInstance();
        Singleton singleton2 = Singleton.getSingletonInstance();
    }
}
