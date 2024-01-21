package Class07;

import Class06.Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hw2 {
    public static void main(String[] args) {
/*click on button "click to display button"
and click on the displayed button

click on "click me to enable button"
click on the button below

click on click to check the check box
get the state of selected check box after its checked and print on console */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement openAlert= driver.findElement(By.xpath("//button[@id='show_alert']"));
openAlert.click();
wait.until(ExpectedConditions.alertIsPresent());
Alert alert=driver.switchTo().alert();
String s=alert.getText();
        System.out.println(s);
        alert.accept();

WebElement clickChangeText= driver.findElement(By.xpath("//button[@id='changetext_button']"));
clickChangeText.click();
wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));
WebElement chaneText= driver.findElement(By.xpath("//h2[@id='headingtext']"));
String ss=chaneText.getText();
        System.out.println(ss);

WebElement DisplayButton= driver.findElement(By.xpath("//button[@id='display_button']"));
DisplayButton.click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Enabled')]")));
WebElement disButton= driver.findElement(By.xpath("//button[contains(text(),'Enabled')]"));
disButton.click();
WebElement message=driver.findElement(By.tagName("p"));
        System.out.println(message.getText());

WebElement enableButton= driver.findElement(By.xpath("//button[@id='enable_button']"));
enableButton.click();
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Button')]")));
WebElement Button=driver.findElement(By.xpath("//button[contains(text(),'Button')]"));
Button.click();

WebElement ClickMe=driver.findElement(By.xpath("//button[@id='checkbox_button']"));
ClickMe.click();
wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));
WebElement checkBox= driver.findElement(By.xpath("//input[@id='checkbox']"));
checkBox.click();
if (checkBox.isSelected()){
    System.out.println("It is Selected");
}else {
    System.out.println("Not Selected");
}



WebElement lastText= driver.findElement(By.xpath("//p[contains(text(),'Checkbox will be checked in : ')]"));
        System.out.println(lastText.getText());









    }
}
