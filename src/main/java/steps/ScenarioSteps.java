package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    MarketPageSteps marketPageSteps = new MarketPageSteps();
    MarketFilteredPageSteps marketFilteredPageSteps = new MarketFilteredPageSteps();

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
    public void selectStepElectronics(String itemName){marketPageSteps.selectStepElectronics(itemName);    }


    @When("^Выбран раздел Телевизоры \"(.+)\"$")
    public void selectStepTv(String menuItem){marketPageSteps.selectStepTv(menuItem);    }

    @When("^Выбран расширенный поиск \"(.+)\"$")
    public void selectStepAllFilters(String menuItem){marketPageSteps.selectStepAllFilters(menuItem);   }

    @Then("^Задан параметр поиска от 20000 рублей \"(.+)\"$")
    public void selectStepPrice(String value){marketPageSteps.selectStepPrice(value);   }

    @When("^Нажата кнопка все бренды$")
    public void selectStepAllBrands(){marketPageSteps.selectStepAllBrands();   }

    @When("^Выбран производитель Samsung$")
    public void selectStepBranS(){marketPageSteps.selectStepBrandS();   }

    @When("^Выбран производитель LG$")
    public void selectStepBrandL(){marketPageSteps.selectStepBrandL();   }

    @When("^Нажата кнопку Применить$")
    public void selectStepFilterExecute(){marketPageSteps.selectStepFilterExecute();   }

    @Then("^Проверено, что элементов на странице 12 \"(.+)\"$")
    public void selectStepAssertElements(Integer expected){marketFilteredPageSteps.selectStepAssertElements(expected);   }

    @When("^Сохранен первый элемент в списке$")
    public void selectStepSaveFirstElements(){marketFilteredPageSteps.selectStepSaveFirstElements();   }

    @When("^В поисковую строку введено сохраненное значение$")
    public void selectStepSearchFirstElements(){marketFilteredPageSteps.selectStepSearchFirstElements();}

    @Then("^Найти и проверить, что наименование товара соответствует сохраненному значению$")
    public void selectStepAssertSearchElements(){marketFilteredPageSteps.selectStepAssertSearchElements();}
}
