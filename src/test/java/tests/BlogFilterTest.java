package tests;
import base.BaseTest;
import org.testng.annotations.*;
import constants.messages.*;

import static org.testng.Assert.assertEquals;

public class BlogFilterTest extends BaseTest {
    @Test
    public void blogFilterTest() {
        basePage.getBlogButton();
        blogPage.getFilterTitle();
        assertEquals(blogPage.getERPPricingTitle().getText(), BlogMessages.ERPPRICING_MESSAGE);
    }

}
