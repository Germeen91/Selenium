package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E01ImplicitWaits {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        // maximize
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/synchronization-waits.php");

//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // we dont need to repeat again like Thread because it is global t
//        click on the first button and get the text out of it and display on console
        driver.findElement(By.xpath("//button[@id='show_text_synchronize']")).click();

        WebElement text1 = driver.findElement(By.xpath("//div[@class='card-body']/p"));
        System.out.println(text1.getText());
















    }
}
