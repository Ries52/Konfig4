package example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game     = new Game();
        Unit player1  = new Unit(game);
        player1.fireAt();
    }
}