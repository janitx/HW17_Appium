package drivers;

import capabilitiesFactory.CapabilitiesFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public final class AndroidDriverSingleton {

    private static AndroidDriver<MobileElement> driver;

    private AndroidDriverSingleton() {
    }

    public static AndroidDriver getDriver() {
        if (driver == null) {
            driver = new AndroidDriver(CapabilitiesFactory.getAppiumServerURL(), CapabilitiesFactory.getCapabilities("emulator"));
            driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static void navigateBack(int count) {
        for (int i = 0; i < count; i++) {
            driver.navigate().back();
        }
    }

}
