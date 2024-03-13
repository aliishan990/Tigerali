package Trail_app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Islogic {


    @Test
    public void launchHRM() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        Set<String> windHand=driver.getWindowHandles();
       // System.out.println(windHand);

        List<String> winId=new ArrayList<>(windHand);

        for(String win:winId){
            String Title=driver.switchTo().window(win).getTitle();
           // System.out.println(Title);
            //OrangeHRM
            //OrangeHRM HR Software | OrangeHRM
            if(Title.equalsIgnoreCase("OrangeHRM HR Software | OrangeHRM")){
                Thread.sleep(2000);
                driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
                Thread.sleep(2000);
                driver.close();

            }

        }

    }

}
