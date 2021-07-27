package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class MarketPage extends BasePageObject {

    @FindBy(xpath = "//span[contains(text(),'Электроника')]")
    public WebElement sectionElectronics;

    @FindBy(xpath = "//li/div/a[contains(text(),'Телевизоры')]")
    public WebElement sectionTv;

    @FindBy(xpath = "//span[contains(text(),'Все фильтры')]")
    public WebElement buttonAllFilters;

    @FindBy(xpath = "//input[@placeholder = '5 490']")
    WebElement fromPrice;

    @FindBy(xpath = "//input[@type = 'checkbox'][@value = 'Samsung']")
    WebElement checkboxSamsung;

    @FindBy(xpath = "//input[@type = 'checkbox'][@value = 'LG']")
    WebElement checkboxLg;

    @FindBy(xpath = "//a[contains(text(),'Показать')]")
    WebElement filterExecute;

    @FindBy(xpath = "//article//span[contains(text(),'Телевизор')]")
    WebElement allElements;

    @FindBy(xpath = "//input[@placeholder = 'Искать товары']")
    WebElement searchLine;

    @FindBy(xpath = "//span[contains(text(),'Найти')]")
    WebElement searchExecute;

    @FindBy(xpath = "//h3//a[contains(@title,'Телевизор')]")
    WebElement allAfterSearchElements;


    public MarketPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectSectionElectronics(String itemName){
        sectionElectronics.findElement(By.xpath("//span[contains(text(),'"+itemName+"')]")).click();
    }

    public void selectSectionTv(String itemName){
        sectionTv.findElement(By.xpath("//li/div/a[contains(text(),'"+itemName+"')]")).click();
    }

    public void selectButtonAllFilters(String itemName){
        buttonAllFilters.findElement(By.xpath("//span[contains(text(),'"+itemName+"')]")).click();
    }

    public void fillFieldPrice (String fieldName, String value) {
        fillField(fromPrice,value);
    }

    public void selectCheckBoxSamsung (String itemName) {
        checkboxSamsung.findElement(By.xpath("//input[@type = 'checkbox'][@value = '"+itemName+"']")).click();
    }

    public void selectCheckBoxLg (String itemName) {
        checkboxLg.findElement(By.xpath("//input[@type = 'checkbox'][@value = '"+itemName+"']")).click();
    }

    public void selectFilterExecute (String itemName) {
        filterExecute.findElement(By.xpath("//a[contains(text(),'"+itemName+"')]"));
    }

    List<WebElement> list1 = allElements.findElements(By.xpath("//article//span[contains(text(),'Телевизор')]"));

    public void assertElements (Integer expected) {
        Integer actual = list1.size();
        Assert.assertEquals("Количество элементов на странице не 12", expected, actual);
    }

    public void fillFirstElement () {
        String firstElement;
        firstElement = String.valueOf(list1.get(0));
        fillField(searchLine,firstElement);
    }

    public void searchFirstElement (String itemName) {
        searchExecute.findElement(By.xpath("//span[contains(text(),'"+itemName+"')]")).click();
    }

    List<WebElement> list2 = allAfterSearchElements.findElements(By.xpath("//h3//a[contains(@title,'Телевизор')]"));


    public void assertSearchElements () {
        String actual = String.valueOf(list2.get(0));
        String expected = String.valueOf(list1.get(0));
        Assert.assertEquals("Название первого элемента не совпаадет с поиском", expected, actual);
    }

}
