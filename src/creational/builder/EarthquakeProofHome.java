package creational.builder;

public class EarthquakeProofHome implements Builder {

    private Home home = new Home();
    @Override
    public void buildFloor() {
        this.home.floor="steel rod floor";
    }

    @Override
    public void buildRoof() {
        this.home.roof="compact stainless roof";
    }

    @Override
    public void buildWalls() {
        this.home.walls="thick concrete walls";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.home;
    }
}
