package builder;

public interface HouseBuilder {
    void buildWalls(int walls);
    void buildDoors(int doors);
    void buildWindows(int windows);
    void buildRoof();
    void buildGarage();
    House getResult();
}
