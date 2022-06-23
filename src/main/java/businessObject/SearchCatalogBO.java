package businessObject;

import drivers.AndroidDriverSingleton;

import static pageObjects.CatalogPage.getCatalogPage;

public class SearchCatalogBO {

    private SearchCatalogBO() {
    }

    public static boolean search(String text) {

        return getCatalogPage().isSearch(text);
    }

    public static void resetNavigate() {
        AndroidDriverSingleton.navigateBack(4);
    }

}
