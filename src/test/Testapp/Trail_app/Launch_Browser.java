package Trail_app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

    //System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
    //

   public static WebDriver driver;


    public static void startBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://crio-qkart-frontend-qa.vercel.app/");
        driver.manage().window().maximize();

    }

    public static void print(){
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.print(driver.getPageSource());
    }

    public static void logo(){
        WebElement Qkart=driver.findElement(By.xpath("//*[contains(@src,'logo_light.svg')]"));
        System.out.println(Qkart.isDisplayed());
    }
    public static void closeBrowser(){
        driver.close();
    }


}
