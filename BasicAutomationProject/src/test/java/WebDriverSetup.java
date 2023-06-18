import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class WebDriverSetup {


        @Test
        public void firstTest(){
        WebDriverManager.chromedriver().setup();
        SoftAssert softassert = new SoftAssert();
        //System.setProperty("webdriver.chrome.driver","");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://pluralsight.com");
        driver.get("http://google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);

        WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
        imagesLink.click();
        softassert.assertEquals("","");

    }
}
