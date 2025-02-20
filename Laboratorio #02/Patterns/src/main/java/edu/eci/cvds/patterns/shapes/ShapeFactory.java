package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;


/**
 * Factory class responsible for creating different shapes based on the specified type.
 * This class uses the Factory Method Pattern to instantiate specific shape objects.
 *
 * @param type The type of the shape to be created (e.g., Triangle, Quadrilateral, etc.)
 * @return An instance of the requested shape or null if the type is not recognized.
 */
public class ShapeFactory {

    /**
     * Creates a shape based on the provided type.
     *
     * @param type The type of the shape to be created. This should be one of the RegularShapeType values: 
     *             Triangle, Quadrilateral, Pentagon, or Hexagon.
     * @return A new instance of the requested shape, or null if the type is unrecognized.
     */
    public static Shape create(RegularShapeType type) {
        switch (type) {
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            case Pentagon:
                return new Pentagon();
            case Hexagon:
                return new Hexagon();
            default:
                return null;
        }
    }
}
