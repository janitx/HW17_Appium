package pageObjects;

import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import reports.TestListenerReport;

import java.util.List;

public class CatalogPage extends BasePage {

    private By search = By.id("ua.com.rozetka.shop:id/view_search_tv");
    private By search2 = By.id("ua.com.rozetka.shop:id/search_et_query");
    private By suggestion = By.id("ua.com.rozetka.shop:id/item_sections_tv_title");
    private By title = By.id("ua.com.rozetka.shop:id/search_offer_item_tv_title");
    private static final Logger logger = LogManager.getLogger(TestListenerReport.class);

    public CatalogPage() {
        super();
    }

    public static CatalogPage getCatalogPage() {
        return new CatalogPage();
    }

    public CatalogPage clickSearchField() {
        getElement(search).click();
        return this;
    }

    public CatalogPage searchValue(String text) {
        driver.findElement(search2).sendKeys(text);
        return this;
    }

    public CatalogPage clickNotebooksButton() {
        getElement(suggestion).click();
        return this;
    }

    public boolean isSearch(String text) {

        clickSearchField();
        searchValue(text);

        List<MobileElement> elements = getElements(title);

        int indexOf = elements.get(0).getText().indexOf(text);

        logger.info(elements.get(0).getText());


        return (indexOf > -1) ? true : false;
    }
}
