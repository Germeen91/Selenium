package review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        // maximize
        driver.manage().window().maximize();
        // go to google.com
        driver.get("https://www.fb.com");

        //create new account
        WebElement createNewAccount= driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();

        Thread.sleep(2000); // we will get error (Unable to locate element) if we not make the web get rest and load elements
//send the name
        WebElement firstName= driver.findElement(By.name("firstname"));
firstName.sendKeys("germeen");







driver.quit();



    }
}
