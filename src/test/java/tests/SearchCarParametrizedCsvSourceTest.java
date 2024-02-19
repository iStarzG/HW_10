package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.DriveSelectorPage;

public class SearchCarParametrizedCsvSourceTest extends TestBase {
    DriveSelectorPage driveSelectorPage = new DriveSelectorPage();

    @CsvSource(value = {
            "Ford | Focus",
            "Toyota | Corolla"
    }, delimiter = '|')
    @ParameterizedTest(name = "Поиск марки автомобиля {0} на сайте драйв2 с моделью авто {1}")
    @Tag("WEB")
    void carForSearchOnTheDriveWithCsvSource(String searchCar, String model) {
        driveSelectorPage.openPage()
                .setValueInputCar(searchCar)
                .clickButton()
                .resultCheck(searchCar)
                .modelCheck(model);
    }
}
