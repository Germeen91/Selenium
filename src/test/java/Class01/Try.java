package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {
    public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();

driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.manage().window().maximize();

Thread.sleep(2000);

WebElement name=driver.findElement(By.name("ctl00$MainContent$username"));
name.sendKeys("Tester");
Thread.sleep(2000);

WebElement pass=driver.findElement(By.name("ctl00$MainContent$password"));
pass.sendKeys("test");
Thread.sleep(2000);

WebElement log=driver.findElement(By.className("button"));
log.click();


WebElement wel=driver.findElement(By.className("login_info"));
String s= wel.getText();
        System.out.println("the text message is :"+s);


        String p= driver.getTitle();
        System.out.println("Web Orders");
        if (p.equals("Web Orders")){
            System.out.println("you have logged");
        }else {
            System.out.println("you did not log in");
        }
Thread.sleep(2000);
        driver.close();
    }
    }

