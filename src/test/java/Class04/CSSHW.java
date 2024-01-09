package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSHW {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement feedBackFromRaj= driver.findElement(By.cssSelector("input[class='form-control feedbackBox2']"));

feedBackFromRaj.sendKeys("i like it");

WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
email.sendKeys("germeen.gmail.com");















    }
}
