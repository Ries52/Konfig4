package org.campus02.lv;

public class Highscore implements Comparable<Highscore>{
    private String name;
    private double score;

    public Highscore(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Highscore{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Highscore o) {
//        if (this.score<o.score){
//            return 1;
//        }
//        if (this.score>o.score){
//            return -1;
//        }
//        else
//            return 0;

        return this.name.compareTo(o.name);
        //return o.name.compareTo(this.name);
    }
}
