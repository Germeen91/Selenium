package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// Frames:
//    Frame is a separate independent window in our webpage
//    frames allow devs to represent multiple views on one page
//
//    * ways to interact with Frames:
//    1. by index
//    2. by name or ID
//    3. by WebElement
public class Frames {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/handle-iframe.php");
        driver.manage().window().maximize();

//        driver is focused on main page so
//        switch the focus to the frame 0
        driver.switchTo().frame(0); // switching using index
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("frames");

//switch to default content
        driver.switchTo().defaultContent();
//        switch to the frame having the dropdown
        driver.switchTo().frame("dropdownIframe"); // switching using id  >>search on dom by //iframe

//        dealing with dropdown
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel =new Select(dd);
        sel.selectByValue("big baby cat");

        //select the checkbox
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);

//        find the iframe element
        WebElement frameNested = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']")); //>>search on dom by //iframe
        driver.switchTo().frame(frameNested); // switching using WebElement   >> so we had to findElement

// click the check box
        driver.findElement(By.xpath("//input[@value='Option-1']")).click();



    }
}
