package stepDef;

import io.cucumber.java.Before;

public class hook {
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    }
}


