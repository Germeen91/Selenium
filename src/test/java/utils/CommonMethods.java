package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

import static utils.ConfigReader.read;

public class CommonMethods {
    //The Destructor will be called, and it will be destroyed. Right? That that's what's going to happen.
    // So what can I do to prevent this driver instance to be destroyed? What can I do that?
    //So what I can do is I can simply write over here public static.
    //and then webDriver.
    //driver. So this will save it from
    //being destroyed after this is being called so. If I had declared it over here.
    // Do I need to do webDriver drivers, equals to neutron driver like this? Or can I simply use it like this?
    public  static WebDriver driver;//It's just that we are declaring the instance of
    // the WebDriver pub at public static, so that we can access it. Oh, anywhere in the project,
    // whichever class is going to be inheriting it.
    public static void openBrowserAndLaunchApplication() throws IOException {
        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get(read("url"));
    }


    public static void closeBrowser() {
        driver.quit();
    }







}
