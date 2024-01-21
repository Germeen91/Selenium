package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
driver.get("https://syntaxprojects.com/input-form-locator.php");

        WebElement Button=driver.findElement(By.tagName("button")); // the first button on DOm that it encounters
        Button.click();


        //list <WebElement> Button=driver.findElements(By.tagName("button")); // All buttons on DOm
        // so we have to find elements by common locator between them
        // to run them together

    }
}
