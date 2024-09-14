package creational.builder;

public class Director {
    private Builder builder;

    public Director (Builder builderType) {
        this.builder = builderType;
    }

    public void manageConstruction() {
        this.builder.buildFloor();
        this.builder.buildRoof();
        this.builder.buildWalls();
    }

    public Home getComplexObject() {
        return this.builder.getComplexHomeObject();
    }
}
