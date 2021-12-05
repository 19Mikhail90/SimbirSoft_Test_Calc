package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    public GooglePage() {
    }

    public static SelenideElement searchLine = $(By.name("q"));
    public static SelenideElement visibleBlancCalc = $("#search .g");


    public void search(String word) {
        searchLine.setValue(word).pressEnter();
        visibleBlancCalc.shouldHave(Condition.text("Калькулятор онлайн"));
    }

}