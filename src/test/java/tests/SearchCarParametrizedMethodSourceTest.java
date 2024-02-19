package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.DriveSelectorPage;

import java.util.stream.Stream;

public class SearchCarParametrizedMethodSourceTest extends TestBase {
    DriveSelectorPage driveSelectorPage = new DriveSelectorPage();
    static Stream<Arguments> carForSearchOnTheDrive() {
        return Stream.of(
                Arguments.of("Ford", "Focus"),
                Arguments.of("Toyota", "Corolla"));
    }
    @MethodSource
    @ParameterizedTest(name = "Поиск марки автомобиля {0} на сайте драйв2 с моделью авто {1}" )
    @Tag("WEB")
    void carForSearchOnTheDrive(String searchCar, String model) {
        driveSelectorPage.openPage()
                .setValueInputCar(searchCar)
                .clickButton()
                .resultCheck(searchCar)
                .modelCheck(model);
    }
}

