package nl.novi.Behavioral.Visitor.Visitor.shapes;

import nl.novi.Behavioral.Visitor.Visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
