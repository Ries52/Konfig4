package example;

public class House {
    private int windows;
    private int doors;
    private int rooms;
    private boolean garage;
    private boolean swimPool;
    private boolean statues;
    private boolean garden;

    public House(int windows,
                 int doors,
                 int rooms,
                 boolean garage,
                 boolean swimPool,
                 boolean statues,
                 boolean garden) {
        this.windows   = windows;
        this.doors     = doors;
        this.rooms     = rooms;
        this.garage    = garage;
        this.swimPool  = swimPool;
        this.statues   = statues;
        this.garden    = garden;
    }

    public boolean hasGarage() {
        return garage;
    }

    public boolean hasSwimPool() {
        return swimPool;
    }

    public boolean hasStatues() {
        return statues;
    }

    public boolean hasGarden() {
        return garden;
    }
}
