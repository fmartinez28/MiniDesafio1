package com.gmail.nafmartinez28;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExperienciaUCU {
    private WebDriver driver;

    // Elementos en los accordions de actividades
    private By pastoral = By.cssSelector("#programas > div.row > div:nth-child(1) > h5");
    private By deporte = By.cssSelector("#programas > div.row > div:nth-child(2) > h5");
    private By expresionArtistica = By.cssSelector("#programas > div.row > div:nth-child(3) > h5");

    public ExperienciaUCU(WebDriver driver) {
        this.driver = driver;
    }

    public void openActividadesAccordions(){
        driver.findElement(pastoral).click();
        driver.findElement(deporte).click();
        driver.findElement(expresionArtistica).click();
    }

    public void closeActividadesAccordions(){
        driver.findElement(pastoral).click();
        driver.findElement(deporte).click();
        driver.findElement(expresionArtistica).click();
    }
}
