package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//tagname[@attribute='value']     >> prefer way

//*[@attribute='value']      >> >> get me any tag name that has@attribute whose value=' '
// >> not prefer because will take from top to the button if i need button will not take it

public class xpath {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //go to syntax projects.com
        driver.get("https://syntaxprojects.com/Xpath.php");

// inspect >> ctrl+f   > to find by xpath
        // finding the input box username
WebElement username=driver.findElement(By.xpath("//input[@id='title']"));  //xpath using attribute
                                                              // tag name[@locator = 'Value']>> it has to be unique>no num>no space >id prefer
username.sendKeys("abrsda"); // sendKeys operator

WebElement click=driver.findElement(By.xpath("//button[text()='Click Here']")); //xpath using text if we have a text
click.click();     //click operator                                     // tag name[text() = ' Value of text']

        // find the security question
WebElement q1= driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]")); //xpath using partial value by attribute >> then remove numbers manually
q1.sendKeys("what is your name");

// find the text and print on console
        //getText   >> is webElementCommand >> so we have to find element >> store in string var>> then print it out
WebElement textMsg= driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum')]"));//xpath using partial value by text
String text=textMsg.getText();
        System.out.println(text);


     // send the api setting
     WebElement apiSettings= driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]")); //xpath using start-with >> remove numbers
     apiSettings.sendKeys("123.123.123");

                                                                                                   // use xpath indexing (make it last choice Dom changing )
                                                                                                   //if we have 2 or more same attributes similar value in search box in the button
WebElement email2= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));// we have to put ()capsule >> then number 2 because it is the same attribute in 1,2 3
email2.sendKeys("adb@gmail.com");


        //if we have 2 or more attributes similar OR  use  'and'
//        send the field2
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']")); // xpath Operate
        field2.sendKeys("abcdef");


    }
}
