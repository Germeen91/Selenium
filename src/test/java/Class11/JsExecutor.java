package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
    public static void main(String[] args) throws InterruptedException {

//java allows java
//selenium allows us to execute java script
//using js executor
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //goto hrms
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

//        to draw a boundary around the WebElement
        WebElement hoverBtn = driver.findElement(By.xpath("//button[text()='Hover me!']"));

//        using java script executor
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0]. setAttribute('style', 'background: pink; border: 2px solid red;');",hoverBtn); //location
//js Executor Script to perform .... from google

        //https://www.c-sharpcorner.com/article/how-to-highlight-webelements-using-javascriptexecutor-in-selenium-webdriver/





//scroll down
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
//        scroll up
        js.executeScript("window.scrollBy(0,-1000)");


//        get the FileUpload                       (use it if click operation not working)
        WebElement FileUpload= driver.findElement(By.xpath("//a[text()='File Upload']"));
        js.executeScript("arguments[0]. click();",FileUpload);







    }
}
