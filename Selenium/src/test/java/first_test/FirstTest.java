package first_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstTest {

    public static String browser = "safari";


    public static void main(String[] args) {
        if(browser.equals( "chrome")){
          WebDriver driver = new ChromeDriver();
        }else if(browser.equals("firefox")){
            WebDriver driver = new FirefoxDriver();
        }else if(browser.equals("safari")){
            WebDriver driver = new SafariDriver();
        };

    }


}
