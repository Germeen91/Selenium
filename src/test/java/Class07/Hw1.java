package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hw1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/handle-iframe.php");
        driver.manage().window().maximize();

//        driver is focused on main page so
//        switch the focus to the frame 0
        driver.switchTo().frame(0);
        driver.findElement(By.id("textfieldIframe"));
driver.switchTo().defaultContent();



















    }
}
