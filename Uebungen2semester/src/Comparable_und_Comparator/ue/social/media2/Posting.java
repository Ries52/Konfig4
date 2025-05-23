package Comparable_und_Comparator.ue.social.media2;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Objects;

public class Posting implements Comparable<Posting> {
    private int id;
    private String realname;
    private String screenname;
    private LocalDateTime datetime;
    private int likes;
    private int shares;
    private int views;

    public Posting(int id, String realname, String screenname, LocalDateTime datetime, int likes, int shares, int views) {
        this.id = id;
        this.realname = realname;
        this.screenname = screenname;
        this.datetime = datetime;
        this.likes = likes;
        this.shares = shares;
        this.views = views;
    }

    public int getId() {
        return id;
    }

    public String getRealname() {
        return realname;
    }

    public String getScreenname() {
        return screenname;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public int getLikes() {
        return likes;
    }

    public int getShares() {
        return shares;
    }

    public int getViews() {
        return views;
    }

    @Override
    public String toString() {
        return "Posting{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", screenname='" + screenname + '\'' +
                ", datetime=" + datetime +
                ", likes=" + likes +
                ", shares=" + shares +
                ", views=" + views +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posting posting = (Posting) o;
        return id == posting.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Posting o) {
        return Integer.compare(this.id, o.id);
    }
}



class DateTimeDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return o2.getDatetime().compareTo(o1.getDatetime());
    }
}

class LikesDescSharesDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        int res = Integer.compare(o2.getLikes(), o1.getLikes());
        return (res != 0) ? res : Integer.compare(o2.getShares(), o1.getShares());
    }
}

class ViewsDescSharesAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        int res = Integer.compare(o2.getViews(), o1.getViews());
        return (res != 0) ? res : Integer.compare(o1.getShares(), o2.getShares());
    }
}

class LikesPerViewAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        double ratio1 = (o1.getViews() == 0) ? 0 : (double) o1.getLikes() / o1.getViews();
        double ratio2 = (o2.getViews() == 0) ? 0 : (double) o2.getLikes() / o2.getViews();
        return Double.compare(ratio1, ratio2);
    }
}

class ShareLikeRatioDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        double ratio1 = (o1.getLikes() == 0) ? 0 : (double) o1.getShares() / o1.getLikes();
        double ratio2 = (o2.getLikes() == 0) ? 0 : (double) o2.getShares() / o2.getLikes();
        return Double.compare(ratio2, ratio1);
    }
}
