package com.example.seleniumtestapi;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {
    public int count() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LUCALAM\\eclipse-workspace\\ispw\\SeleniumTestAPI\\src\\test\\java\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://translate.google.it/?hl=it");

        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[1]/div[4]/div[1]/div[1]/form[2]/div/div/button/span")).click();

        driver.findElement(By.xpath("//*[@id=\"i12\"]/span[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div/div[2]/div[3]/c-wiz[1]/span/span/div/textarea")).sendKeys("forza Roma");

        Thread.sleep(4000);

        String trad = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div/div[2]/div[3]/c-wiz[2]/div/div[8]")).getText();

        String traduction = trad.replace("Controlla i dettagli", "");
        System.out.println(traduction);
        driver.close();

        List<String> parole = new java.util.ArrayList<>(List.of(traduction.split("\\s")));

        return parole.size();

    }
}