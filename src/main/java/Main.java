import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avito.ru/");
        driver.manage().window().maximize();

        By byCategory = By.xpath("//option[@data-marker=\"option(99)\"]");
        By bySearch = By.id("search");
        By byCity = By.xpath("//div[@data-marker=\"search-form/region\"]");
        By byCityInput = By.xpath("//input[@data-marker=\"popup-location/region/input\"]");
        By byCitySelect = By.xpath("//ul[@data-marker=\"suggest-list\"]/li[1]");
        By byCityConfirm = By.cssSelector("[data-marker=\"popup-location/save-button\"]");
        By byCheckbox = By.cssSelector("[data-marker=\"delivery-filter/text\"]");
        By bySearchConfirm = By.cssSelector("[data-marker=\"search-filters/submit-button\"]");
        By bySort = By.cssSelector("div.sort-select-3QxXG option[data-marker=\"option(2)\"]");
        By[] byName = new By[3];
        By[] byPrice = new By[3];
        for (int i = 0; i < 3; i++) {
            byName[i] = By.xpath("//div[@data-marker=\"catalog-serp\"]//div[@class=\"iva-item-root-G3n7v photo-slider-slider-3tEix iva-item-list-2_PpT items-item-1Hoqq items-listItem-11orH js-catalog-item-enum\"][" + (i + 1) + "]//h3");
            byPrice[i] = By.xpath("//div[@data-marker=\"catalog-serp\"]//div[@class=\"iva-item-root-G3n7v photo-slider-slider-3tEix iva-item-list-2_PpT items-item-1Hoqq items-listItem-11orH js-catalog-item-enum\"][" + (i + 1) + "]//span[@class=\"price-text-1HrJ_ text-text-1PdBw text-size-s-1PUdo\"]");
        }

        WebElement category = driver.findElement(byCategory);
        category.click();
        WebElement search = driver.findElement(bySearch);
        search.sendKeys("Принтер");
        WebElement city = driver.findElement(byCity);
        city.click();
        WebElement cityInput = driver.findElement(byCityInput);
        cityInput.sendKeys("Владивосток");
        Thread.sleep(2000);
        WebElement citySelect = driver.findElement(byCitySelect);
        citySelect.click();

        WebElement cityConfirm = driver.findElement(byCityConfirm);
        cityConfirm.click();
        WebElement checkbox = driver.findElement(byCheckbox);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        WebElement searchConfirm = driver.findElement(bySearchConfirm);
        searchConfirm.click();
        WebElement sort = driver.findElement(bySort);
        sort.click();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        for (int i = 0; i < 3; i++) {
            WebElement name = driver.findElement(byName[i]);
            System.out.println(name.getText());
            WebElement price = driver.findElement(byPrice[i]);
            System.out.println(price.getText());
        }


        driver.close();
    }
}
