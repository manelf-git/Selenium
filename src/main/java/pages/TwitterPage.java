package pages;

import org.openqa.selenium.WebDriver;

public class TwitterPage extends BasePage {
    protected WebDriver driver;

    public TwitterPage() {
        driver = super.driver;
    }

    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }
}
