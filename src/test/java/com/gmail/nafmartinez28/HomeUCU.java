package com.gmail.nafmartinez28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeUCU {

    private WebDriver driver;

    // Elementos en el footer
    //UNIVERSIDAD
    private By nosotros = By.cssSelector("#footer > div.col-md-8.col-sm-12 > div > div:nth-child(1) > ul > li:nth-child(2) > a");
    private By calendarioAcademico = By.cssSelector("#footer > div.col-md-8.col-sm-12 > div > div:nth-child(1) > ul > li:nth-child(3) > a");
    private By directorioTelefonico = By.cssSelector("#footer > div.col-md-8.col-sm-12 > div > div:nth-child(1) > ul > li:nth-child(4) > a");
    private By unidadesAcademicas = By.cssSelector("#footer > div.col-md-8.col-sm-12 > div > div:nth-child(1) > ul > li:nth-child(5) > a");
    private By alumni = By.cssSelector("#footer > div.col-md-8.col-sm-12 > div > div:nth-child(1) > ul > li:nth-child(6) > a");
    private By portalLaboral = By.cssSelector("#footer > div.col-md-8.col-sm-12 > div > div:nth-child(1) > ul > li:nth-child(7) > a");
    private By biblioteca = By.cssSelector("#footer > div.col-md-8.col-sm-12 > div > div:nth-child(1) > ul > li:nth-child(8) > a");
    private By clinicaUniversitariaDeLaSalud = By.cssSelector("#footer > div.col-md-8.col-sm-12 > div > div:nth-child(1) > ul > li:nth-child(9) > a");

    // Locators
    private By linkCampus = By.id("newLocation");
   // private By linkCampusSalto = By.cssSelector("#newLocation > option:nth-child(2)");

    // Constructor
    public HomeUCU(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos de la página
    public void clickALoLoco() {
        // Cambiar del campus de la home a la web del Campus Salto
        driver.findElement(nosotros).click(); System.out.println("Funcionó el click en "+ nosotros);
        driver.findElement(calendarioAcademico).click(); System.out.println("Funcionó el click en "+ calendarioAcademico);
        driver.findElement(directorioTelefonico).click(); System.out.println("Funcionó el click en "+ directorioTelefonico);
        driver.findElement(unidadesAcademicas).click(); System.out.println("Funcionó el click en "+ unidadesAcademicas);
        driver.findElement(alumni).click(); System.out.println("Funcionó el click en "+ alumni);
        driver.findElement(portalLaboral).click(); System.out.println("Funcionó el click en "+ portalLaboral);
        driver.findElement(biblioteca).click(); System.out.println("Funcionó el click en "+ biblioteca);
        driver.findElement(clinicaUniversitariaDeLaSalud).click(); System.out.println("Funcionó el click en "+ clinicaUniversitariaDeLaSalud); 
        driver.findElement(linkCampus).click(); System.out.println("Funcionó el click en "+ linkCampus);

    }
    

}