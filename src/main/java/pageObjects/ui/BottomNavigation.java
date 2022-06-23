package pageObjects.ui;

import drivers.AndroidDriverSingleton;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class BottomNavigation {
    private static final By home = By.xpath("//android.widget.FrameLayout[@content-desc=\"Головна\"]/android.widget.FrameLayout/android.widget.ImageView");
    private static final By catalog = By.xpath("//android.widget.FrameLayout[@content-desc=\"Каталог\"]/android.widget.FrameLayout/android.widget.ImageView");
    private static final By basket = By.xpath("//android.widget.FrameLayout[@content-desc=\"Кошик\"]/android.widget.FrameLayout/android.widget.ImageView");
    private static final By lists = By.xpath("//android.widget.FrameLayout[@content-desc=\"Списки\"]/android.widget.FrameLayout/android.widget.ImageView");
    private static final By more = By.xpath("//android.widget.FrameLayout[@content-desc=\"Ще\"]/android.widget.FrameLayout/android.widget.ImageView");

    private final AndroidDriver<MobileElement> driver;

    public BottomNavigation() {
        driver = AndroidDriverSingleton.getDriver();
    }

    public void clickHomeButton() {
        driver.findElement(home).click();
    }

    public void clickCatalogButton() {
        driver.findElement(catalog).click();
    }

    public void clickBasketButton() {
        driver.findElement(basket).click();
    }

    public void clickListsButton() {
        driver.findElement(lists).click();
    }

    public void clickMoreButton() {
        driver.findElement(more).click();
    }


}
