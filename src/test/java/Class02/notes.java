package Class02;

public class notes {
    /*HOW TO USE LOCATORS;
*CLASS NAME: locates elements whose class name contains the search value.
// confirm that you have logged in to the website

        WebElement message=driver.findElement(By.className("login_info"));
        String text =message.getText();
        System.out.println(text);

*ID: locates elements whose ID attribute matches the search value.
         //find the Element input email and send ur email address to it
         WebElement email=driver.findElement(By.id("email"));
         //Sending the data do WebElement
         email.sendKeys("damladayal@gmail.com");

*NAME: locates elements whose NAME attribute matches the search value.
//find the element password and send the password
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("123456");

                //Find the Element Button Login
                WebElement login=driver.findElement(By.name("login"));
                login.click();


*LINK TEXT: locates anchor elements whose visible text matches the search value.
1.There is a tag <a>
2.It has some text
//Go to button create new account and click on it
        WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        createAccount.click();

PARTIAL link text: locates anchor elements whose visible text contains the search value.
                                                                  put just part of it
       WebElement createAccount=driver.findElement(By.partialLinkText("new account"));
        createAccount.click();

*TAG NAME: locates elements whose tag name matches the search value.

*XPATH: locates elements matching an XPath expression.

*CSS selector: locates elements matching a CSS selector.
*/
}
