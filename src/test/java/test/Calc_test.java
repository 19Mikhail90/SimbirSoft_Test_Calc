package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import page.CalcPage;
import page.GooglePage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Calc_test {
    @BeforeEach
    void beforeEach() {
        open("https://www.google.com/");
    }

    @AfterEach
    public void addAttachments() {
        Selenide.closeWebDriver();
    }

    GooglePage googlePage = new GooglePage();

    @Test
    @DisplayName("Вычисления в калькуляторе")
    void shouldCalcAction() {
        step("Переход на страницу калькулятора", () -> {
            googlePage.search("Калькулятор");
        });
        step("Ввод данных для вычисления", () -> {
            CalcPage.one.click();
            CalcPage.multip.click();
            CalcPage.two.click();
            CalcPage.minus.click();
            CalcPage.three.click();
            CalcPage.plus.click();
            CalcPage.one.click();
            CalcPage.equals.click();
        });
        step("Проверка результата", () -> {
            String res = CalcPage.lineAction.getText();
            Assertions.assertEquals("1 × 2 - 3 + 1 =", res);
            CalcPage.result.shouldHave(Condition.exactText("0"));
        });
    }
}


