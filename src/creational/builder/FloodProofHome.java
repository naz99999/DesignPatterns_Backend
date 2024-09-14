package creational.builder;

public class FloodProofHome implements Builder {

    private Home home = new Home();
    @Override
    public void buildFloor() {
        this.home.floor=("10 feet above");
    }

    @Override
    public void buildRoof() {
        this.home.roof="light bamboo roof";
    }

    @Override
    public void buildWalls() {
        this.home.walls="thick wooden walls";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.home;
    }
}
