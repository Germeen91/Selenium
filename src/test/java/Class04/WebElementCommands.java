package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {

//WebElement Commands >> because u can perform on the Web elements So, you have to find element before it
// for example(send key > web element command because we send word to particular web element)

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
        boolean stateOfOp1 = option1.isSelected();  // state0fOp1  now the value is false because we are not select any button
        if(!stateOfOp1){  // it is meaning if option1 not false and now we select it >> click on the button
            option1.click();
        }
// to print out the state of the optional
        System.out.println("the state of radiobutton1 is  "+option1.isSelected());  // option1.isSelected >> is updated now(true)
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////


       //to check if the option 2 is enabled or not enabled(enable means >> clickable or you can selected)
        WebElement option2 = driver.findElement(By.xpath("//input[@value='option2']"));
//
        boolean enableStateOfOp2 = option2.isEnabled();  // meaning opt2 is true not can click on it
        if(enableStateOfOp2){
            System.out.println("option is enable and can be selected");
        }
        else{
            System.out.println("the option2 is not enabled and not clickable");
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // check if the option 3 is displayed (display means >> you can see it)or not and print the status on the console
        WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
        boolean isDisplayedOp3 = option3.isDisplayed();  // meaning opt3 true we not see it

        if(isDisplayedOp3){
            System.out.println("the radio button option3 is displayed");
        }
        else{
            System.out.println("the radio button option3 is not displayed");
        }

        //get the text of webElements if there is text present
        WebElement textMsg = driver.findElement(By.xpath("//div[@id='textElement']"));
        String text = textMsg.getText();
        System.out.println(text);




        //        get the attribute value of the specified attribute of the element and print on screen
        WebElement attribute = driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));

        String value = attribute.getAttribute("id");
        System.out.println(value);






    }
}
