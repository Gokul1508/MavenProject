package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommonFunctions {

    WebDriver driver = null;

    public WebDriver launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        return driver;
    }

    public void click(WebElement element) {
        element.click();
    }

    public boolean isDisplay(WebElement element) {
        return element.isDisplayed();
    }

}
