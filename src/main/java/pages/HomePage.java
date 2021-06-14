package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    protected WebDriver driver;
    By blogLink = By.linkText("Blog");
    By aboutLink = By.linkText("About us");

    public HomePage() {
        driver = super.driver;
    }

    public void navigateToBlogPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(blogLink));
        driver.findElement(blogLink).click();
    }

    public void navigateToAboutPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(aboutLink));
        driver.findElement(aboutLink).click();
    }
}
