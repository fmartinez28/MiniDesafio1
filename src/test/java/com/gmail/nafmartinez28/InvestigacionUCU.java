package com.gmail.nafmartinez28;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvestigacionUCU {
    private WebDriver driver;

    private By investigadoresTitle = By.cssSelector("#grupo-personas2 > div:nth-child(1) > div > h2");
    private By investigadoresPrevButton = By.cssSelector("#carousel-4-0 > div:nth-child(2) > div:nth-child(1)");
    private By investigadoresNextButton = By.cssSelector("#carousel-4-0 > div:nth-child(2) > div:nth-child(2)");

    private By quoteNext = By.cssSelector("#carousel-1-0 > div.owl-nav > div:nth-child(2)");

    
    public InvestigacionUCU(WebDriver driver) {
        this.driver = driver;
    }

    public void meetInvestigadores(){
        driver.findElement(investigadoresPrevButton).click();
        driver.findElement(investigadoresPrevButton).click();
        driver.findElement(investigadoresPrevButton).click();
        driver.findElement(investigadoresNextButton).click();
        driver.findElement(investigadoresNextButton).click();
        driver.findElement(investigadoresNextButton).click();
        driver.findElement(investigadoresNextButton).click();
        driver.findElement(investigadoresNextButton).click();
        driver.findElement(investigadoresNextButton).click();
    }

    public void checkInspirationalQuotesOrSomethingLol(){
        WebElement next = driver.findElement(quoteNext);
        for(int i = 0; i < 10; i++){
            next.click();
        }
    }
}
