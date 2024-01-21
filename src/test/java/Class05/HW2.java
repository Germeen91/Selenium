package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//click on enable checkboxes and select checkbox 1 and 5
public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement enableCheckBoxes= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
enableCheckBoxes.click();

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for (WebElement check:checkBoxes){

            String box=check.getAttribute("value");
            if (box.equals("Checkbox-1") || box.equals("Checkbox-4") )
            {

                check.click();
            }
        }




    }
}
