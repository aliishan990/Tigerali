package Till_die;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import java.util.HashMap;
import java.util.List;

public class hard2 {
    public static WebDriver driver;

    @Test
    public void launchurl_dd() {
        WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--disable-notifications");
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//p//select")));

        WebElement dropdownElement = driver.findElement(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//p//select"));
        dropdownElement.click();
        List<WebElement> options1 = dropdownElement.findElements(By.tagName("option"));
        for(WebElement opp:options1){
            String ele=opp.getText();
            if(ele.contains("Angola")){
                opp.click();
            }
        }


        /*HashMap<String, Integer> dropdownValuesMap = new HashMap<>();

        for (WebElement option : options1) {
            String text = option.getText().trim();
            if (!text.isEmpty()) {
                if (dropdownValuesMap.containsKey(text)) {
                    dropdownValuesMap.put(text, dropdownValuesMap.get(text) + 1);
                } else {
                    dropdownValuesMap.put(text, 1);
                }
            }
        }

        for (String key : dropdownValuesMap.keySet()) {
            System.out.println("Country: " + key + ", Count: " + dropdownValuesMap.get(key));
        }
*/
    }
}
