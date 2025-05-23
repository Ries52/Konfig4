import java.io.*;
import java.util.*;

public class HighscoreManager {
    private static final String HIGH_SCORE_FILE = "highscore.dat";
    private static final String HIGH_SCORE_PLAYER_FILE = "highscore_player.dat";
    private static final String HIGH_SCORE_LIST_FILE = "highscore_list.dat";

    // Lädt den aktuellen Highscore
    public static int loadHighscore() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(HIGH_SCORE_FILE))) {
            return ois.readInt(); // Gibt den gespeicherten Highscore zurück
        } catch (IOException e) {
            return 0; // Rückgabewert, wenn keine Datei existiert
        }
    }

    // Lädt den Namen des Spielers, der den Highscore hat
    public static String loadHighscorePlayer() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(HIGH_SCORE_PLAYER_FILE))) {
            return (String) ois.readObject(); // Gibt den Spielernamen zurück
        } catch (IOException | ClassNotFoundException e) {
            return "Unbekannt"; // Rückgabewert, wenn keine Datei existiert
        }
    }

    // Lädt die Liste der Highscores
    public static List<Highscore> loadHighscoreList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(HIGH_SCORE_LIST_FILE))) {
            return (List<Highscore>) ois.readObject(); // Gibt die gespeicherte Liste zurück
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>(); // Leere Liste, wenn keine Datei existiert
        }
    }

    // Speichert den aktuellen Highscore
    public static void saveHighscore(int score, String playerName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(HIGH_SCORE_FILE))) {
            oos.writeInt(score); // Speichert den Highscore
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(HIGH_SCORE_PLAYER_FILE))) {
            oos.writeObject(playerName); // Speichert den Spielernamen
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Speichert die Highscore-Liste
    public static void saveHighscoreList(List<Highscore> highscoreList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(HIGH_SCORE_LIST_FILE))) {
            oos.writeObject(highscoreList); // Speichert die Liste
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
