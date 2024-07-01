import com.codeborne.selenide.Condition;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CsvTestForLitress {

    @CsvSource(value = {
            "Биография|Наполеон: биография",
            "История|Москва"
    }, delimiter = "|")

    @ParameterizedTest(name = "В поисковой выдаче на litress.ru должно отображаться 24 результатов по запросу {0}")
    void simpleTestWithParameters2 (String genre, String name) {

        $("[data-testid=search__input]").setValue(genre);
        $("[data-testid=search__button]").click();
        $$("data-testid=art__wrapper").shouldHave(Condition text(expe))

}
