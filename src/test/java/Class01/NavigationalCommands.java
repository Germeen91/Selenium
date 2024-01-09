package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
// Web driver commands
        // driver.get
        // driver.quit
        // driver.close
        // driver.manage.window.maximize
        // driver.navigate .....>>
        // driver commands because perform by driver





        //initiate the instance of Web driver

        WebDriver driver=new ChromeDriver();
        // maximize
        driver.manage().window().maximize();
        // go to google.com
        driver.get("https://www.google.com");

        // facebook.com
        driver.navigate().to("https://www.fb.com");

        //go back to google.com             get keep history (i can go back and forward)
driver.navigate().back();                   // navigate  does not keep history
Thread.sleep(2000);

// go back to fb.com
driver.navigate().forward();

// refresh
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.close();

    }
}
