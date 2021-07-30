package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {

    @Step ("Выбран раздел Электроника{0}")
    public void selectStepElectronics(String itemName) {
        new MarketPage().selectSectionElectronics(itemName);
    }

    @Step ("Выбран раздел Телевизоры{0}")
    public void selectStepTv(String menuItem) {
        new MarketPage().selectSectionTv(menuItem);
    }

    @Step ("Выбран расширенный поиск{0}")
    public void selectStepAllFilters(String menuItem) {
        new MarketPage().selectButtonAllFilters(menuItem);
    }

    @Step ("Задан параметр поиска от 20000 рублей{0}")
    public void selectStepPrice(String value) {
        new MarketPage().fillFieldPrice(value);
    }

    @Step ("Нажата кнопка все бренды")
    public void selectStepAllBrands() { new MarketPage().selectAllBrands();    }

    @Step ("Выбран производитель Samsung{0}")
    public void selectStepBrandS() {
        new MarketPage().selectCheckBoxSamsung();
    }

    @Step ("Выбран производитель LG{0}")
    public void selectStepBrandL() {
        new MarketPage().selectCheckBoxLg();
    }

    @Step ("Нажата кнопку Применить{0}")
    public void selectStepFilterExecute() { new MarketPage().selectFilterExecute();
    }


}
