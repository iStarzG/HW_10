package tests;


import org.junit.jupiter.api.Tag;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.DriveSelectorPage;

public class SearchCarParametrizedCsvFileTest extends TestBase {
    DriveSelectorPage driveSelectorPage = new DriveSelectorPage();
    @CsvFileSource(resources = "/TestData/SearchCarParametrizedCsvFileTest.csv")
    @ParameterizedTest(name = "Поиск марки автомобиля {0} на сайте драйв2 с моделью авто {1}" )
    @Tag("WEB")
void carForSearchOnTheDriveWithFile(String searchCar, String model) {
    driveSelectorPage.openPage()
            .setValueInputCar(searchCar)
            .clickButton()
            .resultCheck(searchCar)
            .modelCheck(model);
}
}