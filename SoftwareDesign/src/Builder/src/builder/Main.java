package builder;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        ModernHouseBuilder builder = new ModernHouseBuilder(house);

        builder.buildDoors(1);
        builder.buildWalls(4);
        builder.buildGarage();

        System.out.println(builder.getResult());
    }
}
