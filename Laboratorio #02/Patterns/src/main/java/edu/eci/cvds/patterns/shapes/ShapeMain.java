package edu.eci.cvds.patterns.shapes;

/**
 * Main class to demonstrate the use of the ShapeFactory and RegularShapeType.
 * This class accepts a shape type as a command-line argument, creates the corresponding shape, 
 * and then outputs the shape's type and the number of edges it has.
 */
public class ShapeMain {

    /**
     * Main method to run the application.
     * It expects a single command-line argument representing the type of shape to create.
     * If the argument is valid, it creates the shape and prints the type and number of edges.
     * If the argument is invalid, an error message is displayed.
     * 
     * @param args Command-line arguments. The first argument should be a valid RegularShapeType.
     */
    public static void main(String[] args) {
        // Check if exactly one argument is provided
        if (args == null || args.length != 1) {
            System.err.println("Parameter of type RegularShapeType is required.");
            return;
        }

        try {
            // Try to parse the provided argument into a RegularShapeType
            RegularShapeType type = RegularShapeType.valueOf(args[0]);

            // Create the shape using ShapeFactory and print the result
            Shape shape = ShapeFactory.create(type);
            System.out.println(
                String.format(
                    "Successfully created a %s with %s sides.",
                    type,
                    shape.getNumberOfEdges()
                )
            );
        } catch (IllegalArgumentException ex) {
            // Handle invalid RegularShapeType input
            System.err.println(
                "Parameter '" + args[0] + "' is not a valid RegularShapeType"
            );
            return;
        }
    }
}
