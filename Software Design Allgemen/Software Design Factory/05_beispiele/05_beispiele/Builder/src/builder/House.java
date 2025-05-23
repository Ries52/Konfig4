package builder;

// House.java
public class House {
    private int windows = 0;
    private int doors   = 0;
    private int walls   = 0;
    private boolean garage = false;
    private boolean roof   = false;

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void addGarage() {
        this.garage = true;
    }

    public void addRoof() {
        this.roof = true;
    }

    public boolean hasGarage() {
        return garage;
    }

    public boolean hasRoof() {
        return roof;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getWalls() {
        return walls;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors="   + doors +
                ", walls="   + walls +
                ", garage="  + garage +
                ", roof="    + roof +
                '}';
    }
}