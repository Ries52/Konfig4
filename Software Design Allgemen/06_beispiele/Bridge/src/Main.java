import Colors.Blue;
import Colors.Red;
import Shapes.Circle;
import Shapes.Shape;
import Shapes.Square;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        redCircle.draw();

        Shape blueSquare = new Square(new Blue());
        blueSquare.draw();

    }
}