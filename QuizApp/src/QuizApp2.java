import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class QuizApp2 extends Application {

    private int score = 0;
    private int currentQuestionIndex = 0;
    private int timeLeft = 10; // Zeit in Sekunden pro Frage
    private Timeline timer;

    private Label questionLabel = new Label();
    private Button answer1Button = new Button();
    private Button answer2Button = new Button();
    private Button answer3Button = new Button();
    private Button answer4Button = new Button();
    private Label scoreLabel = new Label("Score: 0");
    private Label timerLabel = new Label("Zeit: 10");

    private String[][] questions = {
            {"Was ist die Hauptstadt von Deutschland?", "Berlin", "Paris", "Madrid", "Rom", "1"},
            {"Wie viele Beine hat eine Spinne?", "6", "8", "10", "12", "2"},
            {"Welche Farbe hat die Sonne?", "Blau", "Gelb", "Rot", "Grün", "2"},
            {"Welche Farbe hat das Gras?", "Blau", "Rot", "Gelb", "Grün", "4"},
            {"Welche Farbe hat der Mond?", "Blau", "Gelb", "Rot", "Weiß", "4"}
    };

    @Override
    public void start(Stage primaryStage) {
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(questionLabel, answer1Button, answer2Button, answer3Button, answer4Button, timerLabel, scoreLabel);

        answer1Button.setOnAction(e -> checkAnswer(1));
        answer2Button.setOnAction(e -> checkAnswer(2));
        answer3Button.setOnAction(e -> checkAnswer(3));
        answer4Button.setOnAction(e -> checkAnswer(4));

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Quiz Spiel");
        primaryStage.setScene(scene);
        primaryStage.show();

        loadQuestion(); // Frage laden
    }

    private void loadQuestion() {
        if (currentQuestionIndex < questions.length) {
            questionLabel.setText(questions[currentQuestionIndex][0]);
            answer1Button.setText(questions[currentQuestionIndex][1]);
            answer2Button.setText(questions[currentQuestionIndex][2]);
            answer3Button.setText(questions[currentQuestionIndex][3]);
            answer4Button.setText(questions[currentQuestionIndex][4]);

            // Timer starten
            startTimer();
        } else {
            showFinalScore(); // Alle Fragen beantwortet, Ergebnis anzeigen
        }
    }

    private void checkAnswer(int selectedAnswer) {
        int correctAnswer = Integer.parseInt(questions[currentQuestionIndex][5]);

        // Wenn die Antwort korrekt ist, Punkte hinzufügen
        if (selectedAnswer == correctAnswer) {
            score += 10;
            showAlert("Richtig!", "Das ist die richtige Antwort.");
        } else {
            showAlert("Falsch!", "Die Antwort war leider falsch.");
        }

        scoreLabel.setText("Score: " + score);
        currentQuestionIndex++; // Frage nach Beantwortung ändern
        loadQuestion(); // Nächste Frage laden
    }

    private void startTimer() {
        timeLeft = 10; // Timer für jede Frage zurücksetzen
        timerLabel.setText("Zeit: " + timeLeft);

        // Timer neu erstellen, wenn bereits einer existiert
        if (timer != null) {
            timer.stop();
        }

        // Neuen Timer starten
        timer = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            timeLeft--;
            timerLabel.setText("Zeit: " + timeLeft);
            if (timeLeft == 0) {
                timer.stop();
                showAlert("Zeit abgelaufen!", "Die nächste Frage kommt.");
                currentQuestionIndex++; // Index erhöhen
                loadQuestion(); // Nächste Frage laden
            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE); // Unendliche Wiederholung
        timer.play(); // Timer starten
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showFinalScore() {
        timer.stop(); // Timer stoppen
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Spiel beendet");
        alert.setHeaderText(null);
        alert.setContentText("Spiel beendet! Dein Score: " + score);
        alert.showAndWait();

        System.exit(0); // Beendet das Programm nach dem Spiel
    }

    public static void main(String[] args) {
        launch(args);
    }
}
