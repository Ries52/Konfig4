import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.*;

public class MainMenu extends Application {

    static String playerName = "Spieler"; // Standardname
    private static int highscore = HighscoreManager.loadHighscore();
    private static String highscorePlayer = HighscoreManager.loadHighscorePlayer(); // Name des Spielers mit dem höchsten Score
    private static List<Highscore> highscoreList = HighscoreManager.loadHighscoreList(); // Liste der Highscores

    @Override
    public void start(Stage primaryStage) {
        Label titleLabel = new Label("Quiz Hauptmenü");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        // Anzeige des aktuellen Highscores und des Spielernamens
        Label highscoreLabel = new Label("Highscore: " + highscore + " - " + highscorePlayer);

        Label nameLabel = new Label("Name:");
        TextField nameInput = new TextField(playerName);
        Button startButton = new Button("Spiel starten");

        startButton.setOnAction(e -> {
            playerName = nameInput.getText();
            QuizGame quizGame = new QuizGame();
            quizGame.start(primaryStage);
        });

        Button showHighscoresButton = new Button("Highscore-Liste anzeigen");
        showHighscoresButton.setOnAction(e -> showHighscoreList());

        VBox layout = new VBox(10, titleLabel, highscoreLabel, nameLabel, nameInput, startButton, showHighscoresButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Quiz Hauptmenü");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void updateHighscore(int newScore) {
        if (newScore > highscore) {
            highscore = newScore;
            highscorePlayer = playerName; // Setze den Namen des Spielers mit dem neuen Highscore
            HighscoreManager.saveHighscore(highscore, highscorePlayer);

            // Füge den neuen Highscore zur Liste hinzu und sortiere die Liste
            highscoreList.add(new Highscore(playerName, newScore));
            Collections.sort(highscoreList, (a, b) -> Integer.compare(b.getScore(), a.getScore())); // Liste sortieren

            // Speichern der sortierten Liste
            HighscoreManager.saveHighscoreList(highscoreList);
        }
    }

    private void showHighscoreList() {
        StringBuilder highscoreText = new StringBuilder("Highscore-Liste:\n");
        for (Highscore score : highscoreList) {
            highscoreText.append(score.getPlayerName()).append(": ").append(score.getScore()).append("\n");
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Highscore-Liste");
        alert.setHeaderText(null);
        alert.setContentText(highscoreText.toString());
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

