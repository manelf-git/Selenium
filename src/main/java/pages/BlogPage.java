package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage {
    protected WebDriver driver;
    By pageFooterText =  By.xpath("//div[@id='footer']//p");

    public BlogPage() {
        driver = super.driver;
    }

    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public void scrolldown() {
       scrolldownPage();
    }

    public WebElement returnPageFooterText() {
        return driver.findElement(pageFooterText);
    }
}

