package Trail_app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class windo_handle {

    public static WebDriver driver;
    @Test
    public static void startBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.naukri.com/mnjuser/homepage");
        driver.manage().window().maximize();

        String parent=driver.getWindowHandle();
        System.out.println(parent);
        driver.findElement(By.xpath("//div[text()='Jobs']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='MNC']")).click();

        Set<String> all_win=driver.getWindowHandles();
        System.out.println(all_win);
        String Title=driver.switchTo().window(parent).getTitle();
        //String Title2=driver.switchTo().window()
        System.out.println(Title);



        //driver.close();


    }


}
