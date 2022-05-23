package base;

import constants.locators.PartnershipConstants;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.*;
import constants.urls.Urls;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected PartnershipPage partnershipPage;
    protected ContactUsPage contactUsPage;
    protected RequestDemoPage requestDemoPage;
    protected CareerPage careerPage;
    protected BlogPage blogPage;

    @BeforeSuite
    //@Parameters("browser")
    public void setUp() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        //DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setBrowserName(browser);

        //driver = new RemoteWebDriver(new URL("http://localhost:4444/"), caps);

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(Urls.HOME_URL);

        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        partnershipPage = new PartnershipPage(driver);
        requestDemoPage = new RequestDemoPage(driver);
        careerPage = new CareerPage(driver);
        blogPage = new BlogPage(driver);
    }

    @AfterSuite
   public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void afterTest(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try {
                Files.move(Paths.get(screenshot.getPath()), Paths.get("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}