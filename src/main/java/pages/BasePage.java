package pages;

import org.openqa.selenium.WebDriver;
import util.Setup;

public class BasePage extends Setup {
    static WebDriver driver;

    public BasePage() {
        this.driver = super.driver;
    }
}
