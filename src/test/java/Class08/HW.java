package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//
        driver.manage().window().maximize();
//        goto hrms
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

//click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        //        get the column with the ids
        List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        //iterate to find the row number
        int count=1;
        for (WebElement E:ids) {

            if (E.getText().equals("95901A")) {
                // print the row number
                System.out.println(count);

                WebElement check = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
                check.click();

            }
            count++;
        }















        }
}
