package Class01;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Try {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

        //        send keys after clearing hte text box
        WebElement textBox = driver.findElement(By.xpath("//input[@id='textInput']"));
//        clear the text from the element
        textBox.clear();
//       then >> send keys
        textBox.sendKeys("welcome");

        //        check if the option 1 is selected
//        if no then select it
        WebElement option1 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
//        check if the radio button is selected
        boolean stateOfOp1 = option1.isSelected();
        if(option1.isSelected()){
            option1.click();
            System.out.println("the state of radiobutton1 is  "+stateOfOp1);
        }
// to print out the state of the optional


        Thread.sleep(2000);
driver.close();








    }

}
