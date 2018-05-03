package pos.startup;

import pos.controller.Controller;
import pos.view.View;

/**
 * Starts the entire application. 
 * @author Josh
 */
public class Main {
    
    /**
     * @param args The application does not take any command line parameters.
     */
    public static void main(String[] args) {
        Controller contr = new Controller(); 
        View view = new View(contr); 
        view.sampleExecution(); 
        
        
    }
}
