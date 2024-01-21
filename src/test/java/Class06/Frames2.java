package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames2 {
    public static void main(String[] args) throws InterruptedException {





        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        driver.manage().window().maximize();

        driver.switchTo().frame(0);
        WebElement topic= driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("hello");
        Thread.sleep(2000);

// we dont need to go main bag and then back again because we already in the parent frame so switch directly to the child frame

        // Switch to the iframe with id 'checkboxIframe'
        driver.switchTo().frame("checkboxIframe");
        WebElement box = driver.findElement(By.xpath("//input[@type='checkbox']"));
        box.click();
        Thread.sleep(2000);

        // Switch back to the main content
        driver.switchTo().defaultContent();

        // Switch to the iframe using its id 'dropdownIframe'
        driver.switchTo().frame("dropdownIframe");
        WebElement down = driver.findElement(By.xpath("//select[@id='animals']"));

        Select sel = new Select(down);
        sel.selectByValue("babycat");






    }
    }

