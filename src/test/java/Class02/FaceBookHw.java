package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookHw {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.fb.com");


        WebElement element=driver.findElement(By.linkText("Create new account"));
        element.click();
        Thread.sleep(2000);

        WebElement name=driver.findElement(By.name("firstname"));
        name.sendKeys("ABC");

        WebElement last= driver.findElement(By.name("lastname"));
        last.sendKeys("DDD");

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("ASD.gmail.com");

        WebElement password= driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("0000");









    }
}
