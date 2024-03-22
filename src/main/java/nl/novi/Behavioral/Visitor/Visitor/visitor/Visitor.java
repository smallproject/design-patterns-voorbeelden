package nl.novi.Behavioral.Visitor.Visitor.visitor;


import nl.novi.Behavioral.Visitor.Visitor.shapes.Circle;
import nl.novi.Behavioral.Visitor.Visitor.shapes.CompoundShape;
import nl.novi.Behavioral.Visitor.Visitor.shapes.Dot;
import nl.novi.Behavioral.Visitor.Visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}