package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;


public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    MarketSteps marketSteps = new MarketSteps();

    @When("^Перейти в яндекс маркет \"(.+)\"$")
    public void selectStepMarket(String menuItem) {mainPageSteps.selectStepMarket(menuItem);    }

    @When("^Перейти на вторую вкладку$")
    public void selectSecondTab() {
        String winHandleBefore = BaseSteps.driver.getWindowHandle();
        for(String winHandle : BaseSteps.driver.getWindowHandles()){
            if(!winHandle.equals(winHandleBefore)) {
                BaseSteps.driver.switchTo().window(winHandle);
    }}}

    @When("^Выбран раздел Электроника\"(.+)\"$")
    public void selectStepElectronics(String itemName){marketSteps.selectStepElectronics(itemName);    }


    @When("^Выбран раздел Телевизоры \"(.+)\"$")
    public void selectStepTv(String menuItem){marketSteps.selectStepTv(menuItem);    }

    @When("^Выбран расширенный поиск \"(.+)\"$")
    public void selectStepAllFilters(String menuItem){marketSteps.selectStepAllFilters(menuItem);   }

    @Then("^Задан параметр поиска от 20000 рублей \"(.+)\"$")
    public void selectStepPrice(String fieldName, String value){marketSteps.selectStepPrice(fieldName,value);   }

    @When("^Выбран производитель Samsung \"(.+)\"$")
    public void selectStepBranS(String menuItem){marketSteps.selectStepBrandS(menuItem);   }

    @When("^Выбран производитель LG \"(.+)\"$")
    public void selectStepBrandL(String menuItem){marketSteps.selectStepBrandL(menuItem);   }

    @When("^Нажата кнопку Применить \"(.+)\"$")
    public void selectStepFilterExecute(String menuItem){marketSteps.selectStepFilterExecute(menuItem);   }

    @Then("^Проверено, что элементов на странице 12 \"(.+)\"$")
    public void selectStepAssertElements(Integer expected){marketSteps.selectStepAssertElements(expected);   }

    @When("^Сохранен первый элемент в списке$")
    public void selectStepSaveFirstElements(){marketSteps.selectStepSaveFirstElements();   }

    @When("^В поисковую строку введено сохраненное значение \"(.+)\"$")
    public void selectStepSearchFirstElements(String itemName){marketSteps.selectStepSearchFirstElements(itemName);}

    @Then("^Найти и проверить, что наименование товара соответствует сохраненному значению$")
    public void selectStepAssertSearchElements(){marketSteps.selectStepAssertSearchElements();}
}
