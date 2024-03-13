package Trail_app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class Orange_HRM {

    public static WebDriver driver;


    public static void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://saraalfiya-trials710.orangehrmlive.com/auth/seamlessLogin");
        driver.manage().window().maximize();

    }

    public static void print() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.print(driver.getPageSource());
    }

    public static void logo() {
        WebElement Qkart = driver.findElement(By.xpath("//*[contains(@src,'logo_light.svg')]"));
        System.out.println(Qkart.isDisplayed());
    }

    public static void login() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("@e3oSP0QBh");
        driver.findElement(By.xpath("//*[text()='Login']")).click();
    }

    public static void webPageElements() {
        List<WebElement> list = driver.findElements(By.xpath("//div[@id=\"widget.id\"]"));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            System.out.println();
        }
        System.out.println();
        List<WebElement> list1 = driver.findElements(By.xpath("//span[@class=\"quick-access-section-container\"]"));
        System.out.println(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getText());
        }

    }

    public static void leftmenu() {
        //driver.findElement(By.xpath("//*[text()='keyboard_arrow_down']")).click();
        List<WebElement> left = driver.findElements(By.xpath("//div[@class=\"sidebar menu-visible\"]"));
        System.out.println(left.size());
        for (int i = 0; i < left.size(); i++) {
            System.out.println(left.get(i).getText());
            System.out.println();
        }
    }

    public static void header() {
        List<WebElement> top = driver.findElements(By.xpath("//div[@id=\"topbar-ribbon\"]"));
        for (int i = 0; i < top.size(); i++) {
            System.out.println(top.get(i).getText());
            System.out.println();
        }
    }

    public static void more() {
        WebElement drop = driver.findElement(By.xpath("//*[text()='more_vert']"));
        drop.click();
        List<WebElement> moreR = driver.findElements(By.xpath("//*[@class=\"level-1-sub-menu opened\"]"));
        for (int i = 0; i < moreR.size(); i++) {
            System.out.println(moreR.get(i).getText());
            System.out.println();
        }
    }

    public static void qualification() {
        driver.findElement(By.xpath("//*[text()='more_vert']")).click();
        WebElement qa = driver.findElement(By.xpath("//*[text()=' Qualifications ']"));
        Actions move = new Actions(driver);
        move.moveToElement(qa).build().perform();
        List<WebElement> qual = driver.findElements(By.xpath("//*[@class=\"direction-left opened\"]"));
        for (int i = 0; i < qual.size(); i++) {
            System.out.println(qual.get(i).getText());
            System.out.println();
        }
    }

    public static void Configurations() {
        driver.findElement(By.xpath("//*[text()='more_vert']")).click();
        WebElement config = driver.findElement(By.xpath("//*[text()=' Configurations ']"));
        Actions con = new Actions(driver);
        con.moveToElement(config).build().perform();
        List<WebElement> cc = driver.findElements(By.xpath("//*[@class=\"sub-menu-container scrollable-sub-menu\"]"));
        for (int i = 0; i < cc.size(); i++) {
            System.out.println(cc.get(i).getText());
            System.out.println();
        }
    }

    //need to work on table
    public static void employeeList() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Employee List ']")).click();
        Thread.sleep(15000);
        List<WebElement> Emplist = driver.findElements(By.xpath("//table[@id=\"employeeListTable\"]//tbody//tr"));
        int countlist = Emplist.size();
        for (int i = 0; i < Emplist.size(); i++) {
            System.out.println(Emplist.get(i).getText());
            System.out.println();
        }
        Assert.assertEquals(50, countlist, "Testcase pass");
    }


    public static void Hr_Admin() throws InterruptedException {
        driver.findElement(By.xpath("//li[@id=\"left_menu_item_1\"]")).click();
        Thread.sleep(15000);
        List<WebElement> rowlist = driver.findElements(By.xpath("//table[@class=\"highlight bordered\"]//tbody//tr"));
        int countrow = rowlist.size();
        System.out.println(countrow);
        for (WebElement ele : rowlist) {
            System.out.println(ele.getText());
        }
        Assert.assertEquals(50, countrow, "Testcase pass");
    }

    public static void selOpt() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Employee List ']")).click();
        Thread.sleep(15000);
        List<WebElement> Emp_opt = driver.findElements(By.xpath("//table[@id=\"employeeListTable\"]//tbody//tr"));
        int countlist = Emp_opt.size();
        System.out.println(countlist);
        for (WebElement sel : Emp_opt) {
            String option = sel.getText();
            if (option.contains("1080")) {
                driver.findElement(By.xpath("//*[text()='Amadi  Aswad ']")).click();
            }
            System.out.println(option);
            Assert.assertEquals(50, countlist, "Testcase pass");
        }
        Thread.sleep(8000);
    }

    public static void ele_List() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Employee List ']")).click();
        Thread.sleep(15000);
        List<WebElement> Emp_1 = driver.findElements(By.xpath("//table[@id=\"employeeListTable\"]//tbody//tr"));
        for (WebElement Elesel : Emp_1) {
            String option = Elesel.getText();
            if (option.contains("1080")) {
                driver.findElement(By.xpath("//*[text()='Amadi  Aswad ']")).click();
            }
        }
        Thread.sleep(8000);
        System.out.println();
        List<WebElement>page_List=driver.findElements(By.xpath("//div[@class=\"row\"]"));
        int Ele_count=page_List.size();
        System.out.println(Ele_count);
        for (WebElement value_al:page_List){
            System.out.println(value_al.getText());

        }
    }

    public static void logout() {
        driver.findElement(By.xpath("//*[@id=\"navbar-logout\"]")).click();
    }

    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}






