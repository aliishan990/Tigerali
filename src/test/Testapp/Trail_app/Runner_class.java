package Trail_app;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner_class {

    @Test
    public void run_HRM() throws InterruptedException {
        Orange_HRM.startBrowser();
        System.out.println("2");
        Orange_HRM.closeBrowser();
        Orange_HRM.login();
        Thread.sleep(3000);
        Orange_HRM.webPageElements();
        Orange_HRM.leftmenu();
        Orange_HRM.header();
        Orange_HRM.logout();
        //Orange_HRM.closeBrowser();
    }

    @Test(groups = {"ishan"})
    public void run_more() throws InterruptedException {
        Orange_HRM.startBrowser();
        System.out.println("Ishan Ali");
        Orange_HRM.closeBrowser();
        Orange_HRM.login();
        Thread.sleep(3000);
        Orange_HRM.more();
        Orange_HRM.logout();
        //Orange_HRM.closeBrowser();
    }

    @Test
    public void run_qual() throws InterruptedException {
        Orange_HRM.startBrowser();
        System.out.println("1");
        Orange_HRM.closeBrowser();
        Orange_HRM.login();
        Thread.sleep(3000);
        Orange_HRM.qualification();
        Orange_HRM.logout();
        //Orange_HRM.closeBrowser();
    }

    @Test
    public void run_config() throws InterruptedException {
        Orange_HRM.startBrowser();
        System.out.println("0");
        Orange_HRM.closeBrowser();
        Orange_HRM.login();
        Thread.sleep(3000);
        Orange_HRM.Configurations();
        Orange_HRM.logout();
        //Orange_HRM.closeBrowser();
    }

//    @Test
//    public void run_EMP() throws InterruptedException {
//        Orange_HRM.startBrowser();
//        Orange_HRM.closeBrowser();
//        Orange_HRM.login();
//        Thread.sleep(1000);
//        Orange_HRM.employeeList();
//        Orange_HRM.logout();
//        //Orange_HRM.closeBrowser();
//    }
//
//    @Test
//    public void Hr_Emp() throws InterruptedException {
//        Orange_HRM.startBrowser();
//        Orange_HRM.closeBrowser();
//        Orange_HRM.login();
//        Thread.sleep(1000);
//        Orange_HRM.Hr_Admin();
//        Orange_HRM.logout();
//        //Orange_HRM.closeBrowser();
//    }
//
//    @Test
//    public void click_Opt() throws InterruptedException {
//        Orange_HRM.startBrowser();
//        Orange_HRM.closeBrowser();
//        Orange_HRM.login();
//        Thread.sleep(1000);
//        Orange_HRM.selOpt();
//        Orange_HRM.logout();
//        //Orange_HRM.closeBrowser();
//    }
//
//    @Test
//    public void elements_page() throws InterruptedException {
//        Orange_HRM.startBrowser();
//        Orange_HRM.closeBrowser();
//        Orange_HRM.login();
//        Thread.sleep(1000);
//        Orange_HRM.ele_List();
//        Orange_HRM.logout();
//        //Orange_HRM.closeBrowser();
//    }
}


