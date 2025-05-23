package org.campus02.lv;

import java.util.Arrays;

public class HighscroreDemo {
    public static void main(String[] args) {

        Highscore[] highscores= {
                new Highscore("Max",131.50),
                new Highscore("Max",161.50),
                new Highscore("Max",181.50),
                new Highscore("Max",111.50)
        };

        System.out.println(Arrays.toString(highscores));
        Arrays.sort(highscores);
        System.out.println(Arrays.toString(highscores));
    }
}
