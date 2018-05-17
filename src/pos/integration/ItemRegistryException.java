package pos.integration;

/**
 * Thrown when something goes wrong while performing an operation in the <code>ItemRegistry</code>.
 * @author Josh
 */
public class ItemRegistryException extends RuntimeException {
    /**
     * Creates a new instance representing the condition described in the specified message. 
     * @param message The message that describes what went wrong. 
     */
    public ItemRegistryException(String message) {
        super(message);
    }
}
