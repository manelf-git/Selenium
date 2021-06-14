import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.AboutPage;
import pages.BlogPage;
import pages.HomePage;
import pages.TwitterPage;
import util.Setup;
import java.io.IOException;
import static org.junit.Assert.assertTrue;


public class Stepdefs extends Setup {

    HomePage homePage;
    BlogPage blogPage;
    AboutPage aboutPage;
    TwitterPage twitterPage;

    @Before
    public void before() throws IOException {
        setUp();
    }

    @After
    public void after(Scenario scenario){
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
        }
        closeBrowser();
    }

    @Given("^I go to blog page$")
    public void iGoToBlogPage()  {
        homePage = new HomePage();
        homePage.navigateToBlogPage();
    }

    @Given("^I go to about page$")
    public void iGoToAboutPage()  {
        homePage = new HomePage();
        homePage.navigateToAboutPage();
    }

    @When("^I click on the twitter icon$")
    public void iClickOnTheTwitterIcon()  {
        aboutPage.clickOnTwitter();
    }

    @When("^I scroll down the about page$")
    public void iScrollDownTheAboutPage()  {
        aboutPage.scrolldown();
    }

    @Then("^I see blog page with title \"([^\"]*)\" is loaded$")
    public void iSeeBlogPageWithTitleIsLoaded(String pageTitle)  {
        blogPage = new BlogPage();
        String title =  blogPage.getPageTitle();
        assertTrue(title.contains(pageTitle));
    }

    @When("^I scroll down the blog page$")
    public void iScrollDownTheBlogPage()  {
        blogPage.scrolldown();
    }

    @Then("^I can see the page footer with text \"([^\"]*)\"$")
    public void iCanSeeThePageFooterWithText(String text)  {
        assertTrue(blogPage.returnPageFooterText().isDisplayed());
        assertTrue( blogPage.returnPageFooterText().getText().contains(text));
    }

    @Then("^I see about page with title \"([^\"]*)\" is loaded$")
    public void iSeeAboutPageWithTitleIsLoaded(String pageTitle)  {
        aboutPage =  new AboutPage();
        String title =  aboutPage.getPageTitle();
        assertTrue(title.contains(pageTitle));
    }

    @Then("^I can see the mobile twitter ionic page \"([^\"]*)\" is loaded$")
    public void iCanSeeTheMobileTwitterIonicPageIsLoaded(String pageTitle)  {
        twitterPage = new TwitterPage();
        String title =  twitterPage.getPageTitle();
        assertTrue(title.contains(pageTitle));
    }

    @Given("^IonicPartners home page is opened$")
    public void ionicpartnersHomePageIsOpened()  {
        driver.get("https://www.ionicpartners.com/");
    }
}