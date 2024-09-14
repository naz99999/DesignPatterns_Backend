package creational.builder;

public class MainClient {

    public static void main(String[] args) {
        EarthquakeProofHome earthquakeProofHome = new EarthquakeProofHome();

        Director director = new Director(earthquakeProofHome);
        director.manageConstruction();
        Home home = director.getComplexObject();

        System.out.println(home.walls);
    }
}
