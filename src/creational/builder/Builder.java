package creational.builder;

public interface Builder {
    void buildFloor();
    void buildRoof();
    void buildWalls();
    Home getComplexHomeObject();
}
