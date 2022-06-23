package capabilitiesFactory;

import constants.EmulatorRozetkaConstants;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public final class CapabilitiesFactory {

    private CapabilitiesFactory() {
    }

    public static DesiredCapabilities getCapabilities(String name) {

        if (name.equals("samsung")) {
            return getSamsung();
        }

        return getEmulator();
    }

    public static URL getAppiumServerURL() {
        try {
            return new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static DesiredCapabilities getEmulator() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, EmulatorRozetkaConstants.PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, EmulatorRozetkaConstants.DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.UDID, EmulatorRozetkaConstants.UDID);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, EmulatorRozetkaConstants.APP_PACKAGE);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, EmulatorRozetkaConstants.APP_ACTIVITY);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, EmulatorRozetkaConstants.NEW_COMMAND_TIMEOUT);

        return capabilities;
    }

    private static DesiredCapabilities getSamsung() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, EmulatorRozetkaConstants.PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, EmulatorRozetkaConstants.DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.UDID, EmulatorRozetkaConstants.UDID);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, EmulatorRozetkaConstants.APP_PACKAGE);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, EmulatorRozetkaConstants.APP_ACTIVITY);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, EmulatorRozetkaConstants.NEW_COMMAND_TIMEOUT);

        return capabilities;
    }
}
