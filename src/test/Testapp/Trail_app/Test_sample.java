package Trail_app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test_sample {


    @Test
    public void Testing() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Actions act=new Actions(driver);

        WebElement atta=driver.findElement(By.xpath("//input[@name=\"username\"]"));
        String getvalue=atta.getAttribute("placeholder");
        System.out.println(getvalue);
        System.out.println(atta.getSize());

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        WebElement text1=driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
        String text=text1.getText();
        System.out.println(text);

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();



        driver.findElement(By.xpath("//p[text()=' (10) Leave Requests to Approve']")).click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);

        //driver.findElement(By.xpath("(//div[@class=\"oxd-checkbox-wrapper\"]//following::label) [2]")).click();

        List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
        for (WebElement llist : list) {
            String heading = llist.getText();
            //System.out.println(heading);
            if (heading.contains("Linda Jane Anderson")) {
                WebElement checkBox= driver.findElement(By.xpath("(//div[@class=\"oxd-checkbox-wrapper\"]/descendant::span) [3]"));
                act.doubleClick(checkBox).build().perform();
            }
        }

        Thread.sleep(3000);
//        String parentHandle=driver.getWindowHandle();
//        System.out.println("Parent Handle -> "+parentHandle);
//        Set<String> childHandle=driver.getWindowHandles();
//        for(String handles:childHandle){
//            System.out.println("Child handles ->"+handles);
//        }

         driver.close();
    }

}
