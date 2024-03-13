package Sel_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class drop_d {

  public static WebDriver driver;
    @Test
    public void dropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();

        WebElement dropDown=driver.findElement(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//p//select"));
        dropDown.click();

        Select ddsel=new Select(dropDown);
        List<WebElement>option=ddsel.getOptions();
        for(WebElement options:option){
            if(options.getText().equals("British Indian Ocean Territory")){
                ddsel.selectByVisibleText("British Indian Ocean Territory");
                break;
            }
        }

          driver.findElement(By.xpath("//div[@class=\"information closable\"]")).click();

        /*for(WebElement opd:option){
            System.out.println(opd.getText());
        }
*/


        /*List<WebElement> list=driver.findElements(By.xpath("//option[@value]"));
        //System.out.println(list.size());

        for(WebElement sslist:list){
            if(sslist.equals("Thailand")){
                ddsel.selectByVisibleText("Thailand");
                WebElement selectedOption = ddsel.getFirstSelectedOption();
                selectedOption.click();
            }
        }*/

       /* ddsel.selectByIndex(220);

        WebElement selectedOption = ddsel.getFirstSelectedOption();
        String selectedValue = selectedOption.getText();
        System.out.println(selectedValue);*/
        //Thread.sleep(3000);
       // driver.close();

    }
}
