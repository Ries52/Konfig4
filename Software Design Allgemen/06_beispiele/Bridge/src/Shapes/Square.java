package Shapes;

import Colors.Color;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
        color.applyColor();
    }
}
