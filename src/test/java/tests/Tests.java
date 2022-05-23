package tests;

import base.BaseTest;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import constants.messages.*;

import static org.testng.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void firstTest() {
        WebElement homeIndustryText = homePage.getIndustryTitle();
        assertEquals(homeIndustryText.getText(), HomePageMessages.INDUSTRIES_MESSAGE);
        basePage.getPartnershipButton().click();

        WebElement educationTitle = partnershipPage.getBusinessTitle();
        assertEquals(educationTitle.getText(), PartnershipMessages.EDUCATION_MESSAGE);
        basePage.getContactUsButton().click();

        WebElement contactUsPageManufacturingTitle = contactUsPage.getManufacturingTitle();
        assertEquals(contactUsPageManufacturingTitle.getText(), ContactUsMessages.MANUFACTURING_MESSAGE);

    }

    @Test
    public void homePageAndPartnership() {
        WebElement erpTitle = homePage.getERPModulesTitle();
        assertEquals(erpTitle.getText(), HomePageMessages.ERPMODULES_MESSAGE);
        basePage.getPartnershipButton().click();

        WebElement quickLinkTitle = partnershipPage.getQuickLinkeTitle();
        assertEquals(quickLinkTitle.getText(), PartnershipMessages.QUICKLINK_MESSAGE);
    }

    @Test
    public void homePageAndContactUs() {
        WebElement homeAccount = homePage.getSubscribersTitle();
        assertEquals(homeAccount.getText(), HomePageMessages.SUBSCRIBERS_MESSAGE);
        basePage.getContactUsButton().click();

        WebElement inTouchHeaderTitle = contactUsPage.getInTouchHeaderTitle();
        assertEquals(inTouchHeaderTitle.getText(), ContactUsMessages.GETINTOUCH_MESSAGE);
    }

    @Test
    public void partnershipAndContactUs() {
        basePage.getPartnershipButton().click();
        WebElement biReportTitle = partnershipPage.getBIReportTitle();
        assertEquals(biReportTitle.getText(), PartnershipMessages.BIREPORT_MESSAGE);

        basePage.getContactUsButton().click();
        WebElement crmTitle = contactUsPage.getCRMTitle();
        assertEquals(crmTitle.getText(), ContactUsMessages.CRM_MESSAGE);
    }
}