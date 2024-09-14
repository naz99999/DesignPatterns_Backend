package creational.singleton;

public class Pop {
    private static Pop pop = new Pop();
    private Pop() {}

    public static Pop getPop() {return pop;}
}
