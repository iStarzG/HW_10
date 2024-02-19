package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DriveSelectorPage {
    private final SelenideElement
            searchInputCar = $(".is-tip-active"),
            buttonClick = $(".c-button--primary"),
            resultCarCheck = $(".u-card-link"),
    modelCarCheck = $(".c-search-presets");

    public DriveSelectorPage openPage() {
        open("https://www.drive2.ru/");
        return this;
    }
    public DriveSelectorPage setValueInputCar(String searchCar){
        searchInputCar.setValue(searchCar);
        return this;
    }
    public DriveSelectorPage clickButton () {
        buttonClick.click();
        return this;
    }
    public DriveSelectorPage resultCheck (String searchCar) {
        resultCarCheck.shouldHave(text(searchCar));
        return this;
    }
    public DriveSelectorPage modelCheck (String model) {
        modelCarCheck.shouldHave(text(model));
        return this;
    }
}
