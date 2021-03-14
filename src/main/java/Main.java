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

        WebElement category = driver.findElement(By.xpath("//option[@data-marker=\"option(99)\"]"));
        category.click();
        WebElement search = driver.findElement(By.id("search"));
        search.sendKeys("Принтер");
        WebElement city = driver.findElement(By.xpath("//div[@data-marker=\"search-form/region\"]"));
        city.click();
        WebElement cityInput = driver.findElement(By.xpath("//input[@data-marker=\"popup-location/region/input\"]"));
        cityInput.sendKeys("Владивосток");
        Thread.sleep(2000);
        WebElement citySelect = driver.findElement(By.xpath("//ul[@data-marker=\"suggest-list\"]/li[1]"));
        citySelect.click();

        WebElement cityConfirm = driver.findElement(By.cssSelector("[data-marker=\"popup-location/save-button\"]"));
        cityConfirm.click();
        WebElement checkbox = driver.findElement(By.cssSelector("[data-marker=\"delivery-filter/text\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
        if (!checkbox.isSelected()){
            checkbox.click();
        }
        WebElement searchConfirm = driver.findElement(By.cssSelector("[data-marker=\"search-filters/submit-button\"]"));
        searchConfirm.click();
        WebElement sort = driver.findElement(By.cssSelector("div.sort-select-3QxXG option[data-marker=\"option(2)\"]"));
        sort.click();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        for (int i = 1; i <= 3; i++) {
            WebElement name = driver.findElement(By.xpath("//div[@data-marker=\"catalog-serp\"]//div[@class=\"iva-item-root-G3n7v photo-slider-slider-3tEix iva-item-list-2_PpT items-item-1Hoqq items-listItem-11orH js-catalog-item-enum\"][" + i + "]//h3"));
            System.out.println(name.getText());
            WebElement price = driver.findElement(By.xpath("//div[@data-marker=\"catalog-serp\"]//div[@class=\"iva-item-root-G3n7v photo-slider-slider-3tEix iva-item-list-2_PpT items-item-1Hoqq items-listItem-11orH js-catalog-item-enum\"][" + i + "]//span[@class=\"price-text-1HrJ_ text-text-1PdBw text-size-s-1PUdo\"]"));
            System.out.println(price.getText());
        }

    }
}
