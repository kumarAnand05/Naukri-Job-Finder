import pageObject.Controller;

import io.UserInput;


public class Main

{
    public static void main(String[] args)
    {
        
        // Take user input
        UserInput userInput = new UserInput();
        userInput.getUserInput();

        Controller controller = new Controller();
        controller.startScraping(userInput);

    
    }

}
