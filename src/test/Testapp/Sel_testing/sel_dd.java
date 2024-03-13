package Sel_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class sel_dd {

    public static WebDriver driver;

    @Test
    public static void sel_lit() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//div[@class=\"col-sm-10\"])[1]")).click();

        List<WebElement> list=driver.findElements(By.xpath("//option[@value]"));
        //HashMap<String,Integer>map=new HashMap<>();

        for(WebElement option:list){
            if(option.getText().contains("Aruba")){
                option.click();
                break;
            }
        }
        driver.findElement(By.xpath("//*[text()='Country-Region Dropdown Menu Demo']")).click();
        Thread.sleep(3000);

        driver.close();

    }
}
