import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com/");
        driver.findElement(By.className("QS5gu sy4vM")).click();
        driver.findElement(By.linkText("Accept all")).click();

        driver.close();
    }

}
