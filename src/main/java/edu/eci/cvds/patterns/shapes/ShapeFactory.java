package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.*;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public static Shape create(RegularShapeType type){
        switch (type){
            case Triangle:
                Triangle triangle = new Triangle();
                return triangle;

            case Quadrilateral:
                Quadrilateral quadrilateral = new Quadrilateral();
                return quadrilateral;

            case Pentagon:
                Pentagon pentagon = new Pentagon();
                return pentagon;

            case Hexagon:
                Hexagon hexagon = new Hexagon();
                return hexagon;
                
            default:
                return null;
        }
    }
}
