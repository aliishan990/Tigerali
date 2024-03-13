package Till_die;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class htrail1 {

    public  static WebDriver driver;

    @Test
    public void browse(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
        driver.manage().window().maximize();

       WebElement dd=driver.findElement(By.xpath("(//select[@class=\"form-control gds-cr\"])[1]"));
       dd.click();
       WebElement listdd=driver.findElement(By.xpath("(//option[contains(text(),'Bahamas')])[1]"));

       List<WebElement> list=driver.findElements(By.xpath("//option[@value]"));
       for(WebElement sse:list){
       String count=sse.getText();
       try {
           if (count.contains("Bahamas")) {
               Thread.sleep(3000);
               sse.click();
           }
       }catch(StaleElementReferenceException ee){
           ee.printStackTrace();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       }


        /*HashMap<String,Integer> map=new HashMap<>();
       *//*for(WebElement allli:list){
           String str=allli.getText();
           //System.out.println(str);
       }*//*

        for(WebElement fullist:list){
            String str=fullist.getText();
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
            }
      int count=2;
      for(Map.Entry<String, Integer> key: map.entrySet()){
          if(key.getValue()>count) {
              System.out.println(key.getKey() + ":" + key.getValue());

          }
      }
        Integer totalcount=list.size();
        System.out.println("the totalcount of country "+totalcount);*/

       //driver.close();

    }

}
