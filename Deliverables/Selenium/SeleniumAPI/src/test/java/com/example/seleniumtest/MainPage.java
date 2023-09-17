package com.example.seleniumtest;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {
    public SelenideElement seeAllToolsButton = $("a.wt-button_mode_primary");
    public SelenideElement toolsMenu = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");

    public static void openSite(WebDriver driver){
        driver.get("https://www.ansa.it/");
        driver.findElement(By.xpath("//*[@id=\"iubenda-cs-banner\"]/div/div/div/div[3]/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"iubenda-cs-banner\"]/div/div/div/div[3]/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"iubenda-cs-banner\"]/div/div/div/div[3]/div[2]/button")).click();

   }


    public static double getDollar(WebDriver driver){
        openSite(driver);
        WebElement TxBoxContent = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/section[1]/div/div[1]/table[2]/tbody/tr[1]/td[2]"));
        double dollar = Double.parseDouble(TxBoxContent.getText());
        return dollar;
    }

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LUCALAM\\eclipse-workspace\\ispw\\SeleniumTest\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println(getDollar(driver));
        driver.close();
    }

}