package stepDef;

import io.cucumber.java.ParameterType;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDef {

    WebDriver driver = new ChromeDriver();

    @ParameterType(".*")
    public Categories categories(String category){
        return Categories.valueOf(category);
    }

    @ParameterType(".*")
    public Sort sort(String sorts){return Sort.valueOf(sorts);}

    @Пусть("открыт ресурс авито")
    public void open() {
        driver.get("https://www.avito.ru/");
        driver.manage().window().maximize();
    }

    @И("в выпадающем списке категорий выбрана {categories}")
    public void categorySet(Categories byCategory) {
        WebElement category = driver.findElement(byCategory.by);
        category.click();
    }

    @И("в поле поиска введено значение {word}")
    public void searchString(String str) {
        By bySearch = By.id("search");
        WebElement search = driver.findElement(bySearch);
        search.sendKeys(str);
    }

    @Тогда("кликунть по выпадающему списку региона")
    public void citySeratch() {
        By byCity = By.xpath("//div[@data-marker=\"search-form/region\"]");
        WebElement city = driver.findElement(byCity);
        city.click();
    }

    @Тогда("в пол регион введено значение {word}")
    public void citySet(String str) {
        By byCityInput = By.xpath("//input[@data-marker=\"popup-location/region/input\"]");
        WebElement cityInput = driver.findElement(byCityInput);
        cityInput.sendKeys(str);
    }

    @И("нажата кнопка показать объявления")
    public void citySubmit() throws InterruptedException {
        Thread.sleep(2000);
        By byCitySelect = By.xpath("//ul[@data-marker=\"suggest-list\"]/li[1]");
        WebElement citySelect = driver.findElement(byCitySelect);
        citySelect.click();
    }

    @Тогда("открылась страница резльтаты по запросу {word}")
    public void cityEnter(String str) {
        By byCityConfirm = By.cssSelector("[data-marker=\"popup-location/save-button\"]");
        WebElement cityConfirm = driver.findElement(byCityConfirm);
        cityConfirm.click();
    }

    @И("активирован чекбокс только с фотографией")
    public void activationCheckbox() {
        By byCheckbox = By.cssSelector("[data-marker=\"delivery-filter/text\"]");
        WebElement checkbox = driver.findElement(byCheckbox);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        By bySearchConfirm = By.cssSelector("[data-marker=\"search-filters/submit-button\"]");
        WebElement searchConfirm = driver.findElement(bySearchConfirm);
        searchConfirm.click();
    }

    @И("в выпадающем списке сортировка выбрано значение {sort}")
    public void sortList(Sort bySort) {
        WebElement sort = driver.findElement(bySort.by);
        sort.click();
    }

    @И("в консоль выведено значение названия и цены {int} первых товаров")
    public void outputInfo(int arg0) {
        By[] byName = new By[arg0];
        By[] byPrice = new By[arg0];
        for (int i = 0; i < arg0; i++) {
            byName[i] = By.xpath("//div[@data-marker=\"catalog-serp\"]//div[@class=\"iva-item-root-G3n7v photo-slider-slider-3tEix iva-item-list-2_PpT items-item-1Hoqq items-listItem-11orH js-catalog-item-enum\"][" + (i + 1) + "]//h3");
            byPrice[i] = By.xpath("//div[@data-marker=\"catalog-serp\"]//div[@class=\"iva-item-root-G3n7v photo-slider-slider-3tEix iva-item-list-2_PpT items-item-1Hoqq items-listItem-11orH js-catalog-item-enum\"][" + (i + 1) + "]//span[@class=\"price-text-1HrJ_ text-text-1PdBw text-size-s-1PUdo\"]");
        }
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        for (int i = 0; i < arg0; i++) {
            WebElement name = driver.findElement(byName[i]);
            System.out.println(name.getText());
            WebElement price = driver.findElement(byPrice[i]);
            System.out.println(price.getText());
        }
        driver.close();
    }
}