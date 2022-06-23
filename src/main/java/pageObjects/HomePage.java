package pageObjects;


import pageObjects.ui.BottomNavigation;

public class HomePage extends BasePage {

    BottomNavigation bottomNavigation;

    public HomePage() {
        super();
        bottomNavigation = new BottomNavigation();
    }

    public static HomePage getHomePage() {
        return new HomePage();
    }

    public HomePage clickHomeButton() {
        bottomNavigation.clickHomeButton();
        return this;
    }

    public HomePage clickCatalogButton() {
        bottomNavigation.clickCatalogButton();
        return this;
    }

    public HomePage clickBasketButton() {
        bottomNavigation.clickBasketButton();
        return this;
    }

    public HomePage clickListsButton() {
        bottomNavigation.clickListsButton();
        return this;
    }

    public HomePage clickMoreButton() {
        bottomNavigation.clickMoreButton();
        return this;
    }

}
