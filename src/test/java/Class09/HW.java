package Class09;

import Class01.OpenChromeBrowser;
import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import static Utils.CommonMethods.*;

public class HW {
    public static void main(String[] args) throws IOException {

        /*goto webSite
click on leave
from the calendar select ur birthday*/


        openBrowserAndLaunchApplication();
        String user= ConfigReader.read("userName");
        String pass=ConfigReader.read("password");

driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(user);
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
driver.findElement(By.xpath("//b[text()='Leave']")).click();
driver.findElement(By.xpath("//input[@id='calFromDate']")).click();

WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(month);
        sel.selectByValue("7");
        WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1=new Select(year);
        sel1.selectByVisibleText("1991");

        List<WebElement> calender=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
for (WebElement day:calender){

    if (day.getText().equals("20")){
        day.click();
    }
}


    }
}
