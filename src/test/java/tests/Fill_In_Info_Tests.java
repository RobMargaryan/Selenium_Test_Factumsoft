package tests;

import base.BaseTest;
import org.testng.annotations.*;
import constants.messages.*;

public class Fill_In_Info_Tests extends BaseTest {
    @Test
    public void requestDemoTest() throws InterruptedException {
        basePage.getRequestDemoButton().click();
        Thread.sleep(2000);
        requestDemoPage.getFullNameTxtBox().sendKeys(RequestDemoMessages.FULLNAME_MESSAGE);
        requestDemoPage.getLastNameTxtBox().sendKeys(RequestDemoMessages.LASTNAME_MESSAGE);
        requestDemoPage.getEmailTxtBox().sendKeys(RequestDemoMessages.EMAIL_MESSAGE);
        requestDemoPage.getPhoneNumberTxtBox().sendKeys(RequestDemoMessages.PHONENUMBER_MESSAGE);
        requestDemoPage.getCompanyTxtBox().sendKeys(RequestDemoMessages.COMPANY_MESSAGE);
        requestDemoPage.getWebsiteTxtBox().sendKeys(RequestDemoMessages.WEBSITE_MESSAGE);
    }
    @Test
    public void getInTouchWithUsTest() throws InterruptedException {
        basePage.getContactUsButton().click();
        Thread.sleep(2000);
        contactUsPage.getFullNameTxtBox().sendKeys(ContactUsMessages.FULLNAME_MESSAGE);
        contactUsPage.getEmailTxtBox().sendKeys(ContactUsMessages.EMAIL_MESSAGE);
        contactUsPage.getCompanyTxtBox().sendKeys(ContactUsMessages.COMPANY_MESSAGE);
        contactUsPage.getInquiryDetailsTxtBox().sendKeys(ContactUsMessages.INQUIRYDETAILS_MESSAGE);
    }
}
