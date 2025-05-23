package Comparable_und_Comparator.Comparablelernen;

public class ComparablePersonAlph2 implements Comparable<ComparablePersonAlph2>{
    private String name;
    private int alter;

    public ComparablePersonAlph2(String name, int alter) {
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
    public int compareTo(ComparablePersonAlph2 o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "name= " + name +"\t" + " alter=" + alter;
    }
}
