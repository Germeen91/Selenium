package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebCalender3 {
    public static void main(String[] args) {


        //Book calender
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");
        //        click on the box for calender to appear


        driver.findElement(By.className("form-control")).click();


        driver.findElement(By.xpath("//input[@id='start_date']")).click();


        boolean notFound=true;

        while (notFound) {
            WebElement m = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
            if (m.getText().equals("August 2024")) {

                notFound = false;
            }

            if (notFound) {
                driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]")).click();
            }



        }
        // choose August 31

        List<WebElement> allDays = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
        for (WebElement day : allDays) {
            if (day.getText().equals("31") && day.getAttribute("class").equals("active day") ) {
                day.click();
                break;
            }

        }




    }
}
