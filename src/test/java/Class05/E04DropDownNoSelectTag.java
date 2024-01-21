package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E04DropDownNoSelectTag {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        driver.manage().window().maximize();

        //            find the dropDown and perform a click operation
        // does not select class  >> so find the dropDown then click to open list
        WebElement dd = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        dd.click();


//        find all the options and select your desired destination

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a")); //using slash / mean child
                                                                          //Advanced xpath to get locator unique enough
                                                                       // now i made list of all options that have same tag name>> then print out what i want
        for(WebElement option:options){
            String optionText = option.getText();  // by get text because here i dont have attribute vale on DOM
            if(optionText.equals("japan")){        //but if i need select all using loop only >> then click;
                option.click();
                break;
            }

        }





    }
}
