package pagesBE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseFunctions {
    private WebDriver browser;

    public BaseFunctions() {

    System.setProperty("webdriver.chrome.driver", "/Users/viktorijashilova/Downloads/chromedriver");
    browser = new ChromeDriver();
    browser.manage().window().maximize();
}

    public void goToUrl(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }

        browser.get(url);
    }
}
