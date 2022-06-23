import businessObject.CartBO;
import constants.AppConstants;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckCartTest extends BaseTest {

    @Test(priority = 1)
    public void deleteItemFromCart() {
        assertEquals(CartBO.deleteFromCart(), AppConstants.CART_IS_EMPTY_MESSAGE);
    }

    @Test(priority = 2)
    public void addItemToCart() {
        assertEquals(CartBO.addToCart(), 1);
    }

    @AfterMethod
    public void afterTest() {
        CartBO.resetNavigate();
    }
}
