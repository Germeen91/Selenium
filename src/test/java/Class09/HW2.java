package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class HW2 {
    public static void main(String[] args) throws InterruptedException, IOException {

        //Book calender

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");
        //        click on the box for calender to appear
        WebElement calender = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        calender.click();
        driver.findElement(By.xpath("//div[@class='input-group date']/input")).click();

        Thread.sleep(2000);

        boolean notFound=true;
        while (notFound) {

            WebElement month = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
            if (month.getText().equals("November 2023")) {
                notFound=false;

            }
            if (notFound){
                driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[1]")).click();
            }

        }

        Thread.sleep(2000);





List<WebElement> days=driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
for (WebElement day:days){
    if (day.getText().equals("30")  && day.getAttribute("class").equals("day")){
        day.click();
        break;
    }
}










Thread.sleep(2000);







        }

    }



