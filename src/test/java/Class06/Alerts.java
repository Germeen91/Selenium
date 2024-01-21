package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

//        find the alert1
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
Thread.sleep(2000);
        //        switch the focus of the driver to alert
        Alert alertHandler = driver.switchTo().alert();  //to use alert method have to have var with Alert datatype
        alertHandler.accept();

        //        find the alert2 button
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);

        System.out.println(alertHandler.getText());
        alertHandler.dismiss();













    }
}
