package commons;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.UserInput;

public class DriverClass
{
    public static WebDriver driver;    // Driver kept static to make it easily accessible from other classes

    /**
     * Creates WebDriver object for browser selection based on user input
     * @return WebDriver object
     */
    public static WebDriver createDriver(UserInput userInput){

        int browserSelection = userInput.getBrowserSelection();     

        if(browserSelection==1)
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);
        }
        else if(browserSelection == 2)
        {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("-inprivate");
            driver = new EdgeDriver(options);
        }
        // if options other than provided are selected then code is terminated
        else
        {
            System.out.println("Invalid value provided.");
            System.exit(-1);
        }

        // Setting browser configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();
        return driver;
    }

    /**
     * Function to pause script without having need to implement exception handling all the time.
     * @param seconds duration in seconds for which the script needs to be stopped
     */
    public static void pauseFor(long seconds){
        try {
            Thread.sleep(seconds*1000);
        }
        catch (InterruptedException ignored){
        }
    }
}
