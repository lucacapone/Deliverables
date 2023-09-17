package com.example.seleniumtestapi;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    @Test
    public void TestSelenium() throws Exception {
        MainPage traduct = new MainPage();
        int count = traduct.count();
        System.out.println(count);
        assertTrue(count > 1);
    }
}