package builder;

public class WoodHouseBuilder implements HouseBuilder {
    private final House house;

    public WoodHouseBuilder(House house) {
        this.house = house;
    }

    @Override
    public void buildWalls(int walls) {
        house.setWalls(walls);
    }

    @Override
    public void buildDoors(int doors) {
        house.setDoors(doors);
    }

    @Override
    public void buildWindows(int windows) {
        house.setWindows(windows);
    }

    @Override
    public void buildRoof() {
        house.addRoof();
    }

    @Override
    public void buildGarage() {
        house.addGarage();
    }

    @Override
    public House getResult() {
        return house;
    }
}