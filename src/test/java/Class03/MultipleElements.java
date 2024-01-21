package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to syntax projects.com
        driver.get("https://www.ebay.com");
        // get all the links from ebay.com
        //links mean every button has another page
        //<a href="www.kkkk.com>likToText</a>
        //a >> tag name for links      href>> attribute

        //Elements +s  because we i need all links
        // ctrl+f  >> search by a  .. because it is the tag name for Links
List<WebElement> allLinks= driver.findElements(By.tagName("a")); //  link use tag name <a
// we use List of web elements when we need more elements
for (WebElement link:allLinks){ // because it is list of many web elements so we have yo use loop

    // extract the text from the webElement
    String text=link.getText();
    System.out.println(text);

    // extract the link from the webElement
    //print the value of attribute hre on the console for element that u found
    String linkAddress=link.getAttribute("href");  // href is attribute is holding links in web dom
    System.out.println(linkAddress);

    // List<WebElement> abc= driver.findElements(By.xpath("//a"));>> get all value that
}


// try to get multiple elements
      List<WebElement> abc= driver.findElements(By.tagName("input"));  // List because we find more elements by tag name
// to findElements we have to find them by locator common between them
for (WebElement all:abc){
// send text to all input tags found
    all.sendKeys("hello");

}






    }
}
