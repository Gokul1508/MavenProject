package testCases;

import objectRepo.CommonFunctions;
import objectRepo.HomePage;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC01verifyVisibilityTest extends CommonFunctions {

    WebDriver driver = null;
    HomePage homePage = null;
    Logger log = Logger.getLogger(TC01verifyVisibilityTest.class.getName());

    @BeforeClass
    public void browserLaunch() {
        driver = launchBrowser();
        homePage = new HomePage(driver);
        BasicConfigurator.configure();
        log.info("Browser is launched.");
    }

    @Test(groups = {"forBuyNow", "forProceedToBuy"}, priority = 1)
    public void navigate() {
        click(homePage.getBestSellerButton());
        click(homePage.getFirstItem());
        log.info("Clicking the Best Seller button.");
    }

    @Test(groups = "forBuyNow", priority = 2, dependsOnMethods = "navigate")
    public void isBuyNowDisplayed() {
        if (isDisplay(homePage.getBuyNowButton())) {
            log.info("Buy Now button is visible.");
        } else {
            log.info("Buy Now button is not visible.");
        }
    }

    @Test(groups = "forProceedToBuy", priority = 3, dependsOnMethods = "navigate")
    public void isProceedToBuyDisplayed() {
        click(homePage.getAddToCart());
        if (isDisplay(homePage.getProceedToBuy())) {
            log.info("Proceed To Buy button is visible.");
        } else {
            log.info("Proceed To Buy button is not visible.");
        }
    }

    @AfterClass
    public void quit() {
       driver.quit();
       log.info("Browser is closed.");
    }
}



