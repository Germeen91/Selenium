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

/*click on button 1
click on button 2 select male
click on button3 select option1*/
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement button1= driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
button1.click();
WebElement text=driver.findElement(By.xpath("//div[@class='card-body']/p"));
String s= text.getText();
        System.out.println(s);

        WebElement button2= driver.findElement(By.xpath("//button[@id='show_text_synchronize_02']"));
        button2.click();
        WebElement male= driver.findElement(By.xpath("//input[@value='Male']"));
        male.click();
        WebElement button3=driver.findElement(By.xpath("//button[@id='show_text_synchronize_03']"));
        button3.click();

WebElement option1= driver.findElement(By.xpath("//input[@value='Option-1']"));
option1.click();




















    }
}
