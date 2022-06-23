import businessObject.SearchCatalogBO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchCatalogTest extends BaseTest {

    @Test
    public void searchCatalog() {
        assertTrue(SearchCatalogBO.search("LC34G55TWWIXCI"));
    }

    @AfterMethod
    public void afterTest() {
        SearchCatalogBO.resetNavigate();
    }
}
