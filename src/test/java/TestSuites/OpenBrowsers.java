package TestSuites;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utils.Web.Browsers;

public class OpenBrowsers {

    @Test
    public void TestOpenGoogle() {
        String URL = "https://www.google.com/";

        WebDriver driver = Browsers.InitialDriver();
        Browsers.Open(driver, URL);
        Browsers.Close(driver);
    }
}
