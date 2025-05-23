package Comparable_und_Comparator.Comparablelernen;

public class ComparablePerson3 implements Comparable<ComparablePerson3>{
    private String person;
    private int alter;

    public ComparablePerson3(String person, int alter) {
        this.person = person;
        this.alter = alter;
    }

    @Override
    public int compareTo(ComparablePerson3 o) {
        return Integer.compare(alter,o.alter);
    }

    public String getPerson() {
        return person;
    }

    public int getAlter() {
        return alter;
    }

    @Override
    public String toString() {
        return "ComparablePerson3{" +
                "person='" + person + '\'' +
                ", alter=" + alter +
                '}';
    }
}
