package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.DriveSelectorPage;

public class SearchCarParametrizedValueSourceTest extends TestBase {
    DriveSelectorPage driveSelectorPage = new DriveSelectorPage();
    @Tag("WEB")
    @ValueSource(strings = {"Ford", "Toyota"})
    @ParameterizedTest(name = "Проверка поиска авто {0} через поисковую строку")
void SearchResultsShouldHave(String searchCar) {
        driveSelectorPage.openPage()
                .setValueInputCar(searchCar)
                .clickButton()
                .resultCheck(searchCar);
    }
}
