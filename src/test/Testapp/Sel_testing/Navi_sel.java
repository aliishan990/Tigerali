package Sel_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Navi_sel {


    public static WebDriver driver;

    @Test
    public static void navigate() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();


        WebElement titt=driver.findElement(By.xpath("//button[text()='    click   ']"));
        titt.click();
        Thread.sleep(2000);

        Set<String> set = driver.getWindowHandles();

        List<String> list=new ArrayList<>(set);
        String parentwindow= list.get(0);
        String childwindow=list.get(1);
        System.out.println(parentwindow);
        System.out.println(childwindow);

        String title1=driver.switchTo().window(childwindow).getTitle();
        String title2=driver.switchTo().window(parentwindow).getTitle();
        System.out.println(title1);
        System.out.println(title2);

        Thread.sleep(2000);
        driver.quit();



    }
}
