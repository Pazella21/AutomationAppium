package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private AndroidDriver driver;
    private WebDriverWait wait;


    private final By menuButton =
            AppiumBy.id("com.saucelabs.mydemoapp.android:id/menuIV");


    private final By loginMenu =
            AppiumBy.accessibilityId("Login Menu Item");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    public void clickMenu() {
        wait.until(
                ExpectedConditions.elementToBeClickable(menuButton)
        ).click();
    }


    public void clickLogin() {
        wait.until(
                ExpectedConditions.elementToBeClickable(loginMenu)
        ).click();
    }

    // Assertion bahwa halaman utama tampil setelah login
    public boolean isHomePageDisplayed() {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(menuButton)
        ).isDisplayed();
    }
}