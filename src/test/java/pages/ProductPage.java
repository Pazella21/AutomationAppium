package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    private AndroidDriver driver;
    private WebDriverWait wait;

    private final By backpackImage = AppiumBy.xpath(
            "//android.widget.TextView[@text='Sauce Labs Backpack']" +
                    "/preceding-sibling::android.widget.ImageView[@content-desc='Product Image']"
    );

    private final By addToCartButton =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/cartBt");

    private final By quantity =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/noTV");

    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void selectProduct() {
        wait.until(
                ExpectedConditions.elementToBeClickable(backpackImage)
        ).click();
    }

    public void clickAddToCart() {
        wait.until(
                ExpectedConditions.elementToBeClickable(addToCartButton)
        ).click();
    }

    public String getQuantity() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(quantity)
        ).getText();
    }
}