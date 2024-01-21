package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E02CheckBoxes {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

//        click on the checkbox
        WebElement cb1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        cb1.click();


//        select all options from the checkboxes   >> so find common element between
        List<WebElement> options = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(WebElement option:options){
            option.click();
        }


        //        select option3 from the checkboxes  >> so find common element between
        List<WebElement> option3 = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for(WebElement option:option3){
            String optionVal = option.getAttribute("value");
            if(optionVal.equals("Option-3")) {
                option.click();
                break;
            }
        }





    }
}
