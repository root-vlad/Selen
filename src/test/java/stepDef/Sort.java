package stepDef;

import org.openqa.selenium.By;

public enum Sort {

    По_умолчанию(new By.ByXPath("//div[@class=\"sort-select-3QxXG select-select-box-3LBfK select-size-s-2gvAy\"]//option[@value=\"101\"]")),
    Дешевле(new By.ByXPath("//div[@class=\"sort-select-3QxXG select-select-box-3LBfK select-size-s-2gvAy\"]//option[@value=\"1\"]")),
    Дороже(new By.ByXPath("//div[@class=\"sort-select-3QxXG select-select-box-3LBfK select-size-s-2gvAy\"]//option[@value=\"2\"]")),
    По_дате(new By.ByXPath("//div[@class=\"sort-select-3QxXG select-select-box-3LBfK select-size-s-2gvAy\"]//option[@value=\"104\"]"));

    public By by;
    Sort(By by) {
        this.by = by;
    }
}
