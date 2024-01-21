package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/////  (no double slash no @ )Tag name[attribute='value']  similar to XPath dont need double slash and
//doest support Text
public class CSS {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        //find the profileID text box
       WebElement inputBox= driver.findElement(By.cssSelector("input[id='profileID']"));
       inputBox.sendKeys("hello");

       // shortcuts no need [] or = or ' '  >> for id and class name only

        // find the profile box          and use shortcut # instead of id
        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("abracadabra");

        // feedback                and use shortcut . instead of class and if we have spaces put . instead of space
        WebElement feedbackBox = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox.sendKeys("the website is too slow");


        // find course topic  use contains(contains mean remove)      and short cut instead of contain is  *  and mean remove manually numbers
        // tag name[attribute*='value']

        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");

        // find intro to advanced css  and use ^ short cut for start-with  and remove numbers
        // tag name[attribute^='value']

        WebElement intro = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("easy");

        // find Conclusion of CSS Module  and use $ short cut for end-with  and remove all except last word
        // tag name[attribute$='value']
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("welldone");






    }
}
