package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {
    public static void main(String[] args) {

//dynamic table with pagination
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



//        iterate over to find the row number of the desired id


        boolean notFound=true;
        while (notFound) {

            int count = 0;
            //get the id column
            //but check first the DOM is refresh again when you press next page? if not leave the list outside loop
            //let's find it and count also inside the loop, so that every time after we click on
            //next button, it's getting the list again(this scenario the DOM refresh)
            List<WebElement> ids = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));// we moved it inside the loop because everytime we go to next page the dom get refresh(means the data is loaded completely from scratch again.) so we will get stale element error because the link of element be broken


            // for loop here working on the page and click if it found my id in each row
            for (WebElement id : ids) {
                if (id.getText().equals("103333A")) {
                    System.out.println("the row number is" + (count + 1));
//                click on the checkbox
                    String xpath = "//table/tbody/tr[" + (count + 1) + "]/td[1]";
                    WebElement checkBox = driver.findElement(By.xpath(xpath));
                    checkBox.click();
                                     // while true make this loop run
                    notFound=false; // after loop find the id will still work in the same page so we need to terminate / stop loop in this page to click on the next button
                }
                count = count + 1;
            }


//            click on the next page
            if(notFound) { // mean if on the page 1 not found id .. mean still the condition is true >> click next page
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }
        }

// Germeen (For loop stop with break)  (While loop stop with false Var)










    }
}
