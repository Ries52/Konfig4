package Comparable_und_Comparator.ue.social.media2;

import java.util.Comparator;

class RealnameAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return o1.getRealname().compareTo(o2.getRealname());
    }
}
