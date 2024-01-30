package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebCalender2 {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");
        //        click on the box for calender to appear


        driver.findElement(By.className("form-control")).click();

        List<WebElement> allDays=driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));

        for (WebElement day:allDays){

            if (day.getAttribute("class").equals("today day") &&  day.getText().equals("25")){
                day.click();
                break;
            }
        }

    }
}
