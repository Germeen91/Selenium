package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        //handle the last alert on the page

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

WebElement Alert1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
Alert1.click();
Thread.sleep(2000);
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText()); // get text before click accept
        a.accept();

        WebElement Alert2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Alert2.click();
        driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(a.getText());
        a.dismiss();


        WebElement Alert3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
Alert3.click();
driver.switchTo().alert();
Thread.sleep(2000);
        System.out.println(a.getText());
        a.sendKeys("Germeen");
        Thread.sleep(2000);
        a.accept();







    }
}
