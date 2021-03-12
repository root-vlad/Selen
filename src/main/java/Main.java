import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.avito.ru/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("[data-marker=\"option(99)\"]")).click();
        driver.findElement(By.id("search")).sendKeys("Принтер");
        driver.findElement(By.cssSelector("[data-marker=\"search-form/region\"]")).click();
        driver.findElement(By.cssSelector("[data-marker=\"popup-location/region/input\"]")).sendKeys("Владивосток");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@data-marker=\"suggest-list\"]/li[1]")).click();

        driver.findElement(By.cssSelector("[data-marker=\"popup-location/save-button\"]")).click();
        WebElement element = driver.findElement(By.cssSelector("[data-marker=\"delivery-filter/text\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        if (!driver.findElement(By.cssSelector("[data-marker=\"delivery-filter/text\"]")).isSelected()){
            driver.findElement(By.cssSelector("[data-marker=\"delivery-filter/text\"]")).click();
        }
        driver.findElement(By.cssSelector("[data-marker=\"search-filters/submit-button\"]")).click();
        driver.findElement(By.cssSelector("div.sort-select-3QxXG option[data-marker=\"option(2)\"]")).click();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        for (int i = 1; i <= 3; i++) {
            System.out.println(driver.findElement(By.xpath("//div[@data-marker=\"catalog-serp\"]//div[@class=\"iva-item-root-G3n7v photo-slider-slider-3tEix iva-item-list-2_PpT items-item-1Hoqq items-listItem-11orH js-catalog-item-enum\"][" + i + "]//h3")).getText());
            System.out.println(driver.findElement(By.xpath("//div[@data-marker=\"catalog-serp\"]//div[@class=\"iva-item-root-G3n7v photo-slider-slider-3tEix iva-item-list-2_PpT items-item-1Hoqq items-listItem-11orH js-catalog-item-enum\"][" + i + "]//span[@class=\"price-text-1HrJ_ text-text-1PdBw text-size-s-1PUdo\"]")).getText());
        }

    }
}
