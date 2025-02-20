package edu.eci.cvds.patterns.shapes;

/**
 * Interface representing a generic shape.
 * Any class implementing this interface must define the method to return the number of edges for the shape.
 */
public interface Shape {

    /**
     * Returns the number of edges of the shape.
     * This method should be implemented by each concrete shape class to return the specific number of edges for that shape.
     * 
     * @return The number of edges of the shape.
     */
    public int getNumberOfEdges();
}
