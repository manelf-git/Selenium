package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage extends BasePage {
    protected WebDriver driver;
    By twitterLink =  By.xpath("//a[@href='https://twitter.com/IonicPartners']");

    public AboutPage() {
        driver = super.driver;
    }

    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public void scrolldown() {
        scrolldownPage();
    }

    public void clickOnTwitter() {
        driver.findElement(twitterLink).click();
    }
}