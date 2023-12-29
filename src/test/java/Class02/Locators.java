package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.fb.com");  // when we press double right click >> inspect >> will find elements By locators (dom > document object model)

        driver.manage().window().maximize();

// find the WebElement input email and send ur email address to it
        WebElement email=driver.findElement(By.id("email"));     // we always avoid locator has number value or spaces and choose unique locator > not repititive

//sending the data to webElement
        email.sendKeys("abracadbr@gmail.com");

        //find the element password and send the password
        WebElement password=driver.findElement(By.name("pass"));

        password.sendKeys("hellooo123");

        //find the element button login
        WebElement login=driver.findElement(By.name("login"));
        // login.click();


// go to button create new account and click on it

    //   WebElement createAccount= driver.findElement(By.linkText("Create new account"));  // linkText locator is start with <a >tag name && has link and has a text
      //  createAccount.click();


        WebElement createAccount= driver.findElement(By.partialLinkText(" new account"));  // partialLinkText locator is same linkText but i can type part of text
        createAccount.click();                                                             // it helps us to avoid number and use locator

    }
}
