package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalcPage {
    public CalcPage() {
    }

    public static SelenideElement one = $$("[role=button]").findBy(text("1"));
    public static SelenideElement two = $$("[role=button]").findBy(text("2"));
    public static SelenideElement three = $$("[role=button]").findBy(text("3"));
    public static SelenideElement plus = $$("[role=button]").findBy(text("+"));
    public static SelenideElement minus = $$("[role=button]").findBy(text("−"));
    public static SelenideElement multip = $$("[role=button]").findBy(text("×"));
    public static SelenideElement equals = $$("[role=button]").findBy(text("="));

    public static SelenideElement lineAction = $("[class=vUGUtc]");

    public static SelenideElement result = $("#cwos");

}