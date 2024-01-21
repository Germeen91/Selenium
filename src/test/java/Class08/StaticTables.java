package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


//Tables>> head>> tbody >>tr(row)>>td(cell)
// in table row start from 1 because  header is 0
// colum start from 1
public class StaticTables {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        // maximize
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

        //in DOM search by //table

//        print all the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for(WebElement row:rows){
            System.out.println(row.getText());

        }
        System.out.println("***************************");

//        to print all the rows that have status "in progress"
//        get the column status
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count=1;
        for(WebElement col:column){

            if(col.getText().equals("in progress")){
//           print the row number
                System.out.println(count);
                //           find the particular row
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));// find row index same number of count
                System.out.println(row.getText());
            }
            count=count+1;
            //count++;
        }


















    }
}
