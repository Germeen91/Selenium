package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E03DropDowns {
    public static void main(String[] args) throws InterruptedException {



        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
driver.manage().window().maximize();


        // single drop down >> mean you can select one option

//  1-   find the dropdown (Always by select tag First) >> then create (Select class)
        WebElement dd = driver.findElement(By.xpath("//select[@id='select-demo']"));

//  2-   use select class
        Select sel=new Select(dd);  //>> pass dropDown as a parameter here

        sel.selectByIndex(2);   // index start from 0
        Thread.sleep(2000);
        sel.selectByValue("Sunday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Saturday");


// multi selections drop down  >> mean you can select more than one option
// no different the same steps of single dropDown

//        multiselect dropdown   1-   find the dropdown (Always by select tag)
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='multi-select']"));

//     2-   Select class
        Select Sel1=new Select(dropDown);   // find the dropDown is parameter here
//        weather the drop down is multi select or not
        System.out.println("the drop down is multiselect"+Sel1.isMultiple());

        Sel1.selectByValue("New York");

        Sel1.selectByVisibleText("Florida");
        Thread.sleep(2000);

        Sel1.deselectByValue("New York"); // only with multi selections dropDown

        Sel1.deselectByVisibleText("Florida");
    }
}
