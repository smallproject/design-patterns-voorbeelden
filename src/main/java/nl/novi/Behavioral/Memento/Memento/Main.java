package nl.novi.Behavioral.Memento.Memento;

import nl.novi.Behavioral.Memento.Memento.editor.Editor;
import nl.novi.Behavioral.Memento.Memento.shapes.Circle;
import nl.novi.Behavioral.Memento.Memento.shapes.CompoundShape;
import nl.novi.Behavioral.Memento.Memento.shapes.Dot;
import nl.novi.Behavioral.Memento.Memento.shapes.Rectangle;

import java.awt.*;


public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
