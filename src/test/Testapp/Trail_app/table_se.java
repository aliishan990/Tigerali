package Trail_app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class table_se {


    @Test
    public void Testing_table() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(2000);
        String country="Argentina";
        String name="Argentina";

        //driver.findElement(By.xpath("(//table[@id=\"countries\"]/tbody/tr/td/strong[text()='"+name+"']/preceding::input) [7]")).click();


        List<WebElement> table=driver.findElements(By.xpath("//table[@id=\"countries\"]/descendant::tr"));
        for(WebElement newtt:table){
            String tablelist=newtt.getText();
           // System.out.println(tablelist);
            if(country.equalsIgnoreCase("Argentina")){
                driver.findElement(By.xpath("(//table[@id=\"countries\"]/tbody/tr/td/strong[text()='"+name+"']/preceding::input) [7]")).click();
                break;
            }
        }

    }
}
