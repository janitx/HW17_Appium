package businessObject;

import drivers.AndroidDriverSingleton;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pageObjects.HomePage;
import pageObjects.NotebookPage;

import static pageObjects.CartPage.getCartPage;
import static pageObjects.CatalogPage.getCatalogPage;
import static pageObjects.HomePage.getHomePage;
import static pageObjects.NotebookPage.getNotebookPage;

public class CartBO {

    public static int addToCart() {

        HomePage homePage = getHomePage();
        NotebookPage notebookPage = getNotebookPage();

        homePage.clickCatalogButton();
        getCatalogPage().clickNotebooksButton();
        notebookPage.clickNotebookButton();
        notebookPage.clickAddToCartButton();
        homePage.clickBasketButton();

        return getCartPage().getQuantity();
    }

    public static String deleteFromCart() {

        HomePage homePage = getHomePage();

        homePage.clickCatalogButton();
        getCatalogPage().clickNotebooksButton();
        getNotebookPage().clickNotebookButton().clickAddToCartButton(); // E
        homePage.clickBasketButton();
        getCartPage().clickThreeDotButton().deleteLink();

        return getCartPage().getCartIsEmptyMessage();
    }

    public static void resetNavigate() {
        AndroidDriverSingleton.navigateBack(3);
    }

}
