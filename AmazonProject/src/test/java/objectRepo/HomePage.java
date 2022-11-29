package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    @FindBy(linkText = "Best Sellers")
    private WebElement bestSellerButton;
    @FindBy(xpath = "//div[.=\"American Tourister 32 Ltrs Black Casual Backpack (AMT FIZZ SCH BAG 02 - BLACK)\"]")
    private WebElement firstItem;

    @FindBy(name = "submit.buy-now")
    private WebElement buyNowButton;
    @FindBy(id = "add-to-cart-button")
    private WebElement addToCart;
    @FindBy(name = "proceedToRetailCheckout")
    private WebElement proceedToBuy;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getBuyNowButton() {
        return buyNowButton;
    }

    public WebElement getBestSellerButton() {
        return bestSellerButton;
    }

    public WebElement getFirstItem() {
        return firstItem;
    }

    public WebElement getProceedToBuy() {
        return proceedToBuy;
    }

}
