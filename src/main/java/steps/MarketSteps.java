package steps;

import com.sun.tracing.dtrace.Attributes;
import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.BaseSteps;
import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {

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
    public void selectStepPrice(String fieldName, String value) {
        new MarketPage().fillFieldPrice(fieldName,value);
    }

    @Step ("Выбран производитель Samsung{0}")
    public void selectStepBrandS(String menuItem) {
        new MarketPage().selectCheckBoxSamsung(menuItem);
    }

    @Step ("Выбран производитель LG{0}")
    public void selectStepBrandL(String menuItem) {
        new MarketPage().selectCheckBoxLg(menuItem);
    }

    @Step ("Нажата кнопку Применить{0}")
    public void selectStepFilterExecute(String menuItem) {
        new MarketPage().selectFilterExecute(menuItem);
    }

    @Step ("Проверено, что элементов на странице 12{0}")
    public void selectStepAssertElements(Integer expected) {
        new MarketPage().assertElements(expected);
    }

    @Step ("Сохранен первый элемент в списке{0}")
    public void selectStepSaveFirstElements() {
        new MarketPage().fillFirstElement();
    }

    @Step ("В поисковую строку введено запомненное значение{0}")
    public void selectStepSearchFirstElements(String itemName) {
        new MarketPage().searchFirstElement(itemName);
    }

    @Step ("Найти и проверить, что наименование товара соответствует запомненному значению{0}")
    public void selectStepAssertSearchElements() {
        new MarketPage().assertSearchElements();
    }



}
