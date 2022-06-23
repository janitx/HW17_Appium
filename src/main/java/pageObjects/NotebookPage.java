package pageObjects;

import org.openqa.selenium.By;

public class NotebookPage extends BasePage {

    private By notebookButton = By.id("ua.com.rozetka.shop:id/portal_group_big_item_tv_group_title_big");
    private By addToCartButton = By.id("ua.com.rozetka.shop:id/section_offer_cv_cart");

    public static NotebookPage getNotebookPage() {
        return new NotebookPage();
    }

    public NotebookPage clickNotebookButton() {
        getElement(notebookButton).click();
        return this;
    }

    public NotebookPage clickAddToCartButton() {
        getElements(addToCartButton).get(0).click();
        return this;
    }

}
