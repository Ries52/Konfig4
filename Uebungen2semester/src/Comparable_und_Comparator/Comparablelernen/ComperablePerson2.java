package Comparable_und_Comparator.Comparablelernen;

public class ComperablePerson2 implements Comparable<ComperablePerson2>{
    private String name;
    private int alter;


    @Override
    public int compareTo(ComperablePerson2 o) {
        return Integer.compare(this.alter, o.alter);
    }

    public ComperablePerson2(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return "name= " + name + "\t" + " alter=" + alter;
    }
}
