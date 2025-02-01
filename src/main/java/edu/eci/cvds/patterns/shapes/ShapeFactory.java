package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public static Shape create(Shape type){
        switch (type){
            case Triangle:
                return new Triangle();
                break;
            case Quadrilateral:
                return new Quadrilateral();
                break;
            case Pentagon:
                return new Pentagon();
                break;
            case Hexagon:
                return new Hexagon();
                break;
            default:
                return null;
                break;
        }
    }
}
