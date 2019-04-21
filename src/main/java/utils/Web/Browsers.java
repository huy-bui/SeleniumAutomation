package utils.Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Common.FilePath;

public class Browsers {

    public static WebDriver InitialDriver(){
        System.setProperty("webdriver.chrome.driver", FilePath.CHROME_DRIVER);
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static void Open(WebDriver driver, String URL){
        driver.get(URL);
        driver.manage().window().maximize();
    }

    public static  void Close(WebDriver driver){
        driver.quit();
    }
}