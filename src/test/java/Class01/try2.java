package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class try2 {
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


        driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr")).getText();

        List<WebElement> ids=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        int rows=1;
        for (WebElement w:ids){
            if (w.getText().equals("96215A")){
                System.out.println(rows);

                WebElement row= driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+rows+"]/td[1]"));
                row.click();
            }


rows++;
        }





        }

      }



