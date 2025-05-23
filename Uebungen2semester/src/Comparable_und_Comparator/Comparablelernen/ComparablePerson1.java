package Comparable_und_Comparator.Comparablelernen;

public class ComparablePerson1 implements Comparable<ComparablePerson1>{
    private String name;
    private int alter;

    public ComparablePerson1(String name, int alter) {
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
    public int compareTo(ComparablePerson1 o) {
        return Integer.compare(this.alter, o.alter);
    }

    @Override
    public String toString() {
        return "name= " + name +"\t"+"alter= " + alter;
    }
}
