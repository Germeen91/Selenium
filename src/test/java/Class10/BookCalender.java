package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BookCalender {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");



        //        click on the box for calender to appear
        driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).click();
        String year="2012";
        String month="January";
        String day="31";

        while (true){
            String monthYear=driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]")).getText();
            String []arr=monthYear.split(" ");
            String mon=arr[0];
            String yea=arr[1];
            if ((mon.equalsIgnoreCase(month)) && (yea.equalsIgnoreCase(year))){
                break;
            }
            else driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[1]")).click();

        }

        List<WebElement> days=driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
        for (WebElement da:days){
            if ((da.getText().equals(day)) && ((da.getAttribute("class").equals("day")))) {
                da.click();
                break;
            }
        }







    }
}
