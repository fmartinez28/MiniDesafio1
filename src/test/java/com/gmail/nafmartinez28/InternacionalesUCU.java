package com.gmail.nafmartinez28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternacionalesUCU {

    private WebDriver driver;
    private By acordeones = By.cssSelector("#centro_acordeonesPROY > div.row");
    private By locSelector = By.id("newLocation");
    
    public InternacionalesUCU(WebDriver driver){
        this.driver = driver;
    }

    public void openAcordeones(){
        for(int i = 2; i < 10; i++){
            System.out.println(String.format("div:nth-child(%s)", i));
            driver.findElement(acordeones.cssSelector(String.format("div:nth-child(%s) > div.accordion-btn", i))).click();
        }
    }
    public void changeLocationSalto(){
        driver.findElement(locSelector.cssSelector("option:nth-child(2)")).click();
    }
}
