package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E02ExplicitWaits {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        // maximize
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

//        find the button for the alert
        driver.findElement(By.xpath("//button[@id='show_alert']")).click();
// explicit wait for alert to appear
//       declaration
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
//        move the focus to alert and accept it
        driver.switchTo().alert().accept();

        //        click on the button to change text
        driver.findElement(By.xpath("//button[@id='changetext_button']")).click();

//        wait until the text changes and then get the changed text
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));

        WebElement textElement = driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(textElement.getText());










//implicit for the whole class(will wait until webElement is found/loaded)mean we cant not see webElement present on website
// >> global time means i can define it only once
        //>> the code is will be appear on dom After wait load element



// explicit/conditional wait  whenever needed (not waste time like Thread) ..>> always for not web Element >> not global
        // not for webElement and appears after some time, what wait will we use???????? (Explicit wait)
//wait for a certain condition fulfilled 1/alertIsPresent
//not global .. >> because every WebElement have a different condition
        //>> the code is will already on dom So wait to fulfill
        // code visible and element visible







    }
}
