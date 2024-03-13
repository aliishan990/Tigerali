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

public class Navi_multi {

    public static WebDriver driver;

    @Test
    public static void multiWind() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(text(),'Open New Tab')]")).click();

        Set<String> set=driver.getWindowHandles();

        List<String> list=new ArrayList<>(set);

        String parenthandel=list.get(0);
        String childhandel= list.get(1);
        Thread.sleep(2000);
        driver.switchTo().window(parenthandel);
        Thread.sleep(2000);
        //driver.switchTo().alert().dismiss();
        WebElement child=driver.findElement(By.xpath("//button[contains(text(),' Open New Window')]"));
        child.click();

        String cchild=driver.getWindowHandle();
         driver.switchTo().window(cchild);
        driver.manage().window().maximize();

    }


}
