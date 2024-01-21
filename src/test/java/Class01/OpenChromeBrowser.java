package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) throws InterruptedException {

        // initiating the instance of chrome driver
        WebDriver driver=new ChromeDriver();

        // maximize the screen
        driver.manage().window().fullscreen();

        //go to a url
        driver.get("http://www.google.com");
        //driver.manage().window().fullscreen();

// get the title
                String title=driver.getTitle();  //>> get title mean show it or print it so we have String Variable
        System.out.println("the title of the page is "+title);

        // get the url of the page
        String url = driver.getCurrentUrl();
        System.out.println("the url is "+url);
// slow down code
        Thread.sleep(4000);


        // close the window   {close to close current page }
        driver.quit();  // Quit all browser those you opened

    }
}
