package stepDef;

import org.openqa.selenium.By;

public enum Categories {
    любая_категория(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"1\"]")),
    автомобили(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"9\"]")),
    мотоциклы(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"14\"]")),
    грузовики(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"81\"]")),
    водный_транспорт(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"11\"]")),
    запчасти(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"10\"]")),
    недвижимость(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"4\"]")),
    квартиры(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"24\"]")),
    комнаты(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"23\"]")),
    дома(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"25\"]")),
    земельные_участки(new By.ByXPath("//option[@value=\"26\"]")),
    гаражи(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"85\"]")),
    коммерческая_недвижимость(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"42\"]")),
    недвижимость_за_рубежом(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"86\"]")),
    работа(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"110\"]")),
    вакансии(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"111\"]")),
    резюме(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"112\"]")),
    услуги(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"114\"]")),
    личные_вещи(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"5\"]")),
    одежда(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"27\"]")),
    детская_одежда(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"29\"]")),
    игрушки(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"30\"]")),
    часы(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"28\"]")),
    здороввье(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"88\"]")),
    для_дома(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"2\"]")),
    бытовая_техника(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"21\"]")),
    мебель(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"20\"]")),
    посуда(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"87\"]")),
    продукты(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"82\"]")),
    ремонт(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"19\"]")),
    растения(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"106\"]")),
    электроника(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"6\"]")),
    аудио(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"32\"]")),
    игры(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"97\"]")),
    компьютеры(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"31\"]")),
    ноутбуки(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"98\"]")),
    оргтехника(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"99\"]")),
    планшеты(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"96\"]")),
    телефоны(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"84\"]")),
    для_компьютера(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"101\"]")),
    фототехника(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"105\"]")),
    хобби(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"33\"]")),
    велосипеды(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"34\"]")),
    книги(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"83\"]")),
    коллекционирование(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"36\"]")),
    музыка(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"38\"]")),
    охота(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"102\"]")),
    спорт(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"39\"]")),
    животные(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"35\"]")),
    собаки(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"89\"]")),
    кошки(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"90\"]")),
    птицы(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"91\"]")),
    аквариум(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"92\"]")),
    другие_животные(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"93\"]")),
    товары_для_животных(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"94\"]")),
    бизнес_и_оборудование(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"8\"]")),
    бизнес(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"116\"]")),
    оборудование(new By.ByXPath("//select[@id=\"category\"]/option[@value=\"40\"]"));



    public By by;
    Categories(By by) {
        this.by = by;
    }
}
