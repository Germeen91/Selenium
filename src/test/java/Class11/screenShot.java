package Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenShot {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        //need dependency name (commons-io)



        TakesScreenshot ss=(TakesScreenshot) driver;
//take ss
        File screenShot = ss.getScreenshotAs(OutputType.FILE);
//        save on computer
        FileUtils.copyFile(screenShot,new File("screenshot/image1.png")); // "screenshot here just a folder name >> image (name of image)"
                                                                                   //and change the name every time take a screen shot





    }
}
