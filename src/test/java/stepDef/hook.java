package stepDef;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hook {
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    }
}
