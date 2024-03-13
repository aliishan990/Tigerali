package Till_die;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class Hard_1 {

    public static WebDriver driver;

    @Test
    public void launchurl_dd() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();

        HashMap<String, Integer> dropdownValuesMap = new HashMap<>();
        driver.findElement(By.xpath("//div[@class=\"single_tab_div resp-tab-content resp-tab-content-active\"]//p//select")).click();
        Thread.sleep(5000);
        List<WebElement> list = driver.findElements(By.tagName("option"));
        for (WebElement newlist : list) {
            String allElements = newlist.getText().trim();
            String value = newlist.getAttribute("value");
            //System.out.println(value);
            //System.out.println(allElements);
            if (!value.isEmpty()) {
                if (dropdownValuesMap.containsKey(value)) {
                    // If the option already exists in the HashMap, increment its count
                    dropdownValuesMap.put(value, dropdownValuesMap.get(value) + 1);
                } else {
                    // If the option doesn't exist in the HashMap, add it with a count of 1
                    dropdownValuesMap.put(value, 1);
                }
            }
        }
        for (String key : dropdownValuesMap.keySet()) {
            System.out.println("Country: " + key + ", Count: " + dropdownValuesMap.get(key));
        }

        driver.close();
    }
}


