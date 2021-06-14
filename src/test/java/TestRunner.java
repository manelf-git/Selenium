import cucumber.api.junit.*;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"},
        plugin = {"html:target/cucumberHtmlReport"}
)
public class TestRunner {}
