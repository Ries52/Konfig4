import java.io.Serializable;

public class Highscore implements Serializable {
    private String playerName;
    private int score;

    public Highscore(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
}