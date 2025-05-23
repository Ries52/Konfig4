package Comparable_und_Comparator.ue.social.media2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Demo {
    public static void main(String[] args) {
        List<Posting> postings = new ArrayList<>();
        postings.add(new Posting(5, "Anna", "@anna", LocalDateTime.of(2021,3,10,18,30,15), 100, 50, 1000));
        postings.add(new Posting(2, "Max", "@max", LocalDateTime.of(2022,5,5,10,15,0), 50, 25, 900));
        postings.add(new Posting(9, "Lisa", "@lisa", LocalDateTime.of(2020,1,1,12,0,0), 80, 80, 1000));
        postings.add(new Posting(1, "Tom", "@tom", LocalDateTime.of(2023,3,3,9,0,0), 70, 20, 700));
        postings.add(new Posting(6, "Eva", "@eva", LocalDateTime.of(2021,8,8,8,8,8), 120, 60, 1100));

        System.out.println("Originale Liste:");
        postings.forEach(System.out::println);

        Collections.sort(postings);
        System.out.println("\nSortiert nach ID:");
        postings.forEach(System.out::println);

        Collections.sort(postings, new RealnameAscComparator());
        System.out.println("\nSortiert nach Realname:");
        postings.forEach(System.out::println);

        Collections.sort(postings, new DateTimeDescComparator());
        System.out.println("\nSortiert nach Datum absteigend:");
        postings.forEach(System.out::println);

        Collections.sort(postings, new LikesDescSharesDescComparator());
        System.out.println("\nSortiert nach Likes (dann Shares):");
        postings.forEach(System.out::println);

        Collections.sort(postings, new ViewsDescSharesAscComparator());
        System.out.println("\nSortiert nach Views (dann Shares):");
        postings.forEach(System.out::println);

        Collections.sort(postings, new LikesPerViewAscComparator());
        System.out.println("\nSortiert nach Likes pro View:");
        postings.forEach(System.out::println);

        Collections.sort(postings, new ShareLikeRatioDescComparator());
        System.out.println("\nSortiert nach Share-Like-Ratio:");
        postings.forEach(System.out::println);
    }
}

