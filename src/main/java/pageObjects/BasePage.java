package pageObjects;

import drivers.AndroidDriverSingleton;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    protected final AndroidDriver<MobileElement> driver;
    private WebDriverWait wait;

    public BasePage() {
        driver = AndroidDriverSingleton.getDriver();
        wait = new WebDriverWait(driver, 40);
    }

    public WebElement getElement(By locator) {
        WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return webElement;
    }

    public List<MobileElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public AndroidDriver<MobileElement> getDriver() {
        return driver;
    }


}
