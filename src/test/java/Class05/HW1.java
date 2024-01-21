package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

//click on enable button and
//check if the male radio button is enabled
//if yes click on it
public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement enableButton= driver.findElement(By.xpath("//button[@id='enabledradio']"));
enableButton.click();

WebElement maleRadioButton= driver.findElement(By.xpath("//input[@name='gender-identity' and @value='gender-male']"));

        if (maleRadioButton.isEnabled()){
            System.out.println("The male Radio Button is Enabled ");
            maleRadioButton.click();
        }else {
            System.out.println("The male Radio Button is not Enabled ");
        }















    }
}
