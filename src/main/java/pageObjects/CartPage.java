package pageObjects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

public class CartPage extends BasePage {

    private static final By quantity = By.id("ua.com.rozetka.shop:id/view_number_picker_et_value");
    private static final By threeDotButton = By.id("ua.com.rozetka.shop:id/item_cart_offer_iv_menu");
    private static final By dropdownLink = By.id("ua.com.rozetka.shop:id/title");
    private static final By cartIsEmptyMessage = By.id("ua.com.rozetka.shop:id/empty_base_tv_title");


    public static CartPage getCartPage() {
        return new CartPage();
    }

    public String getCartIsEmptyMessage() {
        return getElement(cartIsEmptyMessage).getText();

    }


    public int getQuantity() {
        return Integer.parseInt(getElement(quantity).getText());

    }

    public CartPage clickThreeDotButton() {

        getElement(threeDotButton).click();
        return this;
    }

    public CartPage deleteLink() {
        List<MobileElement> elements = driver.findElements(dropdownLink);
        elements.get(2).click();
        return this;
    }

    @Override
    public String toString() {
        return "CartPage{" +
                "quantity=" + quantity +
                '}';
    }

}
