package com.example.seleniumtest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import dev.failsafe.internal.util.Assert;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
/*
    @BeforeEach
    public void setUp() {
        open("https://www.jetbrains.com/");
    }

    @Test
    public void search() {
        mainPage.searchButton.click();

        $("[data-test='search-input']").sendKeys("Selenium");
        $("button[data-test='full-search-button']").click();

        $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
    }

    @Test
    public void toolsMenu() {
        mainPage.toolsMenu.click();

        $("div[data-test='main-submenu']").shouldBe(visible);
    }

    @Test
    public void navigationToAllTools() {
        mainPage.seeAllToolsButton.click();

        $("#products-page").shouldBe(visible);

        assertEquals("All Developer Tools and Products by JetBrains", Selenide.title());
    }
*/
    @Test
    void testGetDollar() {
        MainPage tester = new MainPage();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LUCALAM\\eclipse-workspace\\ispw\\SeleniumTest\\src\\driver\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        assertTrue(tester.getDollar(driver) > 1.05);
        driver.close();
    }
}
