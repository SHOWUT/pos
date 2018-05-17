package pos.view;

/**
 * This class is responsible for showing error messages to the user. 
 * @author Josh
 */
public class ErrorMessageHandler {
    /**
     * Displays the specified error message. 
     * @param message The error message. 
     */
    void showErrorMessage(String message) {
        StringBuilder errorMessageBuilder = new StringBuilder();
        errorMessageBuilder.append("~~~~~~~ERROR: ");
        errorMessageBuilder.append(message);
        System.out.println(errorMessageBuilder);
    }
}
