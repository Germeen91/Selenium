package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathHW {
    public static void main(String[] args) throws InterruptedException {
     // 1 / find an element near your desired element that u can access uniquely
     // 2 / find the relation between the unique element and your desired one
        //(we use Advanced xpath when you want to get particular webElement but the is no attribute or no text)
        // so we have to advance xpath
        // and also help us to access the element is not uniquely it does not have id does not have text
        // we try to use advanced Xpath before indexing

//index from 1


        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
driver.manage().window().maximize();
Thread.sleep(2000);
//Following Sibling:
        WebElement nameOfbBook1= driver.findElement(By.xpath("//input[@id='favourite-book']"));
nameOfbBook1.sendKeys("My Son");

WebElement nameOfbBook2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
nameOfbBook2.sendKeys("The World");

WebElement nameOfbBook3= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
nameOfbBook3.sendKeys("Good morning");

//Preceding Sibling:
        WebElement book1=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        book1.sendKeys("Good morning");

        WebElement book2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        book2.sendKeys("The World");

        WebElement book3= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        book3.sendKeys("My Son");

        //Parent Child Relationship:
        WebElement grandparent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grandparent.sendKeys("Roufaeel");

        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("faried");

        WebElement child=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("Steven");













    }
}
