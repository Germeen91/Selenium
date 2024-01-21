package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyEasyStaticTable {
    public static void main(String[] args) {



        WebDriver driver=new ChromeDriver();
        // maximize
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

        // if i want the row that have "in progress " status

        List<WebElement> kk=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int row=1;
        for (WebElement w:kk){

            if (w.getText().equals("in progress")){
                WebElement e= driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+row+"]"));
                System.out.println(e.getText());
            }
            row++;
        }

        /// if i want the number of row that have "in progress " status

List<WebElement> p=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int rows=1;
        for (WebElement M:p){
            if (M.getText().equals("in progress")){
                System.out.println(rows);
            }
            rows++;
        }








    }
}
