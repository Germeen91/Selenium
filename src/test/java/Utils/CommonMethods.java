package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static Utils.ConfigReader.read;

public class CommonMethods {
    //The Destructor will be called, and it will be destroyed. Right? That that's what's going to happen.
    // So what can I do to prevent this driver instance to be destroyed? What can I do that?
    //So what I can do is I can simply write over here public static.
    //and then webDriver.
    //driver. So this will save it from
    //being destroyed after this is being called so. If I had declared it over here.
    // Do I need to do webDriver drivers, equals to neutron driver like this? Or can I simply use it like this?
    public  static WebDriver driver;//It's just that we are declaring the instance of
    // the WebDriver pub at public static, so that we can access it. Oh, anywhere in the project,
    // whichever class is going to be inheriting it.
    public static void openBrowserAndLaunchApplication() throws IOException {
        switch (ConfigReader.read("browser")){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "FireFox":
                driver=new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get(read("url"));
    }


    public static void closeBrowser() {
        if(driver!= null) {
            driver.quit();
        }
    }
public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);

}

    public static void selectFromDropDown(WebElement dropDown, String visibleText){
        Select sel =new Select(dropDown);
        sel.selectByVisibleText(visibleText);
    }
    public static void selectFromDropDown(String value, WebElement dropDown ){ // overLoad
        Select sel =new Select(dropDown);
        sel.selectByValue(value);
    }
    public static void selectFromDropDown( WebElement dropDown,int index ){// overLoad
        Select sel =new Select(dropDown);
        sel.selectByIndex(index);
    }



    public static WebDriverWait getwait(){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICIT_WAIT));
        return  wait;
    }



    public static void waitForElementToBeClickAble(WebElement element){
        getwait().until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void click(WebElement element){
        waitForElementToBeClickAble(element);
        element.click();
    }



    //frame
    //checkboxes
    //radioButton
    //multipleWindows

}
